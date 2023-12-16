package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Conexion.ConectarBD;


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
		
		Connection conexion = ConectarBD.getConexion();
		
		
			try {
			
				String sql = "insert into oradores (nombre, apellido, email, tema) VALUES (?,?,?,?)";
					
                PreparedStatement stmt = conexion.prepareStatement(sql);
               stmt.setString(1,orador.getNombre());
                stmt.setString(2,orador.getApellido());
               stmt.setString(3,orador.getEmail());
                stmt.setString(4,orador.getTema());
            
                stmt.execute();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}

}
