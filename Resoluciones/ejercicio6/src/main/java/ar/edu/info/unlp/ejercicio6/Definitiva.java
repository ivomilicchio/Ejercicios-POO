package ar.edu.info.unlp.ejercicio6;

public class Definitiva implements Estado {
	
	public void inscribir(Excursion excursion, Usuario usuario) {
	
		excursion.agregarInscripto(usuario);
		if(excursion.alcanzaCupoMaximo()) {
			
			excursion.setEstado(new Llena());
		}
	}
	
	
	public String obtenerInformacion(Excursion excursion) {
		
		return excursion.infoDefinitiva();
	}

}
