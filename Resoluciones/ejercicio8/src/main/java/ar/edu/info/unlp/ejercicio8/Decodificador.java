package ar.edu.info.unlp.ejercicio8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> peliculas;
	private List<Pelicula> reproducidas;
	private Sugerencia criterioSugerencia;
	
	public Decodificador() {
		
		peliculas = new ArrayList<Pelicula>();
		reproducidas = new ArrayList<Pelicula>();
		criterioSugerencia = new Similaridad();
	}
	
	public void reproducir(Pelicula pelicula) {
		
		if(!yaVista(pelicula)) {
			reproducidas.add(pelicula);
		}
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		
		if(!yaAgregada(pelicula)) {
			peliculas.add(pelicula);
		}
	}
	
	public void setCriterioSugerencia(Sugerencia criterioSugerencia) {
		
		this.criterioSugerencia = criterioSugerencia;
	}
	
	public List<Pelicula> getSugerencia() {
		
		return criterioSugerencia.getSugerencia(this);
	}
	
	private boolean yaAgregada(Pelicula pelicula) {
		
		return peliculas.contains(pelicula);
	}
	
	private boolean yaVista(Pelicula pelicula) {
		
		return reproducidas.contains(pelicula);
	}
	
	private List<Pelicula> noVistas() {
		
		return peliculas.stream().filter(p -> !yaVista(p)).toList();
	}
	
	public List<Pelicula> masRecientesNoVistas() {
		
		return noVistas().stream().sorted(Comparator.comparingInt(
		Pelicula::getAnoEstreno).reversed()).toList();

	}
	
	public boolean contieneSimilarYaVista(Pelicula pelicula) {
		
		return pelicula.getSimilares().stream().anyMatch(p -> yaVista(p));
	}
	
	public List<Pelicula> sugerenciaPuntajes() {
		
		return masRecientesNoVistas().stream().sorted(Comparator.comparingDouble
				(Pelicula::getPuntaje).reversed()).limit(3).toList();
	}

}
