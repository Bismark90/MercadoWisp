package mx.com.mwm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.com.mwm.model.Direccion;

import mx.com.mwm.model.Persona;

import mx.com.mwm.model.TablaCuenta;

public class TestRol {
	// private static EntityManager em;
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mwisp");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		// se creo el objeto rol que retorna el rol con Id=1 el cual es un rol de
		// usuario comun
		RolDaoImpl rol = new RolDaoImpl();

		// se crea el Objeto Persona, el id es autoincrementable
		Persona p = new Persona("karen", "Mayita", "Martinez", "954012");

		// se crea la tabla cuenta, el id es autoincrementable
		TablaCuenta tc = new TablaCuenta("karencita-21", "1234", "k23@gmail");

		// al objeto cuenta se le asigna el Rol mediante el objeto rol de la clase
		// RolDaompl
		tc.setRol(rol.rolId());

		// se crea la direccion del usuario
		Direccion d = new Direccion(70900, "club leon", "23", "s/n", "Mexico", "Lazaro", "Tlalpan");

		// se le asigna a la persona una cuenta
		p.setCuenta(tc);
		// se le asigna a la persona una direcion
		p.setDireccion(d);

		// se inicia la transaccion
		em.getTransaction().begin();
		// se persiste la tabla cuenta
		em.persist(tc);
		// se persiste la tabla direccion para que pueda persistirse despues la persna
		em.persist(d);
		em.persist(p);
		em.getTransaction().commit();
		em.close();

	}

	/*
	 * private static void insertInicial() { Rol r = new Rol("Cliente", "Acivo");
	 * em.getTransaction().begin(); em.persist(r); em.getTransaction().commit(); }
	 * 
	 * @SuppressWarnings("unchecked") public static void imprimirTodo() { List<Rol>
	 * rol =(List<Rol>) em.createQuery("from Rol").getResultList();
	 * System.out.println("En la base de datos hay "+rol.size()+" Roles."); for (Rol
	 * rol2 : rol) { System.out.println(rol2); } }
	 */

}
