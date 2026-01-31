package com.devsenior.banco;

public class Cliente {
    
    private String nombre;
    private String identificacion;

    public Cliente(String nombre, String identificacion) {
        if (nombre == null || identificacion == null) {
            throw new IllegalArgumentException("Nombre e identificación del cliente invalidos");
        }
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

}
