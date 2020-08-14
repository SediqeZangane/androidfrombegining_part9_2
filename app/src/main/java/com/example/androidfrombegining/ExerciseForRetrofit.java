package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ExerciseForRetrofit extends AppCompatActivity {
    ListView MyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_for_retrofit);


        init();
        Control();

    }

    private void init() {
        MyListView = findViewById(R.id.List_View);

    }

    private void Control() {

        Retrofit MyRetro = new Retrofit.Builder().baseUrl(GetData.BaseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        GetData GetDataOnline = MyRetro.create(GetData.class);
        Call<List<ExerciseForRetrofitCityModel>> MyCity = GetDataOnline.getCity();
        MyCity.enqueue(new Callback<List<ExerciseForRetrofitCityModel>>() {
            @Override
            public void onResponse(Call<List<ExerciseForRetrofitCityModel>> call, Response<List<ExerciseForRetrofitCityModel>> response) {
                List<ExerciseForRetrofitCityModel> CityList = response.body();
                String[] Cities = new String[CityList.size()];
                for (int i = 0; i < CityList.size(); i++) {
                    Cities[i] = CityList.get(i).getName();
                }
                MyListView.setAdapter(new ArrayAdapter<>(ExerciseForRetrofit.this, android.R.layout.simple_list_item_1, Cities));
            }

            @Override
            public void onFailure(Call<List<ExerciseForRetrofitCityModel>> call, Throwable t) {
                Toast.makeText(ExerciseForRetrofit.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
