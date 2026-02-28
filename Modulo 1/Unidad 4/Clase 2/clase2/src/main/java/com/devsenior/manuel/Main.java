package com.devsenior.manuel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Dada una lista de enteros, se desea que:
            1. Quedarnos con los números pares.
            2. Multiplicar cada número por 2.
            3. Imprimir el resultado.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        ejemploImperativo(numeros);
        ejemploDeclarativo(numeros);
        
    }

    public static void ejemploImperativo(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero : numeros){
            if (numero % 2 == 0) {
                resultado.add(numero * 2);
            }
        }
        System.out.println(resultado);
    }

    public static void ejemploDeclarativo(List<Integer> numeros) {
        numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .map(numero -> numero * 2)
            .forEach(n -> System.out.println(n));
    }
}