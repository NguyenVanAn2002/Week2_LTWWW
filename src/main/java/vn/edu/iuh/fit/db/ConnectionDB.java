package vn.edu.iuh.fit.db;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionDB {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VanAn");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
    }
}
