package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Comprar extends AppCompatActivity {
    Button cancelar, completar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar);
        cancelar=(Button)findViewById(R.id.btncancelar);
        cancelar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canc =new Intent(Comprar.this, Inicio.class);
                startActivity(canc);
            }
        }));
        completar=(Button)findViewById(R.id.btncompletar);
        completar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comp =new Intent(Comprar.this, CompraCompletada.class);
                startActivity(comp);
            }
        }));
    }
}
