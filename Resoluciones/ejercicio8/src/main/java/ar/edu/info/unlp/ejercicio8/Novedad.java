package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public class Novedad implements Sugerencia {
	
	public List<Pelicula> getSugerencia(Decodificador decodificador) {
		
		return decodificador.masRecientesNoVistas().stream().limit(3).toList();
	}

}
