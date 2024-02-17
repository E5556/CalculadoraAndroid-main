package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText Entrada1;

    private EditText Entrada2;

    private TextView Resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Entrada1=findViewById(R.id.Ent1);
        Entrada2=findViewById(R.id.Ent2);
        Resultado=findViewById(R.id.Mostrar);

    }
    public void sumar(View view){
        int sumatoria = Integer.parseInt(Entrada1.getText().toString())+Integer.parseInt(Entrada2.getText().toString());
        Resultado.setText(String.valueOf(sumatoria));
    }

    public void Extendida(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}