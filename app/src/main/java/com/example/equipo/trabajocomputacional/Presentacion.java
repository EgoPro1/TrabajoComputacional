package com.example.equipo.trabajocomputacional;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        //timer
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent Pantalla=new Intent(Presentacion.this,MenuP.class);
               startActivity(Pantalla);

            }
        },5000);



    }
}
