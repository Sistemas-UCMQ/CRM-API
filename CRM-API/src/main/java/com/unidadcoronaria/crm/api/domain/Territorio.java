package com.unidadcoronaria.crm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_TERRITORIO", sequenceName = "IDTERRITORIO")
@Table(name="TERRITORIOS")
public class Territorio {
	
	@Id
	@Column(name = "IDTERRITORIO")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_TERRITORIO")
	private Integer idTerritorio;
	
	@Column(name = "NOMBRE")
	private String name;
	
	@Column(name = "NIVEL")
	private Integer nivel;
	
	@Column(name = "IDZONAOPERATIVA")
	private Integer idZonaOperativa;

	public Integer getIdTerritorio() {
		return idTerritorio;
	}

	public void setIdTerritorio(Integer idTerritorio) {
		this.idTerritorio = idTerritorio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getIdZonaOperativa() {
		return idZonaOperativa;
	}

	public void setIdZonaOperativa(Integer idZonaOperativa) {
		this.idZonaOperativa = idZonaOperativa;
	}

	

}
