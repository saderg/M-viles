package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botonSuma;
    private Button botonResta;
    private Button botonMulti;
    private Button botonDividir;

    private TextView respuesta;

    private EditText edit_numero1;
    private EditText edit_numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta = findViewById(R.id.respuesta);
        edit_numero1 = findViewById(R.id.numero1);
        edit_numero2 = findViewById(R.id.numero2);


        botonSuma = findViewById(R.id.sumaBoton);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText (suma (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");

            }
        });

        botonResta = findViewById(R.id.restaBoton);
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText (resta (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");

            }
        });

        botonMulti = findViewById(R.id.multiplicarBoton);
        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText (multiplicación (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");

            }
        });
        botonDividir = findViewById(R.id.dividirBoton);
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText (dividir (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");

            }
        });


    }

    public int suma (int a, int b){

        return a+b;

    }
    public int resta (int a, int b){


        return a-b;

    }
    public int multiplicación (int a, int b){


        return a*b;

    }
    public int dividir (int a, int b){
        int respuesta = 0;
        if(b!=0){
            respuesta = a/b;
        }
        return a/b;

    }

}