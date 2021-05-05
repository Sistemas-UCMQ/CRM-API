package com.unidadcoronaria.crm.api.domain;

public enum TipoDocumento
{
	CI("CI"), 
	DNI("DNI"),
	EN_TRAMITE("En trámite"), 
	LC("LC"),
	LE("LE"), 
	NINGUNO("Ninguno"),
	PASAPORTE("Pasaporte");
	
	private String tipoDocumento;
	
	private TipoDocumento (String tipoDocumento){
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

}
