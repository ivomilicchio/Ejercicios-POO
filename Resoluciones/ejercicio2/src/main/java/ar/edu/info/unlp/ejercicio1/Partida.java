package ar.edu.info.unlp.ejercicio1;

public class Partida {
	
	private Jugador jugadorUno;
	private Jugador jugadorDos;
	
	public Partida(Jugador jugadorUno, Jugador jugadorDos) {
		
		this.jugadorUno = jugadorUno;
		this.jugadorDos = jugadorDos;
	}
	
	public String Jugar() {
		
		return jugadorUno.getJugada().jugarContra(jugadorDos.getJugada());
	}

}
