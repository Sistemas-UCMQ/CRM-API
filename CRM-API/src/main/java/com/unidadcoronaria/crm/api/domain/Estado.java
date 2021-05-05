package com.unidadcoronaria.crm.api.domain;

public enum Estado
{
	PENDIENTE(1,"Pendiente"), 
	CONFIRMADA(2,"Confirmada"),
	RECHAZADA(3,"Rechazada"), 
	CERRADA(4,"Cerrada");
	
	private int tidEstado;
	private String estado;
	
	private Estado (int tidEstado, String estado){
		this.tidEstado = tidEstado;
		this.estado = estado;
	}

	public int getTidEstado() {
		return tidEstado;
	}
	
	public String getEstado() {
		return estado;
	}

}
