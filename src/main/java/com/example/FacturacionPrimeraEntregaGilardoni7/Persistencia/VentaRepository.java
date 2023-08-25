package com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia;

import com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    List<Venta> findByFecha(LocalDate fecha);
}