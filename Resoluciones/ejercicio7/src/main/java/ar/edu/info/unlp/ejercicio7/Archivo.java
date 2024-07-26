package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;

public class Archivo extends FileSystem {
	
	private int tamano;
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamano) {
		
		super(nombre, fechaCreacion);
		this.tamano = tamano;
	}
	
	public int tamanoTotalOcupado() {
		
		return tamano;
	}
	
	public Archivo archivoMasGrande() {
		
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		
		return this;
	}
}
