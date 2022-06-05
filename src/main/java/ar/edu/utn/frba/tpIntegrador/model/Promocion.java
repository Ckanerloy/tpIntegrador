package ar.edu.utn.frba.tpIntegrador.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Promocion {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	public double aplicar(CarritoDeCompra CarritoDeCompra) {
		return 0;
	};
}
