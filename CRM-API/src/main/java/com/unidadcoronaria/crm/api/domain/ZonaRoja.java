package com.unidadcoronaria.crm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_ZONAROJA", sequenceName = "IDZONAROJA")
@Table(name="ZONASROJAS")
public class ZonaRoja {
	
	@Id
	@Column(name = "IDZONAROJA")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_ZONAROJA")
	private Long idZonaRoja;
	
	@Column(name = "NOMBRE")
	private String nombre;

	public Long getIdZonaRoja() {
		return idZonaRoja;
	}

	public void setIdZonaRoja(Long idZonaRoja) {
		this.idZonaRoja = idZonaRoja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
