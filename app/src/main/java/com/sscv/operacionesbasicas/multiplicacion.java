package com.sscv.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class multiplicacion extends AppCompatActivity {
    EditText edNumM1,edNumM2;
    TextView tvResultadoM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        edNumM1=findViewById(R.id.numM);
        edNumM2=findViewById(R.id.numM2);
        tvResultadoM=findViewById(R.id.lblresultadoM);
    }
    public void calcularMultiplicacion(View v){

        double num1=Double.parseDouble(edNumM1.getText().toString());
        int num2=Integer.parseInt(edNumM2.getText().toString());
        double resultado=num1*num2;
        tvResultadoM.setText(resultado+"");



    }
}