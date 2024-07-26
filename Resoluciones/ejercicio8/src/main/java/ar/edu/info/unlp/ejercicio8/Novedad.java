package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public class Novedad implements Sugerencia {
	
	public List<Pelicula> getSugerencia(Decodificador decodificador) {
		
		return decodificador.sugerenciaNovedades();
	}

}
