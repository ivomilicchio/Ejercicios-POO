package ar.edu.info.unlp.ejercicio2;

public class Tijera implements Jugada {
	
	public String jugarContra(Jugada jugada) {
		
		return jugada.contraTijera();
	}
	
	public String contraPiedra() {
		
		return "Piedra aplasta Tijera";
	}
	
	public String contraPapel() {
		
		return "Tijera corta Papel";
	}
	
	public String contraTijera() {
		
		return "Empate";
	}
	
	public String contraLagarto() {
		
		return "Tijera decapita Lagarto";
	}
	
	public String contraSpock() {
		
		return "Spock rompe Tijera";
	}

}
