package com.example.terri.navegacionactivity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    //Método del botón anterior
    public void anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    //String nombre = getIntent().getExtras().getString("nombre");

    //Toast toast = new Toast.getText(this, nombre, Toast.LENGTH_LONG);
}
//putExtra(id, variable)