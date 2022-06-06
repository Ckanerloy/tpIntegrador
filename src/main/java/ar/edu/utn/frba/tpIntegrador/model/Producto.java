package ar.edu.utn.frba.tpIntegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import ar.edu.utn.frba.tpIntegrador.CotizadorDolar;

@Entity
public class Producto {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Double precio;
	private String descripcion;
	private String nombre;
	@ManyToOne
	private CotizadorDolar cotizadorDolar;
	//private boolean estaDisponible;
	private int stock;
	@ManyToOne
	private Proveedor proveedor;
	private Boolean estaEnDolares;
	
	protected Producto() {
		super();
	}
	
	public Producto( String descripcion,String nombre,Double precio, int stock,
			Proveedor proveedor,Boolean estaEnDolares) {
		super();
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio= precio;
		//this.estaDisponible = estaDisponible;
		this.stock = stock;
		this.proveedor = proveedor;
		this.cotizadorDolar=cotizadorDolar;
		this.estaEnDolares=estaEnDolares;
	}
/*	
	public Double getPrecioCompra() {
		return cotizador.calcularPrecio(this.precio);
	}
*/	
	public Double getPrecio() {
		if(this.getEstaEnDolares()) {
			return cotizadorDolar.getPrecioDolar() * this.precio;
		}else {
			return this.precio;
		}
		
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CotizadorDolar getCotizadorDolar() {
		return cotizadorDolar;
	}

	public void setCotizadorDolar(CotizadorDolar cotizadorDolar) {
		this.cotizadorDolar = cotizadorDolar;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Boolean getEstaEnDolares() {
		return estaEnDolares;
	}

	public void setEstaEnDolares(Boolean estaEnDolares) {
		this.estaEnDolares = estaEnDolares;
	}
	
	
	//Funciones

	public void restarStock(int cantidad) throws StockInsuficienteException{
		if(stock<cantidad){
			throw new StockInsuficienteException("El stock es insuficiente en el producto");
		}
		this.stock= stock- cantidad;
	}
	
	//public double calcularPrecioEnDolar(){}
}
