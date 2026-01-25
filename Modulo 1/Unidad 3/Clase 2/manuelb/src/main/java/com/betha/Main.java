package com.betha;
import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        
        logger.debug("Iniciando la aplicación de procesamiento de pagos.");

        Pago pagoValido = new Pago(new Cliente("Juan Perez", "123456789"), 1000.0, 250.0);
        Pago pagoInsuficiente = new Pago(new Cliente("Maria Gomez", "987654321"), 100.0, 250.0);
        Pago pagoNegativo = new Pago(new Cliente("Carlos Ruiz", "456123789"), 500.0, -50.0);

        PrcesadorPago procesador = new PrcesadorPago();

        logger.info("Procesando pago válido:");
        procesador.procesarPago(pagoValido);
        logger.info("Procesando pago con saldo insuficiente:");
        procesador.procesarPago(pagoInsuficiente);
        logger.info("Procesando pago con monto negativo:");
        procesador.procesarPago(pagoNegativo);

    }
}