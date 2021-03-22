package control;

import gui.Menu;
import gui.SubMenu3;
import services.PeliculasServices;
import services.UsuariosServices;
import utilidades.LecturaDatos;

/**
 * @author tangerine (Víctor Romero), modificado por (Virginia Turina)
 *
 */

public class Main {

	/**
	 * Crea una clase Menu principal que muestra el menú
	 * @param peliculas objeto PeliculasServices
	 * @param usuarios objeto UsuariosServices
	 */
	
	public static void menuPrincipal(PeliculasServices peliculas, UsuariosServices usuarios) {
		boolean seguir = true;
		/*
		 * do { Menu.mostrarMenu(); switch (LecturaDatos.leerInt()) { case 1: // ALTA DE
		 * UN USUARIOS usuarios.addUsuario(); break;
		 * 
		 * case 2: // ELIMINAR UN USUARIO usuarios.eliminarUsuario(); break;
		 * 
		 * case 3: // MODIFICAR USUARIO usuarios.modificarUsuario(); break;
		 * 
		 * case 4: // AÑADIR PELICULAS peliculas.addPelicula(); break;
		 * 
		 * case 5: // ELIMINAR PELICULAS peliculas.eliminarPelicula(); break;
		 * 
		 * case 6: // MODIFICAR PELICULAS peliculas.modificarPelicula(); break;
		 * 
		 * case 7: // LISTADO DE TODAS LAS PELÍCULAS peliculas.listarPeliculas(); break;
		 * 
		 * case 8: //LISTADO DE PELÍCULAS POR CATEGORIA peliculas.listarPorCategoria();
		 * break;
		 * 
		 * case 0: // Se puede añadir método para confirmar que se quiere salir seguir =
		 * false; break;
		 * 
		 * default:
		 * System.out.println("La opción escogida no es válida. Escoge otra opción");
		 * break; }
		 * 
		 * } while (seguir);
		 */
		
		/**
		 * Con un DO-WHILE mostramos el menu principal siempre hasta que no se cumpla la condición
		 * Mostramos las diferentes opciones con SWITCH-CASE  y añadimos diferentes SWITCH-CASE anidados para crear los submenus.
		 */
		do {
			Menu.mostrarMenu();
			switch (LecturaDatos.leerInt()) {

			case 1:
				/** GESTION DE USUARIOS */

				do {
					// SubMenu1.mostrasSubMenu1();
					switch (LecturaDatos.leerInt()) {

					case 1:
						/** ALTA DE USUARIOS */
						usuarios.addUsuario();
						break;

					case 2:
						/** ELIMINAR USUARIO */
						usuarios.eliminarUsuario();
						break;

					case 3:
						/** MODIFICAR USUARIO */
						usuarios.modificarUsuario();
						break;

					case 4:
						/** VOLVER AL MENU PRINCIPAL */
						seguir = false;
						break;

					default:
						System.out.println("La opción escogida no es válida. Escoge otra opción");
					}
				} while (seguir);

			case 2:
				/** GESTION DE PELICULAS */

				do {
					// SubMenu2.mostrasSubMenu2();
					switch (LecturaDatos.leerInt()) {

					case 1:
						/** AÑADIR PELICULA */
						peliculas.addPelicula();
						break;

					case 2:
						/** ELIMINAR PELICULA */
						peliculas.eliminarPelicula();
						break;

					case 3:
						/** MODIFICAR PELICULA */
						peliculas.modificarPelicula();
						break;

					case 4:
						/** VOLVER AL MENU PRINCIPAL */
						seguir = false;
						break;

					default:
						System.out.println("La opción escogida no es válida. Escoge otra opción");
					}
				} while (seguir);

			case 3:
				/** OTRAS OPCIONES */

				do {
					SubMenu3.mostrarSubMenu3();
					switch (LecturaDatos.leerInt()) {

					case 1:
						/** LISTADO DE TODAS LAS PELÍCULAS */
						peliculas.listarPeliculas();
						break;

					case 2:
						/** LISTADO DE PELÍCULAS POR CATEGORIA */
						peliculas.listarPorCategoria();
						break;

					case 3:
						/** PELICULAS MEJOR VALORADAS */
						// peliculas.
						break;

					case 4:
						/** VOLVER AL MENU PRINCIPAL */
						seguir = false;
						break;

					default:
						System.out.println("La opción escogida no es válida. Escoge otra opción");
					}
				} while (seguir);

			case 4:
				/** TERMINAR SESION */
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