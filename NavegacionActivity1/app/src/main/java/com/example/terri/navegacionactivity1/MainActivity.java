package com.example.terri.navegacionactivity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Método del botón siguiente
    public void activity_2(View view){
        Intent siguiente = new Intent(this,Activity_2.class);

        //Intent intent = new Intent(this,Activity_2.class);
        //intent.putExtra("nombre","Erika");

        startActivity(siguiente);

    }
}
