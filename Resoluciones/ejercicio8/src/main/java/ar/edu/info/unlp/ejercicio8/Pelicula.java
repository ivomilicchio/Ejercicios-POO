package ar.edu.info.unlp.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	private String titulo;
	private int anoEstreno;
	private double puntaje;
	private List<Pelicula> similares;

	public Pelicula(String titulo, double puntaje, int anoEstreno) {
		
		this.titulo = titulo;
		this.anoEstreno = anoEstreno;
		this.puntaje = puntaje;
		similares = new ArrayList<Pelicula>();
	}
	
	public int getAnoEstreno() {
		
		return anoEstreno;
	}
	
	public double getPuntaje() {
		
		return puntaje;
	}
	
	public List<Pelicula> getSimilares() {
		
		return similares;
	}
	
	private boolean noAgregada(Pelicula pelicula) {
		
		return !similares.contains(pelicula);
	}
	
	public void agregarSimilar(Pelicula pelicula) {
		
		if(noAgregada(pelicula)) {
			
			similares.add(pelicula);
		}
	}
}
