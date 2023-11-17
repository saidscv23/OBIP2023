package com.sscv.operacionesbasicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button buttonSuma = findViewById(R.id.botonSuma);

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menu.this, MainActivity.class);


                startActivity(intent);
            }
        });

        Button buttonMultiplicacion = findViewById(R.id.botonMultiplicaion);


        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menu.this, multiplicacion.class);


                startActivity(intent);
            }
        });

        Button buttonResta = findViewById(R.id.botonResta);

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menu.this, resta.class);

                startActivity(intent);
            }
        });
    }
}
