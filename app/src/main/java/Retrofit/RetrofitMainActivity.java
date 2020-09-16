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
    }

    public void GetEmployes() {
        btnGetEmployes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofitClient = RetrofitClient.initialize();
                RetrofitServices services = retrofitClient.create(RetrofitServices.class);
                Call<List<Example>> getEmp = services.getEmployees();
                getEmp.enqueue(new Callback<List<Example>>() {
                    @Override
                    public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {
                        if (response == null) {
                            Toast.makeText(RetrofitMainActivity.this, "is null", Toast.LENGTH_SHORT).show();
                        } else {
                            List<Example> list = response.body();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Example>> call, Throwable t) {
                        Toast.makeText(RetrofitMainActivity.this,"Error!!!!!!!",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }

    public void CreateNewEmployes() {
        btnCreateNewEmployes.setOnClickListener(v -> {

        });

    }

    public void GetPosts() {
        btnGetPosts.setOnClickListener(v -> {

        });
    }

}