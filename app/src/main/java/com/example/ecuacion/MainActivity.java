package com.example.ecuacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText variableA;
    private EditText variableB;
    private EditText variableC;
    private TextView resultadoMas;
    private TextView resultadoMenos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // casteo
        variableA = (EditText) findViewById(R.id.etVariableA);
        variableB = (EditText) findViewById(R.id.etVariableB);
        variableC = (EditText) findViewById(R.id.etVariableC);
        resultadoMas = (TextView) findViewById(R.id.tvResultadoMas);
        resultadoMenos = (TextView) findViewById(R.id.tvResultadoMenos);
    }

    public void calcular(View view) {
        double numA = Double.parseDouble(variableA.getText().toString());
        double numB = Double.parseDouble(variableB.getText().toString());
        double numC = Double.parseDouble(variableC.getText().toString());
        double res = 0;

        Operacion operacion = new Operacion(numA, numB, numC, res);

        resultadoMas.setText("El resultado en '+' es: "+operacion.operacionMas(numA, numB, numC));
        resultadoMenos.setText("El resultado en '-' es: "+operacion.operacionMenos(numA, numB, numC));

    }


}