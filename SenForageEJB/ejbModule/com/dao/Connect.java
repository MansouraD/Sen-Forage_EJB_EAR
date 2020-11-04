 package com.dao;

 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connect {

	public static void main(String[] args) throws Exception {
		 EntityManagerFactory entityManagerFactory = null;
	        EntityManager entityManager = null;
	        try {
	            entityManagerFactory = Persistence.createEntityManagerFactory("senbase");
	            entityManager = entityManagerFactory.createEntityManager();            
	            
	        } finally {
	            if ( entityManager != null ) entityManager.close();
	            if ( entityManagerFactory != null ) entityManagerFactory.close();
	        
	    
	}

	}

	public void verify(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}


