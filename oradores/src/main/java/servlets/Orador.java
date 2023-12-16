package servlets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
}
