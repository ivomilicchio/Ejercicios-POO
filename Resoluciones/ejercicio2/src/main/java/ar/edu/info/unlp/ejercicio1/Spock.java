package ar.edu.info.unlp.ejercicio1;

public class Spock implements Jugada {
	
	public String jugarContra(Jugada jugada) {
		
		return jugada.contraSpock();
	}
	
	public String contraPiedra() {
		
		return "Spock vaporiza Piedra";
	}
	
	public String contraPapel() {
		
		return "Papel desaprueba Spock";
	}
	
	public String contraTijera() {
		
		return "Spock rompe Tijera";
	}
	
	public String contraLagarto() {
		
		return "Lagarto envenena Spock";
	}
	
	public String contraSpock() {
		
		return "Empate";
	}

}
