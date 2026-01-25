package com.betha;

import java.util.logging.*;

public class Main {
    
    // Se instancia log4j
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        
        logger.info("Iniciando la aplicación de ventas de productos.");
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "S");
        Cliente cliente2 = new Cliente("Maria Gomez", "N");   

        logger.info("Clientes creados: " + cliente1 + ", " + cliente2);

        // Crear productos
        Producto producto1 = new Producto("Laptop", 1500.00, 10);
        Producto producto2 = new Producto("Smartphone", 800.00, 5);

        logger.info("Productos creados: " + producto1 + ", " + producto2);


        // Crear pedidos
        Pedido pedido1 = new Pedido(cliente1, producto1, 2);
        Pedido pedido2 = new Pedido(cliente2, producto2, 1);
        Pedido pedido3 = new Pedido(cliente1, producto2, 6); // Excede
        Pedido pedido4 = new Pedido(cliente1, producto2, 0); // Cantidad inválida
        logger.info("Pedidos creados: " + pedido1 + ", " + pedido2 + ", " + pedido3 + ", " + pedido4);

        // Procesar pedidos
        procesadorPedido procesador = new procesadorPedido();
        procesador.procesarPedido(pedido1);
        procesador.procesarPedido(pedido2);
        procesador.procesarPedido(pedido3);
        procesador.procesarPedido(pedido4);
        logger.info("Finalizando la aplicación de ventas de productos.");
        
    }
}