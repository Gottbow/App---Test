package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Producto extends AppCompatActivity implements View.OnClickListener{
    Button carrito, regres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        carrito=(Button)findViewById(R.id.btniniciarcompra);
        carrito.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carritocompra =new Intent(Producto.this, ventanacomprageneral.class);
                startActivity(carritocompra);
            }
        }));
        regres=(Button)findViewById(R.id.btnregreso);
        regres.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res =new Intent(Producto.this, Inicio.class);
                startActivity(res);
            }
        }));
    }

    @Override
    public void onClick(View v) {

    }
}
