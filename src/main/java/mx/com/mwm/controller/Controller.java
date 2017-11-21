package mx.com.mwm.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.com.mwm.dao.CuentaDao;
import mx.com.mwm.dao.impl.CuentaDaoImpl;
import mx.com.mwm.dao.impl.ProductoDaoImpl;
import mx.com.mwm.dao.impl.RolDaoImpl;
import mx.com.mwm.mbeans.AgregarProductoMB;
import mx.com.mwm.mbeans.FormCard;
import mx.com.mwm.mbeans.RegistroMB;
import mx.com.mwm.model.Productos;
import mx.com.mwm.model.Rol;
import mx.com.mwm.model.TablaCuenta;
import mx.com.mwm.service.Openpay.CargoTarjeta;



@ManagedBean
@RequestScoped

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	@ManagedProperty(value = "#{formCard}")
	private FormCard formulario;

	@ManagedProperty(value="#{agregarProductoMB}")
	private AgregarProductoMB agregarP;
	
	@ManagedProperty(value="#{registro}")
	private RegistroMB registro;
	
	
	public FormCard getFormulario() {
		return formulario;
	}

	public void setFormulario(FormCard formulario) {
		this.formulario = formulario;
	}
	
	public AgregarProductoMB getAgregarP() {
		return agregarP;
	}
	
	public void setAgregarP(AgregarProductoMB agregarP) {
		this.agregarP = agregarP;
	}
	// getter y setter para el registro de usuario
	public void setRegistro(RegistroMB registro) {
		this.registro = registro;
	}
	
	public RegistroMB getRegistro() {
		return registro;
	}
	
	// metodo para insertar una nueva cuenta en la base de datos 
	//se obtiene el rol para que se asigne una cuentas
	
	public void registrar() {
		RolDaoImpl rolimp=new RolDaoImpl();
		CuentaDaoImpl cuentaImpl=new CuentaDaoImpl();
		
		Rol rol=new Rol();
		TablaCuenta cuenta=new TablaCuenta(registro.getUsuario(), registro.getPassword(), registro.getEmail());
		rol=rolimp.rolId();
		cuentaImpl.insertCuenta(cuenta, rol);
		
	}
	

	public void imprimir() {
		System.out.println("Valores del formulario");
		System.out.println("Token: " + formulario.getToken());
		System.out.println("Nombre: " + formulario.getTitularCard());
		System.out.println("Numero de tarjeta: " + formulario.getNumberCard());
		System.out.println("Año: " + formulario.getAnio());
		System.out.println("mes: " + formulario.getMes());
		System.out.println("Codigo: " + formulario.getCodigoCard());
	
		CargoTarjeta cargoT=new CargoTarjeta();
		cargoT.cargoT(formulario.getToken(), "card", 100, "MXN", "Compra TP-link", "1rvGhOGaFgPwNbrtefA4IwPZbMRjsQpe", "Jorge", "Damian", "9581318869", "coco_dava@hotmail.com");
		
	
	}
	
	 public void buttonAction(ActionEvent actionEvent) {
		 Productos nP=new Productos(agregarP.getNombreProducto(), agregarP.getCategoria(), agregarP.getPrecio(),agregarP.getDescripcion()
					,agregarP.getTiempoG());
			ProductoDaoImpl pd=new ProductoDaoImpl();
			pd.insertProducto(nP);
		 
	        addMessage("Producto Agregado Correctamente");
	    }
	     
	    public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }

}