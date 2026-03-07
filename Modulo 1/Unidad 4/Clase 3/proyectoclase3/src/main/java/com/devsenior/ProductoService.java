package com.devsenior;

import java.util.*;

public class ProductoService {

    private List<Producto> productos;
    
    public ProductoService(List<Producto> productos) {
        this.productos = productos;
    }

    public List<String> getNameForValue(int precio) {
        return productos.stream()
                .filter(p -> p.getPrecio() > precio && p.isDisponible())
                .map(p -> p.getNombre())
                .toList();
    }

    public List<Producto> queryForCategory (String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .sorted(Comparator.comparingDouble(Producto::getPrecio))
                .toList();
    }

    public List<Producto> applyDiscount(double porcentaje) {
        return productos.stream()
                .filter(Producto::isDisponible)
                .map(p -> {
                    double nuevoPrecio = p.getPrecio() * (1 - porcentaje / 100);
                    return new Producto(p.getNombre(), nuevoPrecio, p.getCategoria(), p.isDisponible());
                })
                .toList();
    }

    


}
