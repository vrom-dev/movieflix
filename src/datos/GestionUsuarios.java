package datos;

import java.util.HashMap;
import java.util.Map;

import modelo.Usuario;

public class GestionUsuarios {
	private Map<Integer, Usuario> listaUsuarios = new HashMap<>();

	public GestionUsuarios() {

	}

	public GestionUsuarios(Map<Integer, Usuario> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}

	public Map<Integer, Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Map<Integer, Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public boolean existeUsuario(Integer codigo) {
		return listaUsuarios.containsKey(codigo);
	}

	public Usuario buscarUsuario(Integer codigo) {
		return listaUsuarios.get(codigo);
	}
	/**
	 * A�ade un usuario al HashMap. Recibe por par�metro un Integer (codigo) con la key
	 * del mapa y un user (Usuario), que es el usuario a a�adir. Devuelve true si el alta 
	 * se ha realizado con �xito y false si falla.
	 * 
	 * @author V�ctor
	 * @param codigo, user
	 * @return boolean
	 * 
	 */
	// TODO A�adir throw exception y se puede mirar c�mo se genera el c�digo
	public boolean altaUsuarios(Integer codigo, Usuario user) {
		if(codigo == null) return false;
		if (listaUsuarios.containsKey(codigo)) {
			System.out.println("Este id ya est� en la lista de usuarios.");
			return false;
		} else {
			listaUsuarios.put(codigo, user);
			return true;
		}
	}

	public boolean modificarUsuario(Integer codigo) {
		if(codigo == null) return false;
		if (listaUsuarios.containsKey(codigo)) {
			System.out.println("### Modificaci�n del usuario con c�digo " + codigo + " ###");
			listaUsuarios.get(codigo).crearUsuario();
			System.out.println("### Usuario actualizado ###");
			System.out.println(listaUsuarios.get(codigo).toString());
			return true;
		} else {
			System.out.println("El c�digo de usuario introducido no existe");
			return false;
		}
	}

	// metodo eliminarUsuario, falta a�adir exception

	public boolean eliminarUsuario(Integer codigo) {
		if (listaUsuarios.containsKey(codigo)) {
			listaUsuarios.remove(codigo);
			System.out.println("### Eliminaci�n del usuario con c�digo " + codigo + " ###");
			System.out.println("### Usuario eliminado ###");
			return true;
		} else {
			System.out.println("El usuario no existe ");
			return false;
		}

	}

	public void listarUsuarios() {
		System.out.println("### Listado de usuarios ###");
		for (Integer key : listaUsuarios.keySet()) {
			System.out.print(listaUsuarios.get(key).toString());
			System.out.println(" -  C�digo de usuario: " + key);
		}
	}

}
