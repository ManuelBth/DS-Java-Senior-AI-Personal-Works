package com.devsenior;

import java.util.Arrays;

import com.devsenior.model.Transaccion;
import com.devsenior.service.ProcesadorPagos;

public class Main {
    public static void main(String[] args) {
       var procesador = new ProcesadorPagos();
       
       var datos = Arrays.asList(
            new Transaccion("1", 1500, "USD", "Nómina"),
            new Transaccion("2", 2432, "USD", "Compra"),
            new Transaccion("3", 3540, "USD", "Transaccion"),
            new Transaccion("4", 5600, "USD", "Nómina")
       );

       try {
            procesador.cargarTransacciones(datos);

            procesador.procesadorReporte();
       } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
       }
    }
}