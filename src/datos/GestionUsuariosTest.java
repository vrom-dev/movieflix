package datos;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Usuario;

public class GestionUsuariosTest {
	GestionUsuarios listaUsuarios = new GestionUsuarios();
	

	@Test
	public void testAltaUsuarios() {
		Usuario user = new Usuario("Victor", LocalDate.now(), "Barcelona");
		boolean resultado = listaUsuarios.altaUsuarios(2, user);
		assertTrue(resultado);
	}
	

}
