package com.devsenior;

public class Producto {

    public String nombre;
    public String categoria;
    public int precio;


    public Producto(String nombre, String categoria, int precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }


    public String getCategoria() {
        return categoria;
    }


    public int getPrecio() {
        return precio;
    }

    


}
