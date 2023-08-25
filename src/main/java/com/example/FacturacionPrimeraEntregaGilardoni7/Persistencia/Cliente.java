package com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocalDate fechaNacimiento;


    public Cliente(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;

    }

    // Crear cliente
    Cliente cliente = new Cliente();


    public String getNombre()  {
        return nombre;
    }

}
// Getters y setters (omitiendo para brevedad)


