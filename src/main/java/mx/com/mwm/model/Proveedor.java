package mx.com.mwm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idproveedor")
	private int IdProveedor;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="direccion")
	private String direccion;
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public Proveedor(String nombre, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getIdProveedor() {
		return IdProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		IdProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Proveedor [IdProveedor=" + IdProveedor + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	

}
