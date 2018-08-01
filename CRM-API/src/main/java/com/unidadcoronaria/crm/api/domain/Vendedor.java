package com.unidadcoronaria.crm.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_VENDEDOR", sequenceName = "IDVENDEDOR")
@Table(name="VENDEDORES")
public class Vendedor {
	
	@Id
	@Column(name = "IDVENDEDOR")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_VENDEDOR")
	private Integer idVendedor;
	
	@Column(name = "NOMBRE")
	private String name;
	
	@Column(name = "IDUSUARIO")
	private Integer idUsuario;
	
	@Column(name = "NUMEROAGENTE")
	private Integer numeroAgente;
	
	@Column(name = "FECHAALTA")
	private Date fechaAlta;
	
	@Column(name = "FECHABAJA")
	private Date fechaBaja;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getNumeroAgente() {
		return numeroAgente;
	}

	public void setNumeroAgente(Integer numeroAgente) {
		this.numeroAgente = numeroAgente;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
}
