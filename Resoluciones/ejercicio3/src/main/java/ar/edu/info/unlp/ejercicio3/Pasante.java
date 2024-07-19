package ar.edu.info.unlp.ejercicio3;

public class Pasante extends Empleado {
	
	private int examenesRendidos;
	
	public Pasante() {
		
		this.examenesRendidos = 0;
	}
	
	public double getBasico() {
		
		return 20000;
	}
	
	public double getAdicional() {
		
		return 2000 * examenesRendidos;
	}
}
