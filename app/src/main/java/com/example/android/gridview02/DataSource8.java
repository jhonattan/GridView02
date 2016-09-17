package com.example.android.gridview02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 03/09/2016.
 */
public class DataSource8 {

    static List CLASICAS = new ArrayList<Peliculas>();

    static{

        CLASICAS.add(new Peliculas("Clásicas 01",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        CLASICAS.add(new Peliculas("Clásicas 02",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));
        CLASICAS.add(new Peliculas("Clásicas 03",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
        CLASICAS.add(new Peliculas("Clásicas 04",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        CLASICAS.add(new Peliculas("Clásicas 05",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
        CLASICAS.add(new Peliculas("Clásicas 06",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));


    }
}
