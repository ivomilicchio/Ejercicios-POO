package ar.edu.info.unlp.ejercicio6;

public class Provisoria implements Estado {
	
	public void inscribir(Excursion excursion, Usuario usuario) {
		
		excursion.agregarInscripto(usuario);
		if (excursion.alcanzaCupoMinimo()) {
			
			excursion.setEstado(new Definitiva());
		}
	}
	
	public String obtenerInformacion(Excursion excursion) {
		
		return excursion.infoProvisoria();
	}

}
