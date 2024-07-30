package ar.edu.info.unlp.ejercicio8;

import java.util.Comparator;
import java.util.List;

public class Puntaje implements Sugerencia{
	
	public List<Pelicula> getSugerencia(Decodificador decodificador) {
		
		return decodificador.masRecientesNoVistas().stream().sorted
		(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()).limit(3).toList();
	}

}
