package ar.edu.info.unlp.ejercicio3;

public class Temporario extends Empleado {
	
	private int horasTrabajadas;
	private int cantidadHijos;
	private boolean estaCasado;
	
	public Temporario(int cantidadHijos, boolean estaCasado) {
		
		this.cantidadHijos = cantidadHijos;
		this.estaCasado = estaCasado;
		this.horasTrabajadas = 0;
	}
	
	public double getBasico() {
		
		return 20000 + (horasTrabajadas * 300);
	}
	
	public double getAdicional() {
		
		double adicional = 2000 * cantidadHijos;
		if (estaCasado) {
			adicional += 5000;
		}
		
		return adicional; 
	}
}
