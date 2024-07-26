package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public class Puntaje implements Sugerencia{
	
	public List<Pelicula> getSugerencia(Decodificador decodificador) {
		
		return decodificador.sugerenciaPuntajes();
	}

}
