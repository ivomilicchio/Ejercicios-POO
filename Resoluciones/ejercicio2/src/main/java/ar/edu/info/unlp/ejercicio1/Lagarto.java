package ar.edu.info.unlp.ejercicio1;

public class Lagarto implements Jugada {
	
	public String jugarContra(Jugada jugada) {
		
		return jugada.contraLagarto();
	}
	
	public String contraPiedra() {
		
		return "Piedra aplasta Lagarto";
	}
	
	public String contraPapel() {
		
		return "Lagarto come Papel";
	}
	
	public String contraTijera() {
		
		return "Tijera decapita Lagarto";
	}
	
	public String contraLagarto() {
		
		return "Empate";
	}
	
	public String contraSpock() {
		
		return "Lagarto envenena Spock";
	}

}
