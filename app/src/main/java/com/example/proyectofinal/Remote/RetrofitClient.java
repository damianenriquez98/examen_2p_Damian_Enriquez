package com.example.proyectofinal.Remote;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static Retrofit instance;

    public static Retrofit getInstance() {
        if (instance==null)
            instance=new Retrofit.Builder()
                    //https://wsventa202110817231843.azurewebsites.net/api/user/login
                            .baseUrl("https://wsventa202110817231843.azurewebsites.net/api/")
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
        return instance;
    }
}
