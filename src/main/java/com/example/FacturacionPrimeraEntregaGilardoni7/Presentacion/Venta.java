package com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion;

import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Cliente;
import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int numeroVenta;
    private Cliente cliente;
    private List<Producto> productos;
    private int catidadVendida;


    // Crear productos
    Producto producto1 = new Producto("Producto 1", 10.0, 20);
    Producto producto2 = new Producto("Producto 2", 15.0, 15);

    public Venta(int numeroVenta, Cliente cliente) {
        this.numeroVenta = numeroVenta;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        // Crear venta
        Venta venta = new Venta(1, cliente);
        venta.agregarProducto(producto1);
        venta.agregarProducto(producto2);
    }

    public double getTotalVenta() {
        double total = 0;
        for (Producto producto : productos) total = total + producto.getPrecio() * getCantidadProductoVendido(producto);
        return total;
    }

    private int getCantidadProductoVendido(Producto producto) {
        int cantidadVendida = 0;
        for (Producto p : productos){
            if (p.equals(producto)) {
                catidadVendida++;
            }}
        return cantidadVendida;
    }

    public String generarComprobante() {
        StringBuilder comprobante = new StringBuilder();
        comprobante.append("Fecha: ").append(LocalDate.now()).append("\n");
        comprobante.append("Cliente: ").append(cliente.getNombre()).append("\n");
        comprobante.append("Productos vendidos:\n");
        for (Producto producto : productos) {
            comprobante.append("- ").append(producto.getNombre())
                    .append(", Precio: ").append(producto.getPrecio())
                    .append("\n");
        }
        comprobante.append("Total de la venta: ").append(getTotalVenta()).append("\n");

        return comprobante.toString();
    }
}

