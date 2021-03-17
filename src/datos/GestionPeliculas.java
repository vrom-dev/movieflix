package datos;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

import modelo.Categorias;
import modelo.Pelicula;
import utilidades.LecturaDatos;

/**
 * @author dmc99
 *
 */
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
		
		//Pelicula p = new Pelicula();
		
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
			
			this.peliculas.get(i).imprimirPelicula();

		}
		
		
	}
	
	
	
	/**
	 * Modifica el HasMap que contiene el listado de películas cargando en el 
	 * las peliculas presentes en el archivo peliculas_numCat.txt que esta en 
	 * la carpeta del programa.
	 * 
	 * La key del HashMap es un número autoincrementado empezando en 1.
	 * 
	 * @author Alvaro
	 * @param none
	 * @return void
	 * @exception En caso de no encontar el archivo, avisa al usuario de que ha habido un problema
	 * 
	 */
	public void cargarPeliculas() {
		
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
				
				//test purposes
				//p.imprimirPelicula();
				
				peliculas.put(contador, p);
				
				contador++;				
				
				
			}
			
			
			System.out.println("------------------------------------");
			System.out.println("- Peliculas cargadas correctamente -");
			System.out.println("------------------------------------");
			
			
		} catch (Exception e) {
			
			System.out.println("Error al cargar el archivo de películas");
			e.printStackTrace();
			
		}
		

		
		
	}
	
	
	
	
}
