package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Directorio extends FileSystem {
	
	private List<FileSystem> contenido;
	private static final int TAMANO_INICIAL = 32000;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		
		super(nombre, fechaCreacion);
		contenido = new ArrayList<FileSystem>();
	}
	
	public void addComponente(FileSystem componente) {
		
		contenido.add(componente);
	}
	
	public int tamanoTotalOcupado() {
		
		return TAMANO_INICIAL + contenido.stream().mapToInt(c -> c.tamanoTotalOcupado()).sum();
	}
	
	public Archivo archivoMasGrande() {
		
		return contenido.stream().map(c -> c.archivoMasGrande()).filter(a -> a != null).max((a1, a2) -> 
		Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		
		return contenido.stream().map(c -> c.archivoMasNuevo()).filter(a -> a != null).max((a1,a2) -> 
		a1.getFechaCreacion().compareTo(a2.getFechaCreacion())).orElse(null);
	}
}
