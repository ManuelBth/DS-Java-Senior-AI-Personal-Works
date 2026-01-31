package com.devsenior.banco;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String numeroCuenta, Cliente cliente, TipoCuenta tipoCuenta, double saldo) {
        if (numeroCuenta == null || cliente == null || tipoCuenta == null) {
            throw new IllegalArgumentException("Número de cuenta, cliente o tipo de cuenta inválidos");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void consignar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes para realizar el retiro");
        }
        saldo -= monto;
    }
}
