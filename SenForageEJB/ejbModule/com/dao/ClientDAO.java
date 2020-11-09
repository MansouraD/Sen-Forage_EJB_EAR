package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entitie.Client;

public class ClientDAO implements IClient {
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("senbase");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public List<Client> liste() {
		return em.createQuery("SELECT p FROM Clients p").getResultList();
	}

	@Override
	public int add(Client Client) {

		int yes = 0 ;
		try {
			em.getTransaction().begin();
			em.persist(Client);
			em.getTransaction().commit();
			yes = 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yes;
	}


}
