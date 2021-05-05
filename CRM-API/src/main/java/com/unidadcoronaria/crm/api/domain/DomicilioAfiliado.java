package com.unidadcoronaria.crm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_DOMICILIOAFILIADO", sequenceName = "IDDOMICILIOAFILIADO")
@Table(name="DOMICILIOSAFILIADOS")
public class DomicilioAfiliado {
	
	@Id
	@Column(name = "IDDOMICILIOAFILIADO")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_DOMICILIOAFILIADO")
	private Integer idDomicilioAfiliado;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "TIPO")
	private String tipo;

	public Integer getIdDomicilioAfiliado() {
		return idDomicilioAfiliado;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setIdDomicilioAfiliado(Integer idDomicilioAfiliado) {
		this.idDomicilioAfiliado = idDomicilioAfiliado;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
