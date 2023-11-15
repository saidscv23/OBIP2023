package com.sscv.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {
    EditText edNumR1,edNumR2;
    TextView tvResultadoR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        edNumR1=findViewById(R.id.numR);
        edNumR2=findViewById(R.id.numR2);
        tvResultadoR=findViewById(R.id.lblresultadoR);
    }

    public void calcularResta(View v){

        double num1=Double.parseDouble(edNumR1.getText().toString());
        int num2=Integer.parseInt(edNumR2.getText().toString());
        double resultado=num1-num2;
        tvResultadoR.setText(resultado+"");



    }
}