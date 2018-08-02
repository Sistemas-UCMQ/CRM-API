package com.unidadcoronaria.crm.api.domain;

public enum ModoCobranza
{
	DOMICILIARIA("Domiciliaria"), 
	DEBITO_AUTOMATICO("D�bito Autom�tico"),
	EN_BASE("En Base"), 
	PAGO_FACIL("Pago F�cil"),
	SIN_CARGO("Sin Cargo"); 
	
	private String modoCobranza;
	
	private ModoCobranza (String modoCobranza){
		this.modoCobranza = modoCobranza;
	}

	public String getModoCobranza() {
		return modoCobranza;
	}

}
