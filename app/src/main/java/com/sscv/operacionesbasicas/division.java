package com.sscv.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class division extends AppCompatActivity {
    EditText edNumD1,edNumD2;
    TextView tvResultadoR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        edNumD1=findViewById(R.id.numD);
        edNumD2=findViewById(R.id.numD2);
        tvResultadoR=findViewById(R.id.lblresultadoD);
    }

    public void calcularDivision(View v){

        double num1=Double.parseDouble(edNumD1.getText().toString());
        int num2=Integer.parseInt(edNumD2.getText().toString());
        double resultado=num1-num2;
        tvResultadoR.setText(resultado+"");



    }
}