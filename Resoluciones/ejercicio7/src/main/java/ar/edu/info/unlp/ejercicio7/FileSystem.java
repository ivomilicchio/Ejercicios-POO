package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;

public abstract class FileSystem {
	
	private String nombre;
	private LocalDate fechaCreacion;
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public LocalDate getFechaCreacion() {
		
		return fechaCreacion;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
}
