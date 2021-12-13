package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        TextView txtMensagem = (TextView) findViewById(R.id.resultado);
        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                Double resultado =  (params.getDouble("nota1") + params.getDouble("nota2") + params.getDouble("nota3") + params.getDouble("nota4"))/4;
                txtMensagem.setText(resultado.toString());
            }
        }

        Button btnVoltar = (Button)  findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,Home.class);
        startActivity(it);
    }
}
