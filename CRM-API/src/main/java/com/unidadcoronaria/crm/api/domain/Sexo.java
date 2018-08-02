package com.unidadcoronaria.crm.api.domain;

public enum Sexo
{
	FEMENINO("Femenino"), 
	MASCULINO("Masculino");
	
	private String sexo;
	
	private Sexo (String sexo){
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

}
