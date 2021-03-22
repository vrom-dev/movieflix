package datos;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import modelo.Categorias;
import modelo.Pelicula;

public class GestionPeliculas {

	private HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();

	public GestionPeliculas() {
		super();
	}

	public GestionPeliculas(HashMap<Integer, Pelicula> peliculas) {
		super();
		this.peliculas = peliculas;
	}

	public HashMap<Integer, Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(HashMap<Integer, Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public void altaPelicula(Integer id, Pelicula p) {
		if (peliculas.containsKey(id)) {
			System.out.println("El código ya existe");
		} else {
			p.datosPelicula();
			peliculas.put(id, p);
			System.out.println("Película añadida");
		}

	}

	public void imprimirListaPeliculas() {

		for (Integer i : this.peliculas.keySet()) {

			this.peliculas.get(i).imprimirPelicula(i);

		}

	}

	/**
	 * Modifica el HasMap que contiene el listado de películas cargando en el las
	 * peliculas presentes en el archivo peliculas_numCat.txt que esta en la carpeta
	 * del programa.
	 * 
	 * La key del HashMap es un número autoincrementado empezando en 1.
	 * 
	 * @author Alvaro
	 * @param none
	 * @return void
	 * @exception En caso de no encontar el archivo, avisa al usuario de que ha
	 *               habido un problema
	 * 
	 * 
	 */
	public boolean cargarPeliculas() {

		try {

			FileReader archivo = new FileReader("peliculas_numCat.txt");
			Scanner leer = new Scanner(archivo);

			int contador = 1;

			while (leer.hasNext()) {

				String pelicula = leer.nextLine();
				String[] datosPelicula = pelicula.split(",");

				Pelicula p = new Pelicula();

				p.setNombre(datosPelicula[0]);
				p.setEstreno(Integer.parseInt(datosPelicula[1]));
				int categoriaID = Integer.parseInt(datosPelicula[2]);
				p.setCategoria(Categorias.getNombreCategoria(categoriaID));

				// test purposes
				// p.imprimirPelicula();

				peliculas.put(contador, p);

				contador++;

			}

			return true;

		} catch (Exception e) {

			System.out.println("Error al cargar el archivo de películas");
			e.printStackTrace();
			return false;

		}

	}

	/**
	 * Método para buscar una película en concreto a partir del código. Devuelve una
	 * película.
	 * 
	 * @param codigo
	 * @return película
	 * @author ALBERTO
	 */
	public Pelicula buscarPelicula(Integer codigo) {
		return peliculas.get(codigo);
	}

	// falta añadir un exception
	/**
	 * Método para eliminar películas a partir del código de la misma. Con el
	 * condicional if comprueba que exista el código para eliminarlo de lo contrario
	 * nos indica que el código proporcionado no existe en la lista de películas.
	 * 
	 * @param codigo
	 * @return void
	 * @author ALBERTO
	 */
	public boolean eliminarPelicula(Integer codigo) {
		if (peliculas.containsKey(codigo)) {
			peliculas.remove(codigo);
			return true;
		} else {
			System.out.println("Este id no está en la lista de peliculas.");
			return false;
		}

	}

	/**
	 * @author Luis Rojo
	 * metodo modificarPeliculas
	 * @param id
	 */
	public boolean modificarPeliculas(Integer id) {
		if (peliculas.containsKey(id)) {
			System.out.println("### Modificación de la Pelicula " + id + " ###");
			peliculas.get(id).datosPelicula();
			System.out.println("### La pelicula ha sido actualizada ###");
			System.out.println(peliculas.get(id).toString());
			return true;
		}else {
			System.out.println("Este id no está en la lista de peliculas.");
			return false;
		}
		
	}

	public void listarPorCategoria(Integer id) {
		System.out.println("Escoge una categoría:");
		Categorias.mostrarCategorias();
		System.out.println("*** Categoría: " + Categorias.getNombreCategoria(id) + " ***");
		for (Integer key : peliculas.keySet()) {
			if (peliculas.get(key).getCategoria().getCodigo() == id) {
				peliculas.get(key).imprimirPelicula(key);
			}
		}

	}

	public void mejorValoradas() {

		for (Integer i : this.peliculas.keySet()) {

			if (this.peliculas.get(i).getValoracion() > 4) {

				this.peliculas.get(i).imprimirPelicula(i);

			}

		}

	}

}
