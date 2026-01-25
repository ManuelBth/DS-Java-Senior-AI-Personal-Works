package com.betha;

import org.apache.logging.log4j.*;

public class procesadorPedido {
    
    private static final Logger logger = LogManager.getLogger(procesadorPedido.class);
    
    public void procesarPedido(Pedido pedido) {

        logger.info("Iniciando el procesamiento del pedido: " + pedido);

        // detalles del pedido
        logger.debug("Producto solicitado: {}. Cantidad: {}, Stock disponible: {}",  pedido.getProducto().getNombre(), pedido.getCantidad(), pedido.getProducto().getStock());

        // Verificar si el cliente está activo
        if (!"S".equalsIgnoreCase(pedido.getCliente().getActivo())) {
            logger.warn("El cliente {} no está activo. No se puede procesar el pedido.", pedido.getCliente().getNombre());
            return;
        }

        // El pedido debe tener por lo menos 1 unidad
        if (pedido.getCantidad() < 1) {
            logger.error("La cantidad solicitada debe ser al menos 1. Cantidad solicitada: {}", pedido.getCantidad());
            return; 
        }

        // Verificar si hay suficiente stock
        if (pedido.getCantidad() > pedido.getProducto().getStock()) {
            logger.error("No hay suficiente stock para el producto {}. Cantidad solicitada: {}, Stock disponible: {}", pedido.getProducto().getNombre(), pedido.getCantidad(), pedido.getProducto().getStock());
            return;
        }

        // Si todas las validaciones pasan, procesar el pedido

        pedido.getProducto().reducirStock(pedido.getCantidad());
        logger.info("Pedido procesado exitosamente para el cliente {}. Producto: {}, Cantidad: {}. Stock restante: {}", pedido.getCliente().getNombre(), pedido.getProducto().getNombre(), pedido.getCantidad(), pedido.getProducto().getStock());



    }
}
