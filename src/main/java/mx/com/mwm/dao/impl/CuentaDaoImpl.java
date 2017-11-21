package mx.com.mwm.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.com.mwm.dao.CuentaDao;
import mx.com.mwm.model.Rol;
import mx.com.mwm.model.TablaCuenta;

public class CuentaDaoImpl implements CuentaDao {
	private static EntityManager em;
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mwisp");
	
	
	@Override
	public void deleteCuenta(TablaCuenta cuenta) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public TablaCuenta findCientaById(TablaCuenta cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TablaCuenta> findAllCuenta() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TablaCuenta findCuentaByEmail(TablaCuenta cuenta) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	@Override
	public void insertCuenta(TablaCuenta cuenta, Rol rol) {
		// TODO Auto-generated method stub
		cuenta.setRol(rol);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(cuenta);
		em.getTransaction().commit();
				
	}
	
	@Override
	public void updateCuenta(TablaCuenta cuenta) {
		// TODO Auto-generated method stub
		
	}
	
}
