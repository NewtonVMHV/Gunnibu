package com.example.proyectofinal;

import java.io.Serializable;

class appDatosG implements Serializable {
    private String nombre;
    private String contenido;
    private int picture;


    appDatosG(String nombre, String contenido, int picture){
        this.nombre = nombre;
        this.contenido = contenido;
        this.picture = picture;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
