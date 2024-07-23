package ar.edu.info.unlp.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, 
			String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
		
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		
		estado = new Provisoria();
		inscriptos = new ArrayList<Usuario>();
		listaEspera = new ArrayList<Usuario>();
	}
	
	public void agregarInscripto(Usuario usuario) {
		
		inscriptos.add(usuario);
	}
	
	public void agregarListaEspera(Usuario usuario) {
		
		listaEspera.add(usuario);
	}
	
	public void setEstado(Estado estado) {
		
		this.estado = estado;
	}
	
	public void inscribir(Usuario usuario) {
		
		estado.inscribir(this, usuario);
	}
	
	public String obtenerInformacion() {
		
		return estado.obtenerInformacion(this);
	}
	
	public boolean alcanzaCupoMinimo() {
		
		return inscriptos.size() >= cupoMinimo;
	}
	
	public boolean alcanzaCupoMaximo() {
		
		return inscriptos.size() >= cupoMaximo;
	}
	
	private String emailInscriptos() {
		
		return "\n- " + inscriptos.stream().map(u -> u.getEmail()).collect(Collectors.joining("\n- ")).toString();
	}
	
	private int faltantesCupoMaximo() {
		
		return cupoMaximo - inscriptos.size();
	}
	
	private int faltantesCupoMinimo() {
		
		return cupoMinimo - inscriptos.size();
	}
	
	public String infoLlena() {
		
		return "Nombre: " + nombre + "\nCosto: " + costo + "\nFecha de inicio: " + 
				fechaInicio + "\nFecha de fin: " + fechaFin + "\nPunto de encuentro: " + puntoEncuentro;
	}
	
	public String infoDefinitiva() {
		
		return infoLlena() + "\nInscriptos: " + emailInscriptos() + 
				"\nUsuarios faltantes para alcanzar el cupo máximo: " + faltantesCupoMaximo();
	}
	
	public String infoProvisoria() {
		
		return infoLlena() + "\nUsuarios faltantes para alcanzar el cupo mínimo: " + faltantesCupoMinimo();
	}
	
}
