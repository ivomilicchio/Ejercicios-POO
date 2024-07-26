package ar.edu.info.unlp.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador deco;
	
	private Pelicula p1;
	private Pelicula p2;
	private Pelicula p3;
	private Pelicula p4;
	private Pelicula p5;
	private Pelicula p6;
	
	@BeforeEach
	void setUp() throws Exception {
		
		deco = new Decodificador(); //Por defecto se instancia para que sugiera por similaridad
		
		p1 = new Pelicula("Thor", 7.9, 2007);
		p2 = new Pelicula("Capitan America", 7.8, 2016);
		p3 = new Pelicula("Iron man", 7.9, 2010);
		p4 = new Pelicula("Dunkirk", 7.9, 2017);
		p5 = new Pelicula("Rocky", 8.1, 1976);
		p6 = new Pelicula("Rambo", 7.8, 1979);
		
		p1.agregarSimilar(p2);
		p1.agregarSimilar(p3);
		
		p2.agregarSimilar(p1);
		p2.agregarSimilar(p3);
		
		p3.agregarSimilar(p1);
		p3.agregarSimilar(p2);
		
		p5.agregarSimilar(p6);
		
		p6.agregarSimilar(p5);
		
		deco.agregarPelicula(p1);
		deco.agregarPelicula(p2);
		deco.agregarPelicula(p3);
		deco.agregarPelicula(p4);
		deco.agregarPelicula(p5);
		deco.agregarPelicula(p6);
		
		deco.reproducir(p1);
		deco.reproducir(p5);
	}
	
	@Test
	public void testSugerenciaSimilares() {
		
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		peliculas.addLast(p2);
		peliculas.addLast(p3);
		peliculas.addLast(p6);
		
		assertEquals(peliculas, deco.getSugerencia());
	}
	
	@Test
	public void testSugerenciaPuntajes() {
		
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		deco.setCriterioSugerencia(new Puntaje());
		
		peliculas.addLast(p4);
		peliculas.addLast(p3);
		peliculas.addLast(p2);
		
		assertEquals(peliculas, deco.getSugerencia());
	}
	
	@Test
	public void testSugerenciaNovedades() {
		
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		deco.setCriterioSugerencia(new Novedad());
		
		peliculas.addLast(p4);
		peliculas.addLast(p2);
		peliculas.addLast(p3);
		
		assertEquals(peliculas, deco.getSugerencia());
	}
	

}
