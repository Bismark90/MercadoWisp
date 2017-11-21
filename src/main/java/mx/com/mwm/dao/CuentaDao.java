package mx.com.mwm.dao;

import java.util.List;

import mx.com.mwm.model.Rol;
import mx.com.mwm.model.TablaCuenta;

public interface CuentaDao {
	
	public List<TablaCuenta> findAllCuenta();

	public TablaCuenta findCientaById(TablaCuenta cuenta);

	public TablaCuenta findCuentaByEmail(TablaCuenta cuenta);

	public void insertCuenta(TablaCuenta cuenta,Rol rol);

	public void updateCuenta(TablaCuenta cuenta);

	public void deleteCuenta(TablaCuenta cuenta);
	

}
