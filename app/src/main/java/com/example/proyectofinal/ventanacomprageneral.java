package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ventanacomprageneral extends AppCompatActivity {
    Button yo, otro, atras1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventanacomprageneral);
        yo=(Button)findViewById(R.id.btnyo);
        yo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parami =new Intent(ventanacomprageneral.this, Comprar.class);
                startActivity(parami);
            }
        }));
        otro=(Button)findViewById(R.id.btnotro);
        otro.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comoregalo =new Intent(ventanacomprageneral.this, destinatario.class);
                startActivity(comoregalo);
            }
        }));
        atras1=(Button)findViewById(R.id.btnback);
        atras1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar =new Intent(ventanacomprageneral.this, Inicio.class);
                startActivity(regresar);
            }
        }));
    }
}
