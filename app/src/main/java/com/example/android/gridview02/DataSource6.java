package com.example.android.gridview02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 03/09/2016.
 */
public class DataSource6 {

    static List ROMANTICAS = new ArrayList<Peliculas>();

    static{

        ROMANTICAS.add(new Peliculas("Románticas 01",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        ROMANTICAS.add(new Peliculas("Románticas 02",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));
        ROMANTICAS.add(new Peliculas("Románticas 03",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
        ROMANTICAS.add(new Peliculas("Románticas 04",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
        ROMANTICAS.add(new Peliculas("Románticas 05",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
        ROMANTICAS.add(new Peliculas("Románticas 06",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));


    }
}
