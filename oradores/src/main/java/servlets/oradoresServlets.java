package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Conexion.ConectarBD;
import Mappers.MapperJson;
import Modelo.Orador;
import Persistencia.InterfacePersistencia;
import Persistencia.PersistenciaEnMySQL;


public class oradoresServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public oradoresServlets() {
        super();
      
    }

    private MapperJson mapper = new MapperJson();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InterfacePersistencia persistencia = new PersistenciaEnMySQL();
		
		ArrayList<Orador> listaOradores = persistencia.listarOradores();
		String listaOradoresJson = mapper.toJson(listaOradores);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().write(listaOradoresJson);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre =request.getParameter("nombreInput");
		String apellido =request.getParameter("apellidoInput");
		String email =request.getParameter("emailInput");
		String tema =request.getParameter("temaInput");
		
		Orador orador = new Orador (nombre,apellido,email,tema);
		
		InterfacePersistencia persistencia = new PersistenciaEnMySQL();
		persistencia.guardar(orador);
        
        String confirmacion = "Registro exitoso";
        response.getWriter().write(confirmacion);
	}

}
