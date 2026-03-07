package com.devsenior;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;
    private boolean disponible;
    
    public Producto(String nombre, double precio, String categoria, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", disponible="
                + disponible + "]";
    }

}
