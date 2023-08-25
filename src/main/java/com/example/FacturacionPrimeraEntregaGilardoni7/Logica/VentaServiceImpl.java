package com.example.FacturacionPrimeraEntregaGilardoni7.Logica;

import com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion.Venta;
import com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> obtenerVentasDelDia() {
        LocalDate fechaActual = LocalDate.now();
        return ventaRepository.finalize(fechaActual);
    }

    @Override
    public void registrarNuevaVenta(Venta venta) {
        ventaRepository.save(venta);
    }
}