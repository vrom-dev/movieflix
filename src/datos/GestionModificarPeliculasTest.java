package datos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GestionModificarPeliculasTest {

	GestionPeliculas peliculas = new GestionPeliculas();

	@Before
	public void crearlistaPeliculas() {
		peliculas.cargarPeliculas();

	}

	@Test
	public void testmodificarPeliculas() {
		boolean resultado = peliculas.modificarPeliculas(100);
		assertFalse(resultado);

	}

}
