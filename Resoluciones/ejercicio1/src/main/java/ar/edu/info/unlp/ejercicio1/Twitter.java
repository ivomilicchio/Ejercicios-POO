package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		
		usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(String nombreUsuario) throws Exception {
		
		if (existeUsuario(nombreUsuario)) {
			throw new Exception("Ya hay un usuario registrado conel nombre " + nombreUsuario);
		}
		
		usuarios.add(new Usuario(nombreUsuario));
	}

	private boolean existeUsuario(String nombreUsuario) {
		
		return usuarios.stream().anyMatch(u -> u.getNombreUsuario() == nombreUsuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		
		usuario.getTweets().forEach(t -> eliminarRetweets(t));
		usuario.eliminarRetweets();
		usuario.eliminarTweets();
		usuarios.remove(usuario);
	}
	
	private void eliminarRetweets(Tweet tweet) {
		
		usuarios.forEach(u -> u.eliminarRetweet(tweet));
	}
}
