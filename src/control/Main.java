package control;

import gui.Menu;
import services.PeliculasServices;
import services.UsuariosServices;
import utilidades.LecturaDatos;

public class Main {

	public static void menuPrincipal(PeliculasServices peliculas, UsuariosServices usuarios) {
		boolean seguir = true;
		do {
			Menu.mostrarMenu();
			switch (LecturaDatos.leerInt()) {
			case 1:
				// ALTA DE UN USUARIOS
				usuarios.addUsuario();
				break;

			case 2:
				// ELIMINAR UN USUARIO
				usuarios.eliminarUsuario();
				break;

			case 3:
				// MODIFICAR USUARIO
				usuarios.modificarUsuario();
				break;

			case 4:
				// AÑADIR PELICULAS
				peliculas.addPelicula();
				break;

			case 5:
				// ELIMINAR PELICULAS
				peliculas.eliminarPelicula();
				break;

			case 6:
				// MODIFICAR PELICULAS
				peliculas.modificarPelicula();
				break;

			case 7:
				// LISTADO DE TODAS LAS PELÍCULAS
				peliculas.listarPeliculas();
				break;

			case 8:
				//LISTADO DE PELÍCULAS POR CATEGORIA
				peliculas.listarPorCategoria();
				break;

			case 0:
				// Se puede añadir método para confirmar que se quiere salir
				seguir = false;
				break;

			default:
				System.out.println("La opción escogida no es válida. Escoge otra opción");
				break;
			}

		} while (seguir);
	}

	public static void main(String[] args) {
		PeliculasServices servicioPeliculas = new PeliculasServices();
		servicioPeliculas.cargarPeliculas();
		UsuariosServices servicioUsuarios = new UsuariosServices();
		menuPrincipal(servicioPeliculas, servicioUsuarios);
	}

}