package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class destinatario extends AppCompatActivity {
    Button atras, continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinatario);
        atras=(Button)findViewById(R.id.btnatras);
        atras.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back =new Intent(destinatario.this, ventanacomprageneral.class);
                startActivity(back);
            }
        }));
        continuar=(Button)findViewById(R.id.btnsiguiente);
        continuar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next =new Intent(destinatario.this, Comprar.class);
                startActivity(next);
            }
        }));
    }
}
