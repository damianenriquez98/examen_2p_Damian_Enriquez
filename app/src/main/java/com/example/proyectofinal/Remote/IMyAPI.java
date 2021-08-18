package com.example.proyectofinal.Remote;

import com.example.proyectofinal.Model.tblUser;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IMyAPI {
    //https://localhost:44359/api/User/login
    @POST("api/User/register")
    Observable<String> registerUser(@Body tblUser user);

    @POST("api/User/login")
    Observable<String> loginUser(@Body tblUser user);
}
