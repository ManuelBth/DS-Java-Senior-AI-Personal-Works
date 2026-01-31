package com.devsenior.manuel;

import org.junit.jupiter.api.Test;

public class MaquinaCafeTest {

    @Test
    public void testCafePreparado() {
        MaquinaCafe maquina = new MaquinaCafe(true, true);
        assert maquina.prepararCafe().equals("Cafe preparado");
    }

    @Test
    public void testFaltaAgua() {
        MaquinaCafe maquina = new MaquinaCafe(false, true);
        assert maquina.prepararCafe().equals("Falta agua");
    }

    @Test
    public void testFaltaCafe() {
        MaquinaCafe maquina = new MaquinaCafe(true, false);
        assert maquina.prepararCafe().equals("Falta cafe");
    }

    @Test
    public void testFaltaAguaYCafe() {
        MaquinaCafe maquina = new MaquinaCafe(false, false);
        assert maquina.prepararCafe().equals("Falta agua y cafe");
    }
}
