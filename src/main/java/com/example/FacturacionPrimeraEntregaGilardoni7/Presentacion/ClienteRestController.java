package com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion;

import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Cliente;
import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.ClienteInfoDTO;
import com.example.FacturacionPrimeraEntregaGilardoni7.Logica.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public ClienteInfoDTO getClienteInfo(@PathVariable Long id) {
        // Aquí debes obtener el cliente por su ID desde la base de datos.
        // Obtengo cliente por id
        Cliente cliente = obtenerClientePorId(id);
        return clienteService.calcularEdad(cliente);
    }

    private Cliente obtenerClientePorId(Long id) {
        Cliente cliente = new Cliente(id);
        return cliente;
    }
}


