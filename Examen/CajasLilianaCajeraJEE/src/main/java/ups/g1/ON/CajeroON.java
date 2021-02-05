package ups.g1.ON;

import java.net.URL;
import java.sql.SQLException;
import java.util.Random;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.namespace.QName;

import ups.g1.modelo.Cajero;
import ups.g1.service.Servicios;
import ups.g1.service.ServiciosService;
import ups.g1.DAO.cajeraDAO;
import ups.g1.ON.CajeroON;

public class CajeroON {
	@Inject
	private cajeraDAO daoCajero;
	
	 private static final QName SERVICE_NAME = new QName("http://service.g1.ups/", "ServiciosService");
	 
	
	public boolean registrarRecarga(Cajero cliente) throws Exception {

		try {
			daoCajero.insertJPA(cliente);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al registrar");
		}
		return true;
	}
	
	public boolean actualizarRecarga(Cajero cliente) throws Exception {
		
		try {
			daoCajero.updateJPA(cliente);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al registrar");
		}
		return true;
	}
	
	public boolean eliminarRecarga(String cedula) throws Exception {
		
		try {
			daoCajero.deleteId(cedula);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al eliminar");
		}
		return true;
	}
	
	public Cajero buscarRecarga(String cedula) throws Exception {
		
		try {
			return  daoCajero.read(cedula);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al encontrar resultado");
		}
	}
	
	
	public void crearCuenta(Cajero cuenta) {
		daoCajero.crearCuenta(cuenta);
	}
	
	
	
	public int solicitudRecarga() {
		URL wsdlURL = ServiciosService.WSDL_LOCATION;
		ServiciosService ss = new ServiciosService(wsdlURL, SERVICE_NAME);
        Servicios port = ss.getServiciosPort();  
        int numero = port.solicitud();
        System.out.print(numero);
        return numero;
	}
}
