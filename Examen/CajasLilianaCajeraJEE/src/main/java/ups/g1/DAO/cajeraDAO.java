package ups.g1.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.g1.modelo.Cajero;

@Stateless
public class cajeraDAO {

	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	
	
	//DAO crear
	public boolean insertJPA(Cajero entity) throws SQLException {
			em.persist(entity);
			return true;
		}
	//DAO actualizar
		public void updateJPA(Cajero cliente) throws Exception {
	        try {
	            em.merge(cliente);
	        } catch (Exception e) {
	            throw new Exception("Erro actualizar registro " +e.getMessage());
	        }
	    }
		
	//DAO borrar
	    public void deleteId(String cedula) throws Exception {
	        try {
	            em.remove(read(cedula));
	        } catch (Exception e) {
	            throw new Exception("Error Eliminar Cliente " +e.getMessage());
	        }
	    }

	//DAO buscar
	    public Cajero read(String cedula) throws Exception {
	        try {
	            return em.find(Cajero.class, cedula);
	        } catch (Exception e) {
	            throw new Exception("Erro leer Cliente " +e.getMessage());
	        }
	    }
	
	    public boolean crearCuenta(Cajero cuenta) {
	    	try {
	    		em.persist(cuenta);
	    		return true;
	    	}catch (Exception e) {
				return false;
			}
	    }
	    
}
