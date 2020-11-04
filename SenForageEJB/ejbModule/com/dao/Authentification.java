package com.dao;

import javax.servlet.http.HttpServletRequest;

public class Authentification {
	
	public Boolean resultat ;

	public Boolean verifier( HttpServletRequest request) {
		
		String identifiant = request.getParameter("identifiant");
		String password = request.getParameter("password");
		
		if(password.equals(identifiant + "hx3k")) {
			
			resultat = true ;
		}else {
			
			resultat = false;
		}
		
		return resultat;
	}
	
	
	
	
	
	public Boolean getResultat() {
		return resultat;
	}

	public void setResultat(Boolean resultat) {
		this.resultat = resultat;
	}

}
