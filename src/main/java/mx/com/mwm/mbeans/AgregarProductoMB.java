package mx.com.mwm.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class AgregarProductoMB {
private String nombreProducto;
private String categoria;
private float precio;
private String descripcion;
private String tiempoG;

public AgregarProductoMB() {
	// TODO Auto-generated constructor stub
}

public String getNombreProducto() {
	return nombreProducto;
}

public void setNombreProducto(String nombreProducto) {
	this.nombreProducto = nombreProducto;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getTiempoG() {
	return tiempoG;
}

public void setTiempoG(String tiempoG) {
	this.tiempoG = tiempoG;
}


	
}
