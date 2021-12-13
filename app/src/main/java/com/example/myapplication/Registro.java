package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class Registro extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);



        Button btnRetornar = (Button)  findViewById(R.id.btnCancelar);
        btnRetornar.setOnClickListener(this);
        Button btnConfirmar = (Button)  findViewById(R.id.btnConfirmar);
        btnRetornar.setOnClickListener(this);
        btnConfirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,Dashboard.class);

        EditText nome = (EditText) findViewById(R.id.nome);
        EditText sobrenome = (EditText) findViewById(R.id.sobrenome);




        Bundle params = new Bundle();
            params.putString("cliente", nome.toString() + " " + sobrenome.toString());
        it.putExtras(params);
        startActivity(it);
    }
}
