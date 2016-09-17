package com.example.android.gridview02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ANDROID on 03/09/2016.
 */
public class PeliculasArrayAdapter<T> extends ArrayAdapter<Peliculas> {

    public PeliculasArrayAdapter(Context context, List<Peliculas> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.image_list_item,
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos
        ImageView categoria = (ImageView)listItemView.findViewById(R.id.category);
        TextView nombre = (TextView)listItemView.findViewById(R.id.text1);
        TextView duracion = (TextView)listItemView.findViewById(R.id.text2);
        TextView costo = (TextView)listItemView.findViewById(R.id.text3);
        ImageView play = (ImageView)listItemView.findViewById(R.id.imageView);


        //Obteniendo instancia de la Tarea en la posición actual
        Peliculas item = getItem(position);

        categoria.setImageResource(item.getCategoria());
        nombre.setText(item.getNombre());
        duracion.setText(item.getDuracion());
        costo.setText(item.getCosto());
        play.setImageResource(item.getPlay());

        //Devolver al ListView la fila creada
        return listItemView;

    }
}
