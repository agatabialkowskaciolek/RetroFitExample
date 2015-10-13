package com.example.aciolekwaw.retrofitexample;

/**
 * Created by aciolekwaw on 2015-10-13.
 */
import retrofit.Callback;
import retrofit.http.GET;


public interface RestInterface {

    @GET("/weather?q=London,uk")
    void getWheatherReport(Callback<Model>cb);

}