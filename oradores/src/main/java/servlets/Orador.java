package servlets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter



public class Orador {

	private String nombre;
	private String apellido;
	private String email;
	private String tema;
	
	public Orador (String nombre,String apellido,String email,String tema) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tema = tema;
		
	}
	
}
