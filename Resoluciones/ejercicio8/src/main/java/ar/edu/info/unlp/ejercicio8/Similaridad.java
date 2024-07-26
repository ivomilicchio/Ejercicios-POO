package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public class Similaridad implements Sugerencia {
	
	public List<Pelicula> getSugerencia(Decodificador decodificador) {
		
		return decodificador.sugerenciaSimilares();
	}

}
