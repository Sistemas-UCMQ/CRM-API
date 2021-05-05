package com.unidadcoronaria.crm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_AFILIADO", sequenceName = "IDAFILIADO")
@Table(name="AFILIADOS")
public class Afiliado {
	
	@Id
	@Column(name = "IDAFILIADO")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_AFILIADO")
	private Integer idAfiliado;
	
	@Column(name = "NOMBRES")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "NUMERODOCUMENTO")
	private int numeroDocumento;

	public Integer getIdAfiliado() {
		return idAfiliado;
	}

	public void setIdAfiliado(Integer idAfiliado) {
		this.idAfiliado = idAfiliado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	
	

}
