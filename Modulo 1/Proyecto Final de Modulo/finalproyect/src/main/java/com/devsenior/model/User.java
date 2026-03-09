package com.devsenior.model;

public class User {

    private int id;
    private String name;

    
    public User(int id, String nombre) {
        this.id = id;
        this.name = nombre;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return name;
    }


    public void setNombre(String nombre) {
        this.name = nombre;
    }


    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }
    
}
