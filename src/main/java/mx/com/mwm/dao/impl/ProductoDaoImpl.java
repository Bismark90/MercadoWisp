package mx.com.mwm.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.com.mwm.dao.ProductoDao;
import mx.com.mwm.model.Productos;

public class ProductoDaoImpl implements ProductoDao {
	private static EntityManager em;
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mwisp");

	@Override
	public List<Productos> findAllProductos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void insertProducto(Productos producto) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);		
		em.getTransaction().commit();
		// TODO Auto-generated method stub
	}
	
	@Override
	public Productos findProductoById(Productos persona) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void deleteProducto(Productos producto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateProducto(Productos producto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Productos findProductoByEmail(Productos persona) {
		// TODO Auto-generated method stub
		return null;
	}
}
