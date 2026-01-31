package com.devsenior.domain.models;

public class cuenta {

    private String numeroCuenta;
    private double saldo;
    private String titular;

    public cuenta(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [--numeroCuenta= " + numeroCuenta + "-- saldo= $" + saldo + "-- titular=" + titular + "--]";
    }

    
}
