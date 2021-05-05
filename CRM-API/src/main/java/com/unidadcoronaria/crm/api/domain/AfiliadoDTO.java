package com.unidadcoronaria.crm.api.domain;

public class AfiliadoDTO {
	
	private String name;
	private String state;
	private String customerType;
	private String externalId;
	private String telephone;
	
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public String getCustomerType() {
		return customerType;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
