package gui;

/**
 * @author Tangerine - Luis Rojo - modificado por Virginia Turina
 *
 */
public class Menu {

    /**
     * Clase que muestra por pantalla el menú principal de nuestro videoclub "Movieflix"
     */
    public static void mostrarMenu() {
    	System.out.println(" ");
        System.out.println(" MOVIEFLIX");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoge una opcion: ");
        System.out.println("*    1.-Gestión de películas");
        System.out.println("*    2.-Gestión de usuarios");
        System.out.println("*    3.-Otras Opciones");
        System.out.println("*    4.-Terminar sesión");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
    }
    
    public static void subMenuUsuarios() {
	    System.out.println(" ");
	    System.out.println(" GESTIONAR USUARIOS");
	    System.out.println(" ");
	    System.out.println("************************************************");
	    System.out.println("*  Por favor, escoge una opcion: ");
	    System.out.println("*    1.-Dar de alta usuario");
	    System.out.println("*    2.-Eliminar usuario");
	    System.out.println("*    3.-Modificar usuario");
	    System.out.println("*    4.-Volver al menú principal");
	    System.out.println("************************************************");
	    System.out.println(" ");
	    System.out.print(">> ");
    }
    
    public static void subMenuPeliculas() {
        System.out.println(" ");
        System.out.println(" GESTIONAR PELICULAS");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoge una opcion: ");
        System.out.println("*    1.-Añadir película");
        System.out.println("*    2.-Eliminar película");
        System.out.println("*    3.-Modificar película");
        System.out.println("*    4.-Volver al menú principal");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
    }
    
    /**
     * @author Tangerine (Virginia Turina)
	 * Clase que muestra por pantalla el submenu "OTRAS OPCIONES"
	 */
    
    public static void subMenuOtros() {
		System.out.println(" ");
        System.out.println(" OTRAS OPCIONES");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoge una opcion: ");
        System.out.println("*    1.-Listado de películas");
        System.out.println("*    2.-Listado de películas por categoría");
        System.out.println("*    3.-Listado de películas mejor valoradas");
        System.out.println("*    4.-Listado de usuarios");
        System.out.println("*    5.-Volver al menu principal");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");    	
    }
}
