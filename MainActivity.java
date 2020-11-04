package com.example.pruebasconcurrencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.0.59//").addConverterFactory(GsonConverterFactory.create())
                .build();

        ServicioPeticion service = retrofit.create(ServicioPeticion.class);
        Call<Alumnos> llamada_servicio=service.listarAlumnos();
        llamada_servicio.enqueue(new Callback<Alumnos>() {
            @Override
            public void onResponse(Call<Alumnos> call, Response<Alumnos> response) {
                Alumnos a=response.body();
                Log.d("Llamada", a.toString());
            }

            @Override
            public void onFailure(Call<Alumnos> call, Throwable t) {
                Log.d("Llamada", t.getMessage());
            }
        });

    }
}