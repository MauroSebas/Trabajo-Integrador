package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

	
	
	
}
