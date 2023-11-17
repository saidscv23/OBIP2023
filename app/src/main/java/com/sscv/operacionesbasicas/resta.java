package com.sscv.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {
    EditText edNumR1,edNumR2;
    TextView tvResultadoR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        edNumR1=findViewById(R.id.numD);
        edNumR2=findViewById(R.id.numD2);
        tvResultadoR=findViewById(R.id.lblresultadoD);
    }

    public void calcularResta(View v){

        double num1=Double.parseDouble(edNumR1.getText().toString());
        int num2=Integer.parseInt(edNumR2.getText().toString());
        double resultado=num1-num2;
        tvResultadoR.setText(resultado+"");





        Button buttonMenu = findViewById(R.id.btnMenu3);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(resta.this, menu.class);


                startActivity(intent);
            }
        });









    }
}