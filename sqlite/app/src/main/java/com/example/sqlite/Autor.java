package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

import com.example.sqlite.BaseDatos;

import java.util.ArrayList;

public class Autor {
    private int pk_autor;
    private String nombre;
    private String primer_Apellido;
    private String segundo_apellido;
    private BaseDatos admin;
    private SQLiteDatabase base_datos;

    public Autor(){
        this.pk_autor = 0;
        this.nombre = "";
        this.primer_Apellido = "";
        this.segundo_apellido = "";
    }
    public Autor(int pk_autor, String nombre, String primer_Apellido, String segundo_apellido){
        this.pk_autor = pk_autor;
        this.nombre = nombre;
        this.primer_Apellido = primer_Apellido;
        this.segundo_apellido = segundo_apellido;
    }

    private void inicializar_db(Context context){
        admin = new BaseDatos(
                context,
                Config_BD.name_bd,
                null,
                Config_BD.version_bd);
        base_datos = admin.getWritableDatabase();
    }
    public int getPk_autor(){ return pk_autor; }
    public void setPk_autor (int pk_autor) { this.pk_autor = pk_autor; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }


    public boolean save (Context context){
        this.inicializar_db(context);
        ContentValues valores_objeto = new ContentValues();
        if(this.pk_autor == 0){
            //r e g i s t r a r
            valores_objeto.put("nombre", this.nombre);
            valores_objeto.put("primer_Apellido", this.primer_Apellido);
            valores_objeto.put("segundo_apellido", this.segundo_apellido);

            base_datos.insert("autor", null, valores_objeto);
            base_datos.close();

            return true;
        }else{
            //a c t u a l i z a r
            valores_objeto.put("nombre", this.pk_autor);
            valores_objeto.put("primer_Apellido", this.primer_Apellido);
            valores_objeto.put("segundo_apellido", this.segundo_apellido);

            int acualizado = base_datos.update("autor",
                    valores_objeto,
                    "pk_autor=" + this.pk_autor,
                    null);
            base_datos.close();
            if(acualizado == 1){
                return true;
            }
        }
        return false;
    }

    public void get (Context context, int pk_autor){
        this.inicializar_db(context);
        String query = "select * from autor where pk_autor = " + pk_autor;
        //l e e r    d e    b a s e    d e    d a t o s
        Cursor registro = base_datos.rawQuery(query, null);
        if(registro.moveToFirst()){
            this.pk_autor = registro.getInt(0);
            this.nombre = registro.getString(1);
            this.primer_Apellido = registro.getString(2);
            this.segundo_apellido = registro.getString(3);
        }
        base_datos.close();
    }
    /*public ArrayList <Autor> get_all(Context context){

    }*/
    public void delete (Context context){
        this.inicializar_db(context);
        //e l i m i n a r
        int eliminado = base_datos.delete("autor",
                "pk_autor" + this.pk_autor,
                null);
        base_datos.close();

        if(eliminado == 1){
            this.pk_autor = 0;
            this.nombre = "";
            this.primer_Apellido = "";
            this.segundo_apellido = "";
        }
    }
}

//DESCARGAR COMPOSTER INSTALL