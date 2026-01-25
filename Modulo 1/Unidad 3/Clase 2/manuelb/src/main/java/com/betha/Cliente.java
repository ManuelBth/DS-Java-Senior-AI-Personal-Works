package com.betha;

public class Cliente {

    private String name;
    private String id;

    public Cliente(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
