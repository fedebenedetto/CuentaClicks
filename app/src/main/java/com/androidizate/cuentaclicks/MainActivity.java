package com.androidizate.cuentaclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declaro las variables locales de la clase (convencion para saber que controles tiene la activity)
    private Integer clicks = 0;
    EditText cantidadDeClicks;
    Button botonClicks;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Obtengo las referencias a los controles
        cantidadDeClicks = (EditText)findViewById(R.id.tv_contador);
        botonClicks = (Button)findViewById(R.id.btn_sumar);
        
        //Defino el comportamiento del boton
        botonClicks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadDeClicks.setText(String.valueOf(sumarClicks()));
            }
        }
    }
                                       
    private Integer sumarClicks(){
        return clicks += 1;
    }
    
    /*
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
    */
}
