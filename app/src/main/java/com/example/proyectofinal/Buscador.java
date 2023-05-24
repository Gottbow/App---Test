package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;

public class Buscador extends AppCompatActivity implements View.OnClickListener {
    SearchView buscar;
    Button volver, juegobuscado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
        buscar=(SearchView)findViewById(R.id.sv1);
        volver=(Button)findViewById(R.id.btnvolver);
        volver.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canc =new Intent(Buscador.this, Inicio.class);
                startActivity(canc);
            }
        }));

    }

    @Override
    public void onClick(View v) {
        String busca=String.valueOf(volver.getText().toString());
        String juego1="Hitman 3";
        String juego2="Injustice 2";
        String juego3="Borderlands 3";
        String juego4="DragonBallKakarot";
        if (busca==juego1){
            juegobuscado.append("" + juego1);
            juegobuscado.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent jb =new Intent(Buscador.this, Producto.class);
                    startActivity(jb);
                }
            }));
        }
        if (busca==juego2){
            juegobuscado.append("" + juego2);
            juegobuscado.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent jb =new Intent(Buscador.this, Producto.class);
                    startActivity(jb);
                }
            }));
        }
        if (busca==juego3){
            juegobuscado.append("" + juego3);
            juegobuscado.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent jb =new Intent(Buscador.this, Producto.class);
                    startActivity(jb);
                }
            }));
        }
        if (busca==juego4){
            juegobuscado.append("" + juego4);
            juegobuscado.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent jb =new Intent(Buscador.this, Producto.class);
                    startActivity(jb);
                }
            }));
        }
    }
}
