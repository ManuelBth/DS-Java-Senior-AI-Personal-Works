package com.devsenior.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void crearClienteValido() {
        Cliente cliente = new Cliente("Juan Perez", "123456789");
        assertNotNull(cliente);
        assertEquals("Juan Perez", cliente.getNombre());
        assertEquals("123456789", cliente.getIdentificacion());
    }

    // Cliente con nombre nulo 
    @Test
    public void crearClienteInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cliente(null, "123456789");
        });
        assertEquals("Nombre e identificación del cliente invalidos", exception.getMessage());
    }

    // Cliente con documento nulo
    @Test
    public void crearClienteConDocumentoNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("Juan Perez", null);
        });
        assertEquals("Nombre e identificación del cliente invalidos", exception.getMessage());
    }

}