package com.victormanuel.android.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mCampoPeso;
    private EditText mCampoEstatura;
    private Button mBotonCalcular;
    private Button mBotonLimpiar;
    private TextView mImcTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCampoPeso = findViewById(R.id.campo_peso);
        mCampoEstatura = findViewById(R.id.campo_estatura);
        mBotonCalcular= findViewById(R.id.boton_calcular);
        mBotonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mCampoPeso.getText().toString();
                double peso = Double.parseDouble(s);
                s=mCampoEstatura.getText().toString();
                double estatura = Double.parseDouble(s);
                double imc = peso / Math.pow(estatura, 2);
                mImcTextView.setText(Double.toString(imc));

            }
        });

        mBotonLimpiar = findViewById(R.id.boton_limpiar);
        mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCampoPeso.setText("");
                mCampoEstatura.setText("");
                mImcTextView.setText("");
            }
        });
        mBotonLimpiar= findViewById(R.id.boton_limpiar);
        mImcTextView = findViewById(R.id.mImcTextView);

    }
}
