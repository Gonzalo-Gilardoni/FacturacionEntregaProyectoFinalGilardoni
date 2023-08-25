package com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Producto implements objetc {
    private Object GenerationType;
    @Id
    private Long id;
    private String nombre;
    private double precio;
    private int stock;
    private int cantidad;

    public Producto(Long id) {
    // Constructor por defecto requerido por JPA/Hibernate
        this.id = id;
    }

      public Producto(String nombre, double precio, int stock) {
    }

    public Producto(Object nombre, double precio, int stock) {
    }

    public Producto(Serializable nombre, double precio, int stock) {
    }

    public static Producto createProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    public int Producto(double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

        return stock;
    }
    @Override
    public boolean equals (Producto obj) {
        if (this == obj) {
            boolean b = true;
            return b;
        } else {
        return false;
    }}


    public String getStock() {

        return null;
    }

    public int getPrecio() {
        return 0;
    }

    public String getNombre() {
        return null;
    }
}
    // Getters y setters (omitiendo para brevedad)

