package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView txtMensagem = (TextView) findViewById(R.id.cliente);
        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){

                txtMensagem.setText(params.getString("cliente"));
            }
        }

        Button btnCadastrar = (Button)  findViewById(R.id.btnRegistro);
        btnCadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,Dashboard.class);

        EditText nota1 = (EditText) findViewById(R.id.nota1);
        EditText nota2 = (EditText) findViewById(R.id.nota2);
        EditText nota3 = (EditText) findViewById(R.id.nota3);
        EditText nota4 = (EditText) findViewById(R.id.nota4);



        Bundle params = new Bundle();
        params.putDouble("nota1", Double.parseDouble(nota1.getText().toString()));
        params.putDouble("nota2", Double.parseDouble(nota2.getText().toString()));
        params.putDouble("nota3", Double.parseDouble(nota3.getText().toString()));
        params.putDouble("nota4", Double.parseDouble(nota4.getText().toString()));
        it.putExtras(params);
        startActivity(it);
    }
}
