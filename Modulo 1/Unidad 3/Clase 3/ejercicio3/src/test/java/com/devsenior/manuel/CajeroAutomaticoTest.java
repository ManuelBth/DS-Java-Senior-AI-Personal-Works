package com.devsenior.manuel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CajeroAutomaticoTest {

    @Test
    public void testRetirarFondosSuficientes() {
        CajeroAutomatico cajero = new CajeroAutomatico(1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cajero.retirar(1500);
        });
        assertEquals("Fondos insuficientes", exception.getMessage());
        assertEquals(1000, cajero.consultarSaldo());   
    }

    @Test
    public void testConsultarSaldo() {
        CajeroAutomatico cajero = new CajeroAutomatico(1000);
        assertEquals(1000, cajero.consultarSaldo());
        assertTrue(cajero.tieneFondos());
    }

    @Test 
    public void testRetiroCorrecto(){
        CajeroAutomatico cajero = new CajeroAutomatico(1000);
        assertEquals(300, cajero.retirar(300));
        assertEquals(700, cajero.consultarSaldo());
        
    }

    // Realizamos test donde se retira todo el saldo disponible
    @Test
    public void testRetiroTodoElSaldo(){
        CajeroAutomatico cajero = new CajeroAutomatico(500);
        assertEquals(500, cajero.retirar(500));
        assertEquals(0, cajero.consultarSaldo());
        assertFalse(cajero.tieneFondos());
    }

    // Un cajero con saldo en 0 y que no sea NULL
    @Test
    public void testCajeroConSaldoCero() {
        CajeroAutomatico cajero = new CajeroAutomatico(0);
        assertNotNull(cajero);
        assertEquals(0, cajero.consultarSaldo());
        assertFalse(cajero.tieneFondos());
    }
}