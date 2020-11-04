package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.entitie.bean.Responsables;

public class ResponsableDAO implements IResponsable {
	
	//@PersistenceContext(unitName="senbase")
	//private EntityManager em;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("senbase");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public List<Responsables> liste() {
		
		return em.createQuery("SELECT p FROM Responsables p").getResultList();
	}

	@Override
	public int add(Responsables Responsables) {
		int yes = 0 ;
		try {
			em.getTransaction().begin();
			em.persist(Responsables);
			em.getTransaction().commit();
			yes = 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yes;
	}

}
