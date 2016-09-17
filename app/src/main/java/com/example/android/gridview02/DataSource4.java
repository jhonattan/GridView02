package com.example.android.gridview02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 03/09/2016.
 */
public class DataSource4 {

    static List TERROR = new ArrayList<Peliculas>();

    static{

        TERROR.add(new Peliculas("Terror 01",""+(int)(Math.random()*15+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        TERROR.add(new Peliculas("Terror 02",""+(int)(Math.random()*15+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));
        TERROR.add(new Peliculas("Terror 03",""+(int)(Math.random()*15+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
        TERROR.add(new Peliculas("Terror 04",""+(int)(Math.random()*15+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        TERROR.add(new Peliculas("Terror 05",""+(int)(Math.random()*15+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
        TERROR.add(new Peliculas("Terror 06",""+(int)(Math.random()*15+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));


    }
}
