package mx.com.mwm.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="registro")
@RequestScoped

public class RegistroMB {
	
	private String usuario;
	private String password;
	private String email;
	
	public RegistroMB() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
