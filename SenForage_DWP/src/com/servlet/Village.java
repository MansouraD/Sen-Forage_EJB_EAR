package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entitie.Village;
import com.dao.IVillage;
import com.dao.VillageDAO;


 
/**
 * Servlet implementation class Village
 */
@WebServlet( name="village", urlPatterns = {"/vlg","/pvlg", "/village.insert"})
public class Village extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private IVillage ivil ;
    
    @Override
    public void init() throws ServletException{
    	ivil = new VillageDAO();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pvlg.jsp").forward(request, response);
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Villages vil = new Villages();
		
		vil.setNom(request.getParameter("nom_village"));
		
		ivil.add(vil);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pvlg.jsp").forward(request, response);
		
	}

}
