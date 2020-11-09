package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entitie.*;
import com.dao.ClientDAO;
import com.dao.IClient;



@WebServlet( name="client",urlPatterns = {"/clt", "/pclt", "/client.insert"})
public class Client extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  public Client() {
	        super();
	       
	    }
	
	private IClient icl ;
       
    @Override
    	public void init() throws ServletException {
    		icl = new ClientDAO();
    	}
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pclt.jsp").forward(request, response);
	}


    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Client cl = new Client();

		cl.setNom_de_famille(request.getParameter("nom_de_famille"));
		cl.setVillage( request.getParameter("village"));
		cl.setAdresse(request.getParameter("adresse"));
		cl.setNumero_tel(request.getParameter("numero_tel"));
		
		icl.add(cl);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pclt.jsp").forward(request, response);
	
	}

}
