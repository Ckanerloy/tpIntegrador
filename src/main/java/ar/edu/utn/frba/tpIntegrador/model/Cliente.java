package ar.edu.utn.frba.tpIntegrador.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	private String nombreYApellido;
	private Collection<OrdenDeCompra> comprasRealizadas;
	private LocalDate fechaDeNacimiento;
	private TipoDeDocumento tipoDeDocumento;
	private String nroDeDocumento;
	private String telefono;
	private String mail;
	
	public Cliente(String nombreYApellido, Collection<OrdenDeCompra> comprasRealizadas, LocalDate fechaDeNacimiento,
			TipoDeDocumento tipoDeDocumento, String nroDeDocumento, String telefono, String mail) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.comprasRealizadas = new ArrayList<>();
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tipoDeDocumento = tipoDeDocumento;
		this.nroDeDocumento = nroDeDocumento;
		this.telefono = telefono;
		this.mail = mail;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	public Collection<OrdenDeCompra> getComprasRealizadas() {
		return comprasRealizadas;
	}
	public void setComprasRealizadas(Collection<OrdenDeCompra> comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public TipoDeDocumento getTipoDeDocumento() {
		return tipoDeDocumento;
	}
	public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}
	public String getNroDeDocumento() {
		return nroDeDocumento;
	}
	public void setNroDeDocumento(String nroDeDocumento) {
		this.nroDeDocumento = nroDeDocumento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	// Funciones
	public void realizarComprar(OrdenDeCompra ordenDeCompra) {
		comprasRealizadas.add(ordenDeCompra);
	}
}
