package com.unidadcoronaria.crm.api.domain;

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
@SequenceGenerator(name = "INC_CALLE", sequenceName = "IDCALLE")
@Table(name="CALLES")
public class Calle {
	
	@Id
	@Column(name = "IDCALLE")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_CALLE")
	private Integer idCalle;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "IDLOCALIDAD")
	private Territorio localidad;

	public Integer getIdCalle() {
		return idCalle;
	}

	public void setIdCalle(Integer idCalle) {
		this.idCalle = idCalle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Territorio getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Territorio localidad) {
		this.localidad = localidad;
	}

}
