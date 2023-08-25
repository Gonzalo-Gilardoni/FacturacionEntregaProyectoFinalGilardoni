package com.example.FacturacionPrimeraEntregaGilardoni7.Logica;
import com.example.FacturacionPrimeraEntregaGilardoni7.Persistencia.Producto;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class Inventario {

    public List<Producto> obtenerTodosLosProductos() {
        EntityManager HibernateUtil = null;
        EntityManager entityManager;
        entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Producto> query = entityManager.createQuery("SELECT p FROM Producto p", Producto.class);
        return query.getResultList();
    }

    public Producto obtenerProductoPorId(Long id) {
        EntityManager HibernateUtil = null;
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        return entityManager.find(Producto.class, id);
    }

    public void agregarProducto(Producto producto) {
        EntityManager HibernateUtil = null;
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(producto);
        entityManager.getTransaction().commit();
    }

    public void actualizarProducto(Producto producto) {
        EntityManager HibernateUtil = null;
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(producto);
        entityManager.getTransaction().commit();
    }

    public void eliminarProducto(Producto producto) {
        EntityManager HibernateUtil = null;
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(producto);
        entityManager.getTransaction().commit();
    }
}

