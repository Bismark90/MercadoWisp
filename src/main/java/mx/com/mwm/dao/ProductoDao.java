package mx.com.mwm.dao;

import java.util.List;

// mx.com.mwm.model.Persona;
import mx.com.mwm.model.Productos;

public interface ProductoDao {

	public List<Productos> findAllProductos();

	public Productos findProductoById(Productos persona);

	public Productos findProductoByEmail(Productos persona);

	public void insertProducto(Productos producto);

	public void updateProducto(Productos producto);

	public void deleteProducto(Productos producto);
	
}
