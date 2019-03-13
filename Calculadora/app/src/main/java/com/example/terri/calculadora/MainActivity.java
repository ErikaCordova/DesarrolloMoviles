package com.example.terri.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    //Declarar las variables que vamos a utilizar
    private EditText inp_numero;
    private Button btn_action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincular  input
        inp_numero = (EditText) findViewById(R.id.inp_numero);

        //Fijar texto
        inp_numero.setText("123456");
    }

    public void boton_presionado(View view){
        //Leyendo contenido de input
        String texto = inp_numero.getText().toString();

        //Para ver mensajes.
        Toast toast = Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG);
        toast.show();
    }

}
