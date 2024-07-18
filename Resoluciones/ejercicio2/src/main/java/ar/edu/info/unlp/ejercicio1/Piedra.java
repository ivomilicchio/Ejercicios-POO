package ar.edu.info.unlp.ejercicio1;

public class Piedra implements Jugada {
	
	public String jugarContra(Jugada jugada) {
		
		return jugada.contraPiedra();
	}
	
	public String contraPiedra() {
		
		return "Empate";
	}
	
	public String contraPapel() {
		
		return "Papel envuelve Piedra";
	}
	
	public String contraTijera() {
		
		return "Piedra aplasta Tijera";
	}
	
	public String contraLagarto() {
		
		return "Piedra aplasta Lagarto";
	}
	
	public String contraSpock() {
		
		return "Spock vaporiza Piedra";
	}
	

}
