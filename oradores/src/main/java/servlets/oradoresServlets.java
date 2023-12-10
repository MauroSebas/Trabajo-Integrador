package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class oradoresServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public oradoresServlets() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre =request.getParameter("nombreInput");
		
		String apellido =request.getParameter("apellidoInput");
		
		String email =request.getParameter("emailInput");
		
		String tema =request.getParameter("temaInput");
		
		Orador orador = new Orador (nombre,apellido,email,tema);
		
		
	}

}
