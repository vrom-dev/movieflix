package control;

import gui.Menu;
import services.PeliculasServices;
import services.UsuariosServices;
import utilidades.LecturaDatos;

/**
 * Crea una clase SeleccionOpciones que muestra el menú.
 * @param peliculas objeto PeliculasServices
 * @param usuarios objeto UsuariosServices
 * Con un DO-WHILE mostramos el menu principal siempre hasta que no se cumpla la condición
 * Mostramos las diferentes opciones con SWITCH-CASE  y añadimos diferentes SWITCH-CASE anidados para crear los submenus.
 */

public class SeleccionOpciones {
	public static void menuPrincipal(PeliculasServices peliculas, UsuariosServices usuarios) {
		boolean seguir = true;
		
		do {
			 Menu.mostrarMenu();
			 switch(LecturaDatos.leerInt()) {
			  case 1: // GESTION PELÍCULAS
				  menuPeliculas(peliculas);
				  break;
				  
			  case 2: // GESTION USUARIOS
				  menuUsuarios(usuarios);
				  break;
			  
			  case 3: // OTROS
				  menuOtros(peliculas, usuarios);
				  break;
			  
			  case 4: // SALIR
				  seguir = false;
				  break;
			  default:
				  System.out.println("La opción escogida no es válida. Escoge otra opción");
				  break;
			 }
		} while (seguir);
	}
	
	public static void menuUsuarios(UsuariosServices usuarios) {
		boolean seguir = true;
		do {
			Menu.subMenuUsuarios();
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
				break;
			}
		} while (seguir);	
	}
	
	public static void menuPeliculas(PeliculasServices peliculas) {
		boolean seguir = true;
		do {
			Menu.subMenuPeliculas();
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
				break;
			}
		} while (seguir);	
	}
	
	public static void menuOtros(PeliculasServices peliculas, UsuariosServices usuarios) {
		boolean seguir = true;
		do {
			Menu.subMenuOtros();
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
				/** LISTADO DE PELÍCULAS MEJOR VALORADAS */	
				peliculas.mejorValoradas();
				break;
				
			case 4:
				/** LISTADO DE USUARIOS */
				usuarios.listarUsuarios();
				break;

			case 5:
				/** VOLVER AL MENU PRINCIPAL */
				seguir = false;
				break;
			default:
				System.out.println("La opción escogida no es válida. Escoge otra opción");
				break;
			}
		} while (seguir);	
	}
}
