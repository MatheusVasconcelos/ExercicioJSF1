package Bean;


import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Model.Usuario;

@RequestScoped
@ManagedBean
public class ListarBean {
	
	ArrayList<Usuario> usuario;
	

	public ListarBean() {
		this.usuario = new ArrayList<Usuario>();
	}
	
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}



}
