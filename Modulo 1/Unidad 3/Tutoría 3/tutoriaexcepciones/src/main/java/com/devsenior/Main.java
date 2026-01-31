package com.devsenior;

import org.apache.logging.log4j.*;

import com.devsenior.domain.exceptions.DataBaseTimeOutException;
import com.devsenior.domain.exceptions.SaldoInsuficienteException;
import com.devsenior.domain.models.cuenta;
import com.devsenior.domain.services.CajeroService;

public class Main {
    
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        
        logger.info("Iniciando la aplicacion de gestion bancaria");
        cuenta cuenta = new cuenta("1234567890", 1000.0, "Juan Perez");
        CajeroService cajeroService = new CajeroService();

        try {
            cajeroService.retirarDinero(150, cuenta);
        } catch (SaldoInsuficienteException e) {
            logger.error("El usuario intento retirar una cantidad no valida: " + e.getMessage());
        } catch (DataBaseTimeOutException e){
            logger.error("Error de conexion con la base de datos: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Ocurrio un error inesperado: " + e.getMessage());
        }

        logger.info("Saldo final de la cuenta: " + cuenta.getSaldo());
        logger.info("Finalizando la aplicacion de gestion bancaria");

    }
}