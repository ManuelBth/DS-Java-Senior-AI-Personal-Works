package com.betha;

public class Pago {

    private Cliente cliente;
    private double saldoDisponible;
    private double montoAPagar;

    public Pago(Cliente cliente, double saldoDisponible, double montoAPagar) {
        this.cliente = cliente;
        this.saldoDisponible = saldoDisponible;
        this.montoAPagar = montoAPagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }

    public void pagoProcesado() {
        this.saldoDisponible -= this.montoAPagar;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "cliente=" + cliente +
                ", saldoDisponible=" + saldoDisponible +
                ", montoAPagar=" + montoAPagar +
                '}';
    }

}
