package com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion;

import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Cliente;
import com.example.FacturacionPrimeraEntregaGilardoni7.Logica.GestorVentas;
import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturacionPrimeraEntregaGilardoni7Application {

	public static void main(String[] args) {
		SpringApplication.run(FacturacionPrimeraEntregaGilardoni7Application.class, args);
		// Crear productos
		Producto producto1 = new Producto("Producto 1", 10.0, 20);
		Producto producto2 = new Producto("Producto 2",15.0, 15);

		// Crear cliente
		Cliente cliente = new Cliente();

		// Crear venta
		Venta venta = new Venta(1, cliente);
		venta.agregarProducto(producto1);
		venta.agregarProducto(producto2);

		// Mostrar comprobante de venta
		System.out.println(venta.generarComprobante());

		// Registrar venta y actualizar stock
		GestorVentas gestorVentas = new GestorVentas();
		gestorVentas.registrarVenta(venta);
		producto1.Producto(1);
		producto2.Producto(2);

		// Mostrar stock actualizado
		System.out.println("Stock actual de " + producto1.getStock() + ": " + producto1.getStock());
		System.out.println("Stock actual de " + producto2.getStock() + ": " + producto2.getStock());

		// Calcular y mostrar total de ingresos
		double totalIngresos = gestorVentas.calcularTotalIngresos();
		System.out.println("Total de ingresos: " + totalIngresos);
	}
}
