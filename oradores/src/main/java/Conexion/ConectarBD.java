package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConectarBD {
	public static Connection getConexion () {
		
		String driveClassName = "com.mysql.cj.jdbc.Driver";
	try {
		
		Class.forName(driveClassName);
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/oradores", "root", "");
		return conexion; 
		} 
	catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
			return null;
		}
	

	}
}

