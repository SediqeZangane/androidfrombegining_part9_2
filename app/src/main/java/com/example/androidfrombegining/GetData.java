package com.example.androidfrombegining;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {

    //        String BaseUrl = "http://dl.android-studio.ir/files/";
//    String BaseUrl = "https://run.mocky.io/v3/";

    String BaseUrl = "https://run.mocky.io/v3/";

    //       @GET("city.json")
//    @GET("415e0904-2f9a-4084-be43-7976b09df08c")

    @GET("3a0d42fb-d8c5-4972-88fe-50cb43c5bab9")
    Call<List<ExerciseForRetrofitCityModel>> getCity();
}

