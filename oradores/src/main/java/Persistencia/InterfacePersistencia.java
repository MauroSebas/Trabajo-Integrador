package Persistencia;

import java.util.ArrayList;

import Modelo.Orador;

public interface InterfacePersistencia {
	
void guardar(Orador orador);

ArrayList<Orador> listarOradores ();
	

}
