package modelo;

public class Pelicula {
	
	private String nombre; 
	private int estreno;
	private Categorias categoria;
	
	
	public Pelicula() {
		super();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstreno() {
		return estreno;
	}
	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}


	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return  "Pelicula: " +
				"\n Nombre=" + nombre + 
				"\n Estreno=" + estreno + 
				"\n categoria=" + categoria + 
				"\n";
	}
	
	

}
