package datos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCargarPeliculas {
	
	GestionPeliculas listaPeliculas = new GestionPeliculas();
	

	@Test
	public void test() {
		boolean test = listaPeliculas.cargarPeliculas();
		assertTrue(test);
	}

}
