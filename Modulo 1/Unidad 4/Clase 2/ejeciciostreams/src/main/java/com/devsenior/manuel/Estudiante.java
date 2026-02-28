package com.devsenior.manuel;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;
    private int n_Publicaciones;

    List<String> intereses = new ArrayList<>();

    public Estudiante(String nombre, int edad, String carrera, int n_Publicaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.n_Publicaciones = n_Publicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getN_Publicaciones() {
        return n_Publicaciones;
    }

    public List<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<String> intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", n_Publicaciones="
                + n_Publicaciones + ", intereses=" + intereses + "]";
    }
}
