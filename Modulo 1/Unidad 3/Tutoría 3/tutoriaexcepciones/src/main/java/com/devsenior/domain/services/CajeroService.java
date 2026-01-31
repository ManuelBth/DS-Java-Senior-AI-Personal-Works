package com.devsenior.domain.services;

import org.apache.logging.log4j.*;

import com.devsenior.domain.exceptions.DataBaseTimeOutException;
import com.devsenior.domain.exceptions.SaldoInsuficienteException;
import com.devsenior.domain.models.cuenta;

public class CajeroService {

    private static final Logger logger = LogManager.getLogger(CajeroService.class.getName());

    // Variables de instancia


    public void retirarDinero(double monto, cuenta cuenta) throws SaldoInsuficienteException {
        logger.info("Iniciando solicitud de retiro de: $" + monto);
        
        if (Math.random() > 0.9) {
            logger.error("Error de conexión a la base de datos");
            throw new DataBaseTimeOutException("Tiempo de espera de la base de datos excedido", null);
        }

        if (monto > cuenta.getSaldo()) {
            logger.warn("Saldo insuficiente para el retiro de: $" + monto + ". Saldo actual: $" + cuenta.getSaldo());
            throw new SaldoInsuficienteException(cuenta.getSaldo(), monto);
        }

        double nuevoSaldo = cuenta.getSaldo() - monto;
        cuenta.setSaldo(nuevoSaldo);
        logger.info("Retiro exitoso de: $" + monto + ". Nuevo saldo: $" + cuenta.getSaldo());
    }

}
