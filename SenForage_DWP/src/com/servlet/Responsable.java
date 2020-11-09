package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.entitie.*;
import com.dao.Authentification;
import com.dao.IResponsable;
import com.dao.ResponsableDAO;


@WebServlet(urlPatterns = {"/Responsable","/prsp", "/acces.insert"})
public class Responsable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Responsable() {
        super();
       
    }

    private IResponsable ires;
    
    @Override
    public void init() {
    	
    	ires = new ResponsableDAO();
    }
    
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
	}

	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Authentification entrer = new Authentification() ;
		
		request.setAttribute("entrer", entrer);
		
		if (entrer.verifier(request) == true) {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/prsp.jsp");
		rd.forward(request, response);
		
		} else {
			this.getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
		Responsable res = new Responsable();
		
		res.setNom(request.getParameter("nom"));
		res.setPrenom(request.getParameter("prenom"));
		res.setEmail(request.getParameter("email"));
		res.setPassword(request.getParameter("password"));
		
		ires.add(res); 
		
		
		
	}

}
