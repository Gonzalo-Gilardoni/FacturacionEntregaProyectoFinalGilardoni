package com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia;

public class ClienteInfoDTO {
    private String nombre;
    private String apellido;
    private int años;

    public ClienteInfoDTO(String nombre, String apellido, int años) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.años = años;
    }
}
