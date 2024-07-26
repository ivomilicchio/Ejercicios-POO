package ar.edu.info.unlp.ejercicio6;

public class Llena implements Estado {
	
	public void inscribir(Excursion excursion, Usuario usuario) {
		
		excursion.agregarListaEspera(usuario);
	}
	
	
	public String obtenerInformacion(Excursion excursion) {
		
		return excursion.infoLlena();
	}

}
