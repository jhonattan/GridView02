package com.example.android.gridview02;

/**
 * Created by ANDROID on 03/09/2016.
 */
public class Peliculas {

    private String nombre;
    private String duracion;
    private String costo;
    private int categoria;
    private int play;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public Peliculas(String nombre, String duracion, String costo, int categoria, int play) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo = costo;
        this.categoria = categoria;
        this.play = play;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }


}
