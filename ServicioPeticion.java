package com.example.pruebasconcurrencia;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioPeticion {
   /* @GET("users/{user}/repos")*/
    @GET("muestrajson.php")
    Call<Alumnos> listarAlumnos();
}
