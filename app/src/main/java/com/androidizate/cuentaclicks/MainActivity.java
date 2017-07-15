package com.androidizate.cuentaclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_sumar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText loTvContador = (EditText)findViewById(R.id.tv_contador);
                Integer loValor = Integer.parseInt(loTvContador.getText().toString());
                loTvContador.setText((loValor += 1).toString());
            }
        });
    }
}
