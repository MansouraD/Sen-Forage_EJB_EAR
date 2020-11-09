package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entitie.Village;

public class VillageDAO implements IVillage {
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("senbase");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public List<Village> liste() {
		
		return em.createQuery("SELECT p FROM Villages p").getResultList();
	}

	@Override
	public int add(Village Village) {
		int yes = 0 ;
		try {
			em.getTransaction().begin();
			em.persist(Village);
			em.getTransaction().commit();
			yes = 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yes;
	}

}
