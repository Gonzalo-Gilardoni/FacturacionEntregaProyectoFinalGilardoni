package com.example.FacturacionPrimeraEntregaGilardoni7.Logica;

import com.example.FacturacionPrimeraEntregaGilardoni7.Presentacion.Venta;

import javax.persistence.EntityManager;

public class GestorVentas {

    public void registrarVenta(Venta venta) {
        EntityManager entityManager;
        EntityManager HibernateUtil;
        HibernateUtil = null;
        entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(venta);
        entityManager.getTransaction().commit();
    }

    public double calcularTotalIngresos() {
        EntityManager entityManager;
        EntityManager HibernateUtil = null;
        entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        return entityManager.createQuery("SELECT SUM(v.totalVenta) FROM Venta v", Double.class)
                .getSingleResult();
    }
}
