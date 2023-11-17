package com.sscv.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class division extends AppCompatActivity {
    EditText edNumD1,edNumD2;
    TextView tvResultadoD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        edNumD1=findViewById(R.id.numD);
        edNumD2=findViewById(R.id.numD2);
        tvResultadoD=findViewById(R.id.lblresultadoD);
    }

    public void calcularDivision(View v){

        double num1=Double.parseDouble(edNumD1.getText().toString());
        int num2=Integer.parseInt(edNumD2.getText().toString());
        double resultado=num1/num2;
        tvResultadoD.setText(resultado+"");


        Button buttonMenu = findViewById(R.id.btnMenu2);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(division.this, menu.class);


                startActivity(intent);
            }
        });





    }
}