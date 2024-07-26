package ar.edu.info.unlp.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	
	private Directorio dir1;
	private Directorio dir2;
	private Directorio dir3;
	private Directorio dir4;
	
	private Archivo arc1;
	private Archivo arc2;
	private Archivo arc3;
	private Archivo arc4;
	private Archivo arc5;
	
	@BeforeEach
	void setUp() throws Exception {
		
		dir1 = new Directorio("Directorio 1", LocalDate.parse("2020-02-03"));
		dir2 = new Directorio("Directorio 2", LocalDate.parse("2007-09-12"));
		dir3 = new Directorio("Directorio 3", LocalDate.parse("2021-01-01"));
		dir4 = new Directorio("Directorio 4", LocalDate.parse("2024-02-03"));
		
		arc1 = new Archivo("Archivo 1", LocalDate.parse("1990-01-10"), 200);
		arc2 = new Archivo("Archivo 2", LocalDate.parse("2006-12-12"), 100);
		arc3 = new Archivo("Archivo 3", LocalDate.parse("2021-04-22"), 700);
		arc4 = new Archivo("Archivo 4", LocalDate.parse("2024-09-07"), 10);
		arc5 = new Archivo("Archivo 5", LocalDate.parse("2002-03-09"), 90);
		
		dir1.addComponente(arc1);
		dir1.addComponente(arc2);
		dir1.addComponente(dir2);
		
		dir2.addComponente(arc3);
		dir2.addComponente(dir3);
		dir2.addComponente(dir4);
		
		dir4.addComponente(arc4);
		dir4.addComponente(arc5);
	
	}
	
    @Test
    public void testTamanoTotalOcupado() {
    	
        assertEquals(129100, dir1.tamanoTotalOcupado());
    }
    
    @Test
    public void testArchivoMasGrande() {
    	
    	assertSame(arc3, dir1.archivoMasGrande());
    }
    
    @Test
    public void testArchivoMasNuevo() {
    	
    	assertSame(arc4, dir1.archivoMasNuevo());
    }
}
