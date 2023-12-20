package Mappers;


import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Modelo.Orador;


public class MapperJson {
	
	
ObjectMapper mapper;
	
	
	
	public MapperJson() {
        this.mapper = new ObjectMapper();
    }


    
    public String toJson(ArrayList<Orador> listaOradores) {

    	
    	try {
            return mapper.writeValueAsString(listaOradores);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "[]"; 
        }
    }
	
	
	

}
