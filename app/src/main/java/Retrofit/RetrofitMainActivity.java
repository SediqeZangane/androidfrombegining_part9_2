package Retrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidfrombegining.ExerciseForRetrofit;
import com.example.androidfrombegining.R;

import java.util.List;

public class RetrofitMainActivity extends AppCompatActivity {
    Button btnGetEmployes, btnCreateNewEmployes, btnGetPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_main);

        btnGetEmployes = findViewById(R.id.get_employes);
        btnCreateNewEmployes = findViewById(R.id.create_new);
        btnGetPosts = findViewById(R.id.get_post);
        GetEmployes();
        CreateNewEmployes();
    }


    public void GetEmployes() {
        btnGetEmployes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofitClient = RetrofitClient.initialize();
                RetrofitServices services = retrofitClient.create(RetrofitServices.class);
                Call<Example> getEmp = services.getEmployees();
                getEmp.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        if (response == null) {
                            Toast.makeText(RetrofitMainActivity.this, "is null", Toast.LENGTH_SHORT).show();
                        } else {
                            Example example = response.body();
                        }
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Toast.makeText(RetrofitMainActivity.this, "Error!!!!!!!", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }

    public void CreateNewEmployes() {
        btnCreateNewEmployes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofitClient = RetrofitClient.initialize();
                RetrofitServices services = retrofitClient.create(RetrofitServices.class);
                CreateData createData = new CreateData("ali", "1000", "20", null);
                Call<CreateData> newEmployee = services.create(createData);
                newEmployee.enqueue(new Callback<CreateData>() {
                    @Override
                    public void onResponse(Call<CreateData> call, Response<CreateData> response) {
                        if (response == null) {
                            Toast.makeText(RetrofitMainActivity.this, "is null", Toast.LENGTH_SHORT).show();
                        } else {
                            CreateData data = response.body();
                        }
                    }


                    @Override
                    public void onFailure(Call<CreateData> call, Throwable t) {
                        Toast.makeText(RetrofitMainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }

    public void GetPosts() {
        btnGetPosts.setOnClickListener(v -> {

        });
    }

}