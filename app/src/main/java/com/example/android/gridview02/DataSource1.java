package com.example.android.gridview02;

import java.util.ArrayList;
import java.util.List;

public class DataSource1 {
    static List ACCION = new ArrayList<Peliculas>();

    static{


            ACCION.add(new Peliculas("Accion 01",""+""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));
        ACCION.add(new Peliculas("Accion 02",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
        ACCION.add(new Peliculas("Accion 03",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
        ACCION.add(new Peliculas("Accion 04",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        ACCION.add(new Peliculas("Accion 05",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
        ACCION.add(new Peliculas("Accion 06",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));


    }
}
