package com.devsenior.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import com.devsenior.model.Transaccion;

import com.devsenior.exception.SaldoInsuficienteException;

public class ProcesadorPagos {

    private final List<Transaccion> repository = new CopyOnWriteArrayList<>();

    public void cargarTransacciones(List<Transaccion> nuevas){

        repository.addAll(nuevas);
        
        
    }

    
    
    public void procesadorReporte() throws SaldoInsuficienteException{

        boolean errorDeMonto = repository.stream()
                                        .anyMatch(t -> t.monto() <= 0);
        
        if (errorDeMonto) {
            throw new SaldoInsuficienteException("Transacción con monto invalido detectado");
        }

        double totalGlobal = repository.parallelStream()
                                    .mapToDouble(Transaccion::monto)
                                    .sum();

        Map<String, Double> resumenPorCategoria = repository.stream()
                                                            .collect(Collectors.groupingBy(
                                                                Transaccion::categoria,
                                                                Collectors.summingDouble(Transaccion::monto)
                                                            ));

                                                        
        System.out.println("Reporte financiero");
        System.out.println("Total general: $" + totalGlobal);
        
        resumenPorCategoria.forEach((cat, sum) -> {
            System.out.println("Categoría: " + cat + " | Total: $" + sum);
        });
    }



}
