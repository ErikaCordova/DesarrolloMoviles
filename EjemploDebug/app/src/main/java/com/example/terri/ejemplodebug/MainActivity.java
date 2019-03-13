package com.example.terri.ejemplodebug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int numero_1;
    private int numero_2;
    private int resultado;
    private List<String> Lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*numero_1 = 10;
        numero_2 = 4;
        resultado = numero_1 +  numero_2;
        */

        //Declarar la lista
        Lista = new ArrayList<>();

        //Se añaden los campos a la lista
        Lista.add("Robert");
        Lista.add("Sandra");
        Lista.add("Paola");

        //Crea el apuntador que recorre la lista
        Iterator iter = Lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
