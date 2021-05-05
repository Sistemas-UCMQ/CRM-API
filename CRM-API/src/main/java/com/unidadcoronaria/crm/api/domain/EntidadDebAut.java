package com.unidadcoronaria.crm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_ENTIDADDEBAUT", sequenceName = "IDENTIDADDEBAUT")
@Table(name="ENTIDADESDEBAUT")
public class EntidadDebAut {
	
	@Id
	@Column(name = "IDENTIDADDEBAUT")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_ENTIDADDEBAUT")
	private Integer idEntidadDebAut;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ALIAS")
	private String alias;

	public Integer getIdEntidadDebAut() {
		return idEntidadDebAut;
	}

	public void setIdEntidadDebAut(Integer idEntidadDebAut) {
		this.idEntidadDebAut = idEntidadDebAut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	

}
