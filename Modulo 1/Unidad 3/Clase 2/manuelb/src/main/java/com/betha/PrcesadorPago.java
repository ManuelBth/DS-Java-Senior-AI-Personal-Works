package com.betha;
import org.apache.logging.log4j.*;

public class PrcesadorPago {

    private static final Logger logger = LogManager.getLogger(PrcesadorPago.class);

    public void procesarPago(Pago pago){
        logger.info("Iniciando el proceso de pago para el cliente: {}", pago.getCliente().getName());
        
        // Debug: Mostrar información técnica para el desarrollador
        logger.debug("Monto a pagar: {}, Saldo disponible: {}", pago.getMontoAPagar(), pago.getSaldoDisponible());

        // Validar que el monto no sea cero o negativo y que saldo sea suficiente
        if (pago.getMontoAPagar() <= 0) {
            logger.error("El monto a pagar debe ser mayor que cero. Monto proporcionado: {}", pago.getMontoAPagar());
            return;
        }

        if (pago.getSaldoDisponible() < pago.getMontoAPagar()) {
            logger.error("Saldo insuficiente para el cliente: {}. Saldo disponible: {}, Monto a pagar: {}",
                    pago.getCliente().getName(), pago.getSaldoDisponible(), pago.getMontoAPagar());
            return;
        }

        // Simular el procesamiento del pago
        logger.info("Procesando el pago de {} para el cliente: {}", pago.getMontoAPagar(), pago.getCliente().getName());

        // Confirmar el pago
        logger.info("Pago procesado exitosamente para el cliente: {}", pago.getCliente().getName());

        // Resta el saldo disponible
        pago.pagoProcesado();
        logger.debug("Nuevo saldo disponible para el cliente {}: {}", pago.getCliente().getName(), pago.getSaldoDisponible());

    }


}
