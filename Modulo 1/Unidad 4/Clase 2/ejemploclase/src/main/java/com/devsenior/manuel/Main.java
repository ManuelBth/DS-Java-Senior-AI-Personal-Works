package com.devsenior.manuel;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }

    public static void ejemplo1() {
        /*
            Dada una lista de objetos de tipo Empleado, cada uno con los atributos nombre y salario,
            filtra aquellos que tengan un salario mayor a 50000 y cuenta cuantos empleados cumplen con esta condición.
            Imprime el número de empleados que tienen un salario mayor a 50000.
        */

        var empleados = List.of(
                new Empleado("Juan", 45000),
                new Empleado("María", 55000),
                new Empleado("Pedro", 60000),
                new Empleado("Ana", 48000),
                new Empleado("Luis", 52000)
        );

        long n_Empleados = empleados.stream()
                .filter(e -> e.getSalario() >= 50000)
                .count();

        System.out.println("Número de empleados con salario mayor a 50000: " + n_Empleados);
    }

    public static void ejemplo2() {
        /*
            Dada una lista de palabras, agrupalas según la longitud de cada palabra. Imprime las palabras agregadas por su longitud,
            mostrando la longitud y las palabras correspondientes a esa longitud.
        */

        // Ejemplo de lista de palabras a agrupar (que son 20 palabras)
        var palabras = List.of(
                "manzana", "banana", "casa", "perro", "gato", "elefante", "sol", "luna", "estrella", "mariposa",
                "avión", "tren", "bicicleta", "computadora", "teléfono", "libro", "árbol", "flor", "montaña", "río"
        ); 
        
        palabras.stream()
                .collect(Collectors.groupingBy(palabra -> palabra.length()))
                .forEach((n_Palabras, palabra_Clave) -> {
                    System.out.println("Número de repeticiones: " + n_Palabras + " - Palabras: " + palabra_Clave);
                });
    }
}