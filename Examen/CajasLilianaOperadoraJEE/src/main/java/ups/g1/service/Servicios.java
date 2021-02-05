package ups.g1.service;

import java.util.Random;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Servicios {
	
	@WebMethod
	
	public int solicitud() {
		Random ran=new Random();
		int valor =ran.nextInt();
		
			if(valor == 1) {
				System.out.println(valor +" Su solicitud de recarga Aceptada");
			}else {
				System.out.println(valor +" Su solicitud de recarga Rechazada");
			}
			
			return valor;
	}
	
}
