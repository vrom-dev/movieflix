package modelo;

/* @author Alvaro */ 

public enum Categorias {
	
	Policiaca(1), 
	Romantica(2), 
	Aventuras(3),
	Comedia(4),
	Animacion(5),
	Thriller(6),
	Dummie(7);
	
	private final int codigo;
	private static final int size = Categorias.values().length;
	
	private Categorias(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	
	public static int getSize() {
		return size;
	}
	
	/* @author Antonio */ 
    private static Categorias[] values = null;

    public static Categorias getNombreCategoria(int val) {
        if (Categorias.values == null) {
            Categorias.values = Categorias.values();
        }
        
        return Categorias.values[val];
    }
	
	

}
