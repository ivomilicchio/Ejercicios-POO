package ar.edu.info.unlp.ejercicio1;

public class Retweet {
	
	private Tweet tweetOrigen;
	
	public Retweet(Tweet tweetOrigen) {
		
		this.tweetOrigen = tweetOrigen;
	}
	
	public String mostrarCotenido() {
		
		return tweetOrigen.mostrarCotenido();
	}
	
	public boolean esTweetOrigen(Tweet tweet) {
		
		return tweetOrigen == tweet;
	}

}
