package ar.edu.info.unlp.ejercicio1;

public class Papel implements Jugada {
	
	public String jugarContra(Jugada jugada) {
		
		return jugada.contraPapel();
	}
	
	public String contraPiedra() {
		
		return "Papel envuelve Piedra";
	}
	
	public String contraPapel() {
		
		return "Empate";
	}
	
	public String contraTijera() {
		
		return "Tijera corta Papel";
	}
	
	public String contraLagarto() {
		
		return "Lagarto come Papel";
	}
	
	public String contraSpock() {
		
		return "Papel desaprueba Spock";
	}

}
