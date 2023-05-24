package com.example.proyectofinal;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class Inicio extends AppCompatActivity {
    Button busc, j1, j2, j3, j4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        busc=(Button) findViewById(R.id.btnbuscar);
        busc.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ventbusc =new Intent(Inicio.this, Buscador.class);
                startActivity(ventbusc);
            }
        }));
        j1=(Button)findViewById(R.id.btn1);
        j1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compraj1 =new Intent(Inicio.this, ventanacomprageneral.class);
                startActivity(compraj1);
            }
        }));
        j2=(Button)findViewById(R.id.btn2);
        j2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compraj2 =new Intent(Inicio.this, ventanacomprageneral.class);
                startActivity(compraj2);
            }
        }));
        j3=(Button)findViewById(R.id.btn3);
        j3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compraj3 =new Intent(Inicio.this, ventanacomprageneral.class);
                startActivity(compraj3);
            }
        }));
        j4=(Button)findViewById(R.id.btn4);
        j4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compraj4 =new Intent(Inicio.this, ventanacomprageneral.class);
                startActivity(compraj4);
            }
        }));
    }

}

