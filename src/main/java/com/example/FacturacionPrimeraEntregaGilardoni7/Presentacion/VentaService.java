package com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion;

import java.util.List;

public interface VentaService {
    List<Venta> obtenerVentasDelDia();
    void registrarNuevaVenta(Venta venta);
}