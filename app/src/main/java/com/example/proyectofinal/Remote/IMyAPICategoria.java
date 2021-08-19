package com.example.proyectofinal.Remote;

import com.example.proyectofinal.Model.tblCategoria;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;


public interface IMyAPICategoria {
    @GET("api/Categoria")
    Observable<String>mostrarCategorias(@Body tblCategoria categoria);
}
