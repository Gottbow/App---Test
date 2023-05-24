package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CompraCompletada extends AppCompatActivity implements View.OnClickListener{
    Button volverinicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_completada);
        volverinicio=(Button)findViewById(R.id.btnregresaralinicio);
        volverinicio.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canc =new Intent(CompraCompletada.this, Inicio.class);
                startActivity(canc);
            }
        }));
    }

    @Override
    public void onClick(View v) {
        if (volverinicio.isPressed()==true){
        }
    }
}
