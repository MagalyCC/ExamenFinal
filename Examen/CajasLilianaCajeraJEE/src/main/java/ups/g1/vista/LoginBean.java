package ups.g1.vista;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import ups.g1.ON.CajeroON;
import ups.g1.modelo.Cajero;
/**
 * 
 * @Named Es un calificador basado en cadena (String) @Scope : Identifica anotaciones de alcance
 * @RequestScoped define el alcance en el que se almacenará el bean
 */
@Named
@RequestScoped
public class LoginBean implements Serializable{
	
	@Inject
	private CajeroON ON;
	private String cedula;
	private String celular;
	private String sms;
	private double valor;
	private int cont = 0;
	
	private Cajero cajero;

	public LoginBean() {
		init();
	}


	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


public String getSms() {
		return sms;
	}


	public void setSms(String sms) {
		this.sms = sms;
	}


public void init () {
	cajero= new Cajero();
	cedula= new String();
	celular= new String();
	//sms=new String();
}
	

public void doRegistrar() {
	Cajero c=new Cajero();
	c.setCedula(cedula);
	c.setCelular(celular);
	c.setValor(valor);
ON.solicitudRecarga();
/*ON.crearCuenta(c);
try {
	ON.registrarRecarga(c);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/

}




}
