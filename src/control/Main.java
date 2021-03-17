package control;

import datos.GestionPeliculas;
import datos.GestionUsuarios;
import gui.Menu;
import modelo.Pelicula;
import modelo.Pelicula;
import modelo.Categorias;
import modelo.Usuario;
import utilidades.LecturaDatos;

public class Main {

	public static void menuPrincipal(GestionPeliculas peliculas, GestionUsuarios usuarios) {
		boolean seguir = true;
		do {
			Menu.mostrarMenu();

			int cod;

			switch (LecturaDatos.leerInt()) {
			case 1:
				// ALTA DE UN USUARIOS
				Usuario user = new Usuario();
				user.crearUsuario();
				usuarios.altaUsuarios((int) Math.random() * 10000 + 1, user);
				break;

			case 2:
				// ELIMINAR UN USUARIO
				cod = LecturaDatos.leerInt("Introduce el código del usuario que quieres eliminar ");
				usuarios.eliminarUsuario(cod);
				break;

			case 3:
				// MODIFICAR USUARIO
				break;

			case 4:
				// AÑADIR PELICULAS
				break;

			case 5:
				// ELIMINAR PELICULAS
				// Se puede añadir un trow exception
				cod = LecturaDatos.leerInt("Introduzca el código de la película que desea eliminar: ");
				peliculas.eliminarPelicula(cod);
				break;

			case 6:
				// MODIFICAR PELICULAS
				cod = LecturaDatos.leerInt("Introducir el Codigo de la pelicula que quieres eliminar");
				peliculas.modificarPeliculas(cod);

				break;

			case 7:
				// LISTADO DE TODAS LAS PELÍCULAS
				break;

			case 8:
				// Listado de películas por categoría
				System.out.println("Selecciona una categoría:");
				Categorias.mostrarCategorias();
				peliculas.listarPorCategoria(LecturaDatos.leerInt());
				break;

			case 9:
				// PELÍCULAS MEJOR VALORADAS
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
		GestionPeliculas listadoPeliculas = new GestionPeliculas();
		GestionUsuarios listadoUsuarios = new GestionUsuarios();
		menuPrincipal(listadoPeliculas, listadoUsuarios);
	}

}