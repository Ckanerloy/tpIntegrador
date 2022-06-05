package ar.edu.utn.frba.tpIntegrador.model;

import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Cupon")
public class CuponProveedor extends Promocion{
	private boolean noEstaUsado;
	private double descuento;
	@ManyToOne
	private Proveedor proveedor;
	
	protected CuponProveedor() {
		super();
	}
	public CuponProveedor(boolean estaUsado, double descuento, Proveedor proveedor) {
		super();
		this.noEstaUsado = estaUsado;
		this.descuento = descuento;
		this.proveedor = proveedor;
	}
	
	@Override
	public double aplicar(CarritoDeCompra carritoDeCompra) {
		return 	carritoDeCompra.getItemsCompras().stream().filter(x->x.mismoProveedor(proveedor)&noEstaUsado).mapToDouble(x->x.calcularPrecioItem() * descuento).sum();
	}
	
}
