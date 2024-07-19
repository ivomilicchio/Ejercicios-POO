package ar.edu.info.unlp.ejercicio3;

public class Planta extends Empleado {
	
	private int cantidadHijos;
	private int anosAntiguedad;
	private boolean estaCasado;
	
	public Planta(int cantidadHijos, boolean estaCasado) {
		
		this.cantidadHijos = cantidadHijos;
		this.estaCasado = estaCasado;
		anosAntiguedad = 0;
	}
	
	public double getBasico() {
		
		return 50000;
	}
	
	public double getAdicional() {
		
		double adicional = (2000 * cantidadHijos) + (2000 * anosAntiguedad);
		if (estaCasado) {
			adicional += 5000;
		}
		
		return adicional;
	}
}
