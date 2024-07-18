package ar.edu.info.unlp.ejercicio1;

public class Tweet {
	
	private String contenido;
	private static final int CARACTERES_MINIMOS = 1;
	private static final int CARACTERES_MAXIMOS = 280;
	
	public Tweet(String contenido) throws Exception {
		
		if (longitudInvalida(contenido)) {
			throw new Exception("El contenido del tweet debe tener un mínimo de " + CARACTERES_MINIMOS
					+ " caracter y un máixmo  de " + CARACTERES_MAXIMOS + " caracteres");
		}
		
		this.contenido = contenido;
	}
	
	public String mostrarCotenido() {
		
		return contenido;
	}
	
	private boolean longitudInvalida(String contenido) {
		
		return contenido.length() < CARACTERES_MINIMOS && contenido.length() > CARACTERES_MAXIMOS;
	}

}
