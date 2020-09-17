package Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitServices {
    @GET("employees")
    Call<Example> getEmployees();
    @POST("create")
    Call<CreateData> create(@Body CreateData createData);
}
