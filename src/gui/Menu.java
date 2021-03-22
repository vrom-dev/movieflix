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
}
