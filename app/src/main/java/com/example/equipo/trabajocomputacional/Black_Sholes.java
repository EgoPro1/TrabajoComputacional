package com.example.equipo.trabajocomputacional;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Black_Sholes extends AppCompatActivity {

Button boton;
    EditText entrada1,entrada2,entrada3,entrada4,entrada5,entrada6;
   double C,T,r,sigma,X,S ,d1,d2,P;
  String c1,c2,c3,c4,c5,c6;
TextView textView1,textView2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black__sholes);
        boton=findViewById(R.id.boton4);
        entrada1=findViewById(R.id.editText1);
        //entrada2=findViewById(R.id.editText2);
        entrada3=findViewById(R.id.editText3);
        entrada4=findViewById(R.id.editText4);
        entrada5=findViewById(R.id.editText5);
        entrada6=findViewById(R.id.editText6);

        textView1=findViewById(R.id.textView13);
        textView2=findViewById(R.id.textView14);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c1=entrada1.getText().toString();
               // c2=entrada2.getText().toString();
                c3=entrada3.getText().toString();
                c4=entrada4.getText().toString();
                c5=entrada5.getText().toString();
                c6=entrada6.getText().toString();



        if(c1.equals("")||/*c2.equals("")||*/c3.equals("")||c4.equals("")||c5.equals("")||c6.equals(""))
        {

        mensaje();

        }else{

            //C=Double.parseDouble(c1);
            T=Double.parseDouble(c1);
            r=Double.parseDouble(c3);
            sigma=Double.parseDouble(c4);
            X=Double.parseDouble(c5);
            S=Double.parseDouble(c6);

            d1=( Math.log(S/X)+( (r*0.01)+(Math.pow((sigma*0.01),2)/2))*T)/((sigma*0.01)*Math.sqrt(T));
            d2=d1-(sigma*0.01)*Math.sqrt(T);
            P= X * Math.exp((-r*0.01) * T) *ND(-d2) - S * ND(-d1);
            //Random R = new Random();
           // double N =0+ (1 - 0) * R.nextDouble();


            C=S*ND(d1)-X*Math.exp((-r*0.01)*T)*ND(d2);
            textView1.setText("Call :"+String.format("%.4f", C));
            textView2.setText("Put :"+String.format("%.4f", P));
           // textView1.setText(String.valueOf(C));

        }







            }
        });




    }

    public double ND(double x)
        {
        double sum = x, val = x;

        for (int i = 1; i <= 100; i++)
        {
            val *= x * x / (2.0 * i + 1.0);
            sum += val;
        }

        return 0.5 + (sum / Math.sqrt(2.0 * Math.PI)) * Math.exp(-(x * x) / 2.0);
    }






    public void mensaje(){

        Context c=getApplicationContext();
        Toast.makeText(c,"Faltan ingresar valores",Toast.LENGTH_LONG).show();
    }


}


