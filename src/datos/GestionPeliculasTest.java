package datos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestionPeliculasTest {
	GestionPeliculas listaPeliculas = new GestionPeliculas();
	
	@Before
		public void cargarPeliculas() {
		listaPeliculas.cargarPeliculas();
	}

	@Test
	public void testEliminaPelicula() {
		boolean resultado = listaPeliculas.eliminarPelicula(2);
		assertTrue(resultado);	
	}
	
	@Test
	public void testCargarPeliculas() {
		boolean test = listaPeliculas.cargarPeliculas();
		assertTrue(test);
	}
	
	@Test
	public void testmodificarPeliculas() {
		boolean resultado = listaPeliculas.modificarPeliculas(100);
		assertFalse(resultado);

	}

}
