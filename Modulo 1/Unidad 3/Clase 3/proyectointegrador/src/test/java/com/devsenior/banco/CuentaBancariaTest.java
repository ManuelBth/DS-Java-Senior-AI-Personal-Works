package com.devsenior.banco;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    // Se crea una cuenta bancaria valida
    @Test
    public void crearCuentaBancariaValida() {
        Cliente cliente = new Cliente("Ana Gomez", "987654321");
        CuentaBancaria cuenta = new CuentaBancaria("00112233", cliente, TipoCuenta.CORRIENTE, 500.0);
        assertNotNull(cuenta);
        assertEquals("00112233", cuenta.getNumeroCuenta());
        assertEquals(500.0, cuenta.getSaldo());
        assertEquals(cliente, cuenta.getCliente());
        assertEquals(TipoCuenta.CORRIENTE, cuenta.getTipoCuenta());
    }

    // Se prueba que no se puede crear una cuenta con saldo negativo
    @Test
    public void crearCuentaConSaldoNegativo() {
        Cliente cliente = new Cliente("Ana Gomez", "987654321");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CuentaBancaria("00112233", cliente, TipoCuenta.AHORRO, -100.0);
        });
        assertEquals("El saldo inicial no puede ser negativo", exception.getMessage());
    }

    // Se prueba que no se puede crear una cuenta con numero de cuenta nulo
    @Test
    public void crearCuentaConNumeroNulo() {
        Cliente cliente = new Cliente("Ana Gomez", "987654321");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CuentaBancaria(null, cliente, TipoCuenta.AHORRO, 100.0);
        });
        assertEquals("Número de cuenta, cliente o tipo de cuenta inválidos", exception.getMessage());
    }

    

}
