package com.devsenior;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
            new Producto("Laptop", "Electrónica", 1200),
            new Producto("Smartphone", "Electrónica", 800),
            new Producto("Camiseta", "Ropa", 25),
            new Producto("Pantalones", "Ropa", 40)
        );

        //ejemplo1(productos);

        //ejemplo2(productos);

        //ejemplo3(productos);

        //ejemplo4(productos);

        //ejemplo5(productos);

        ejemplo6(productos);

        // Se puede concatenar otro método terminal, como por ejemplo contar el número de productos por categoría

    }

    public static void ejemplo1(List<Producto> productos) {
        var resultado = productos.stream() // pipeline son métodos sucesivos que se aplican a los elementos del stream
                .collect(Collectors.groupingBy(Producto::getCategoria)); // Como es una funcion terminal, toca cerrar el stream, y devuelve un Map<String, List<Producto>>
        
        resultado.forEach((categoria, listaProductos) -> {
            System.out.println("Categoría: " + categoria);
            listaProductos.forEach(producto -> System.out.println(" - " + producto.getNombre()));
        });
    }

    public static void ejemplo2(List<Producto> productos) {
        var resultado = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.counting())); // Devuelve un Map<String, Long> con el conteo de productos por categoría
        
        resultado.forEach((categoria, conteo) -> {
            System.out.println("Categoría: " + categoria + ", Cantidad: " + conteo);
        });
    }

    public static void ejemplo3(List<Producto> productos) {
        
        var resultado = productos.stream()
                .collect(Collectors.summingInt(Producto::getPrecio)); // Devuelve la suma total de los precios de los productos
        System.out.println("Suma total de precios: " + resultado);
    }

    public static void ejemplo4(List<Producto> productos) {
        var resultado = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summingInt(Producto::getPrecio))); // Devuelve un Map<String, Integer> con la suma total de precios por categoría

        resultado.forEach((categoria, sumaPrecios) -> System.out.println("Categoría: " + categoria + ", Suma de Precios: " + sumaPrecios));
    }

    public static void ejemplo5(List<Producto> productos) {

        var resultado = productos.stream()
                .collect(Collectors.summarizingInt(Producto::getPrecio)); // Devuelve un IntSummaryStatistics con estadísticas como suma, promedio, mínimo, máximo y conteo de precios

        System.out.println("Suma total de precios: " + resultado.getSum());
        System.out.println("Promedio de precios: " + resultado.getAverage());
        System.out.println("Precio mínimo: " + resultado.getMin());
        System.out.println("Precio máximo: " + resultado.getMax());
        
    }

    public static void ejemplo6(List<Producto> productos) {

        var resultado = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summarizingInt(Producto::getPrecio)));
                
        resultado.forEach((k, v) -> {
            System.out.println("Categoría: " + k);
            System.out.println("  Suma total de precios: " + v.getSum());
            System.out.println("  Promedio de precios: " + v.getAverage());
            System.out.println("  Precio mínimo: " + v.getMin());
            System.out.println("  Precio máximo: " + v.getMax());
        });
    }

}