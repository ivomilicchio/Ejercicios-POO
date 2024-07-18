package ar.edu.info.unlp.ejercicio1;

public abstract class Empleado {

	public double getSueldo() {
		
		return getBasico() + getAdicional() - getDescuento();
	}
	
	public abstract double getBasico();
	public abstract double getAdicional();
	
	public double getDescuento() {
		
		return (getBasico() * 0.13) + (getAdicional() * 0.05);
	}
	
}
