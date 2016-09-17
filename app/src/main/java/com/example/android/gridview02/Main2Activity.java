package com.example.android.gridview02;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle bundle = getIntent().getExtras();
        int categoria = bundle.getInt("categoria");


        ListView list = (ListView) findViewById(R.id.listView);


        ArrayAdapter adaptador;
        switch (categoria){
            case 0: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource1.ACCION); break;
            case 1: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource2.COMEDIAS); break;
            case 2: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource3.DRAMAS); break;
            case 3: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource4.TERROR); break;
            case 4: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource5.FICCION); break;
            case 5: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource6.ROMANTICAS); break;
            case 6: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource7.ANIMADOS); break;
            case 7: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource8.CLASICAS); break;
            case 8: adaptador = new PeliculasArrayAdapter<Peliculas>(this, DataSource9.DEPORTIVAS); break;
            default: adaptador = null;

        }

        list.setAdapter(adaptador);

        final Intent a = new Intent(Main2Activity.this, Main3Activity.class);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Peliculas p = (Peliculas) parent.getItemAtPosition(position);


                a.putExtra("nombre", p.getNombre());

                a.putExtra("costo", p.getCosto());
                startActivity(a);

            }
        });
    }

}
