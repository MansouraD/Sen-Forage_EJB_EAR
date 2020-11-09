package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entitie.Responsable;

public class ResponsableDAO implements IResponsable {
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("senbase");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public List<Responsable> liste() {
		
		return em.createQuery("SELECT p FROM Responsables p").getResultList();
	}

	@Override
	public int add(Responsable Responsable) {
		int yes = 0 ;
		try {
			em.getTransaction().begin();
			em.persist(Responsable);
			em.getTransaction().commit();
			yes = 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yes;
	}

}
