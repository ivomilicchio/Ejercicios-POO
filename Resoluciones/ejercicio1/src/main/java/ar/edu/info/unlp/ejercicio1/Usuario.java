package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombreUsuario;
	private List<Tweet> tweets;
	private List<Retweet> retweets;
	
	public Usuario(String nombreUsuario) {
		
		this.nombreUsuario = nombreUsuario;
		tweets = new ArrayList<Tweet>();
		retweets = new ArrayList<Retweet>();
	}
	
	public void publicarTweet(Tweet tweet) {
		
		if (tweet != null) {
			tweets.add(tweet);
		}
	}
	
	public void publicarRetweet(Retweet retweet) {
		
		if (retweet != null) {
			retweets.add(retweet);
		}
	}
	
	public void eliminarTweets() {
		
		tweets.clear();
	}
	
	public void eliminarRetweets() {
		
		retweets.clear();
	}

	public void eliminarRetweet(Tweet tweet) {
		
		retweets.removeIf( r -> r.esTweetOrigen(tweet));
	}
	
	public List<Tweet> getTweets() {
		
		return tweets;
	}
	
	public String getNombreUsuario() {
		
		return nombreUsuario;
	}
}
