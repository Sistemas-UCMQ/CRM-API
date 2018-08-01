package com.unidadcoronaria.crm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_EMPRESA", sequenceName = "IDEMPRESA")
@Table(name="EMPRESAS")
public class Empresa {
	
	@Id
	@Column(name = "IDEMPRESA")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_EMPRESA")
	private Integer idEmpresa;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ALIAS")
	private String alias;
	
	@Column(name = "GRUPOUCMQ")
	private char grupoUcmq;
	
	@Column(name = "NOMBREDEFANTASIA")
	private String nombreDeFantasia;

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
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

	public char getGrupoUcmq() {
		return grupoUcmq;
	}

	public void setGrupoUcmq(char grupoUcmq) {
		this.grupoUcmq = grupoUcmq;
	}

	public String getNombreDeFantasia() {
		return nombreDeFantasia;
	}

	public void setNombreDeFantasia(String nombreDeFantasia) {
		this.nombreDeFantasia = nombreDeFantasia;
	}
	
	

}
