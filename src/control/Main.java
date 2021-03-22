package control;

import services.PeliculasServices;
import services.UsuariosServices;

/**
 * @author tangerine (Víctor Romero), modificado por (Virginia Turina)
 *
 */

public class Main {
	public static void main(String[] args) {
		PeliculasServices servicioPeliculas = new PeliculasServices();
		servicioPeliculas.cargarPeliculas();
		UsuariosServices servicioUsuarios = new UsuariosServices();
		SeleccionOpciones.menuPrincipal(servicioPeliculas, servicioUsuarios);
	}

}