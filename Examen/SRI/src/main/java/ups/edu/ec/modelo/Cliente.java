package ups.edu.ec.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	private String cedula;
	private String celular;
	private String nombre;
	private double valor;
	
	@OneToOne
	@JoinColumn(name="recarga")
	private Cliente cliente;
}
