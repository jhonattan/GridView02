package com.example.android.gridview02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView titulo;
    private TextView precio;
    private Spinner entradas;
    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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


        //código nuestro
        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("nombre");
        String costo = bundle.getString("costo");

        titulo = (TextView) findViewById(R.id.textView);
        precio = (TextView) findViewById(R.id.textView3);
        entradas = (Spinner) findViewById(R.id.spinner);
        total = (TextView) findViewById(R.id.textView5);

        titulo.setText(nombre);
        precio.setText(costo);

        ArrayAdapter<String> adapter;

        String[] entradas2 = {"1", "2", "3", "4"};

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, entradas2);
        entradas.setAdapter(adapter);

    }

    public void calcular(View view) {



        int precio2 = Integer.valueOf(precio.getText().toString().substring(4));
        int preciotottal = precio2 * Integer.valueOf(entradas.getSelectedItem().toString());

        total.setText(""+preciotottal);
    }

}
