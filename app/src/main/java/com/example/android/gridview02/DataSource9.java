package com.example.android.gridview02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 03/09/2016.
 */
public class DataSource9 {

    static List DEPORTIVAS = new ArrayList<Peliculas>();

    static{

        DEPORTIVAS.add(new Peliculas("Deportivas 01",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        DEPORTIVAS.add(new Peliculas("Deportivas 02",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));
        DEPORTIVAS.add(new Peliculas("Deportivas 03",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
        DEPORTIVAS.add(new Peliculas("Deportivas 04",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        DEPORTIVAS.add(new Peliculas("Deportivas 05",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
        DEPORTIVAS.add(new Peliculas("Deportivas 06",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));


    }
}
