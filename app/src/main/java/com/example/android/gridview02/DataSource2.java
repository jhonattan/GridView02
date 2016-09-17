package com.example.android.gridview02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 27/08/2016.
 */
public class DataSource2 {

        static List COMEDIAS = new ArrayList<Peliculas>();

        static{

            COMEDIAS.add(new Peliculas("Comedias 01",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
            COMEDIAS.add(new Peliculas("Comedias 02",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
            COMEDIAS.add(new Peliculas("Comedias 03",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.yellow,R.drawable.comprar));
            COMEDIAS.add(new Peliculas("Comedias 04",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.green,R.drawable.comprar));
            COMEDIAS.add(new Peliculas("Comedias 05",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.blue,R.drawable.comprar));
            COMEDIAS.add(new Peliculas("Comedias 06",""+(int)(Math.random()*5+1)+" horas","S/. "+(int)(Math.random()*15+1),R.drawable.red,R.drawable.comprar));


        }

}
