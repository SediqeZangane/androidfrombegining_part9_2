package Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitServices {
    @GET("employees")
    Call<List<Example>> getEmployees();
}
