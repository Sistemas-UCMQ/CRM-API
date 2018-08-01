package com.unidadcoronaria.crm.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_PREAFILIACION", sequenceName = "IDPREAFILIACION")
@Table(name="PREAFILIACIONES")
public class Preafiliacion {
	
	@Id
	@Column(name = "IDPREAFILIACION")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PREAFILIACION")
	private Integer idPreafiliacion;

	@ManyToOne
	@JoinColumn(name = "IDEMPRESA")
	private Empresa empresa;
	
	@Column(name = "FECHA")
	private Date fecha;
	
	@Column(name = "HORA")
	private String hora;
	
	@ManyToOne
	@JoinColumn(name = "IDCALLE")
	private Calle calle;
	
	@ManyToOne
	@JoinColumn(name = "IDVENDEDOR")
	private Vendedor vendedor;

	public Integer getIdPreafiliacion() {
		return idPreafiliacion;
	}

	public void setIdPreafiliacion(Integer idPreafiliacion) {
		this.idPreafiliacion = idPreafiliacion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Calle getCalle() {
		return calle;
	}

	public void setCalle(Calle calle) {
		this.calle = calle;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	
	

}
