package com.example.FacturacionPrimeraEntregaGilardoni7.Logica;
import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Cliente;
import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.ClienteInfoDTO;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;

@Service
public class ClienteService {
    public ClienteInfoDTO calcularEdad(Cliente cliente) {
        LocalDate fechaNacimiento = cliente.getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();

        return new ClienteInfoDTO(cliente.getNombre(), cliente.getApellido(), edad);
    }
}
