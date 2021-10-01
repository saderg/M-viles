package com.example.logginchachi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context contextActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contextActividad = this;

        Button btLogin = (Button) this.findViewById(R.id.button);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobarLogin();
            }
        });

    }

    private void comprobarLogin() {

        EditText txtUsuario = (EditText) this.findViewById(R.id.User);
        EditText txtPassword = (EditText) this.findViewById(R.id.password);

        String dataUsuario = txtUsuario.getText().toString();
        String dataPassword = txtPassword.getText().toString();

        if (dataUsuario.equals("") && dataPassword.equals("")){
            Toast.makeText(contextActividad, "No puede estar vacio!!", Toast.LENGTH_LONG).show();

        }

    }
}