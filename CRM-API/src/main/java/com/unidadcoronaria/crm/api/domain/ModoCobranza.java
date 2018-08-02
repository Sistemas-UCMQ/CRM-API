package com.unidadcoronaria.crm.api.domain;

public enum ModoCobranza
{
	DOMICILIARIA("Domiciliaria"), 
	DEBITO_AUTOMATICO("Débito Automático"),
	EN_BASE("En Base"), 
	PAGO_FACIL("Pago Fácil"),
	SIN_CARGO("Sin Cargo"); 
	
	private String modoCobranza;
	
	private ModoCobranza (String modoCobranza){
		this.modoCobranza = modoCobranza;
	}

	public String getModoCobranza() {
		return modoCobranza;
	}

}
