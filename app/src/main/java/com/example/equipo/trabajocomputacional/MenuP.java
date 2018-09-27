package com.example.equipo.trabajocomputacional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuP extends AppCompatActivity {
   Button boton1,boton2,boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_p);

        boton1=findViewById(R.id.boton1);
        boton2=findViewById(R.id.boton2);
        boton3=findViewById(R.id.boton3);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PantallaBlack=new Intent(MenuP.this,Black_Sholes.class);
                startActivity(PantallaBlack);

            }
        });

    }
}
