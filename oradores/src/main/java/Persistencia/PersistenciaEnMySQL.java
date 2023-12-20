package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexion.ConectarBD;
import Modelo.Orador;

public class PersistenciaEnMySQL implements InterfacePersistencia{

	@Override
	public void guardar(Orador orador) {
	
		Connection conexion = ConectarBD.getConexion();
		
		
		try {
		
			String sql = "insert into oradores (nombre, apellido, email, tema) VALUES (?,?,?,?)";
				
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1,orador.getNombre());
            stmt.setString(2,orador.getApellido());
            stmt.setString(3,orador.getEmail());
            stmt.setString(4,orador.getTema());
        
            stmt.execute();

          conexion.close();
            
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
	}

	@Override
	public ArrayList<Orador> listarOradores() {
		
		Connection conexion = ConectarBD.getConexion();
		
		ArrayList<Orador> oradores = new ArrayList<>();
		
		String sql = "SELECT * FROM oradores";
		
		try {
			PreparedStatement statement = conexion.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
		
				String nombre = resultSet.getString("nombre");
				String apellido = resultSet.getString("apellido");
				String email = resultSet.getString("email");
				String tema = resultSet.getString("tema");
				
				
				
				Orador orador = new Orador(nombre, apellido, email, tema);
				
				oradores.add(orador);
				
			}
			
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return oradores;
	}
	
	
}
