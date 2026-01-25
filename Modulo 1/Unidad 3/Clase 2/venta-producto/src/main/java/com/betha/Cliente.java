package com.betha;

public class Cliente {

    private String nombre;
    private String activo;

    public Cliente(String nombre, String activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", activo='" + activo + '\'' +
                '}';
    }
}
