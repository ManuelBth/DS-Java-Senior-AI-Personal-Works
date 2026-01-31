package com.devsenior.domain.exceptions;

public class SaldoInsuficienteException extends RuntimeException {
    
    public SaldoInsuficienteException(double saldo, double monto) {
        super(String.format("Intento de retiro de $%.2f fallido. Saldo insuficiente: $%.2f", monto, saldo));
    }

}
