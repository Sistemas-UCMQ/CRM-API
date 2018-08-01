package com.unidadcoronaria.crm.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.crm.api.domain.Vendedor;
import com.unidadcoronaria.crm.api.repository.VendedorRepository;

@Service
public class VendedorService {
	
	final static Logger logger = Logger.getLogger(VendedorService.class);	
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public Vendedor getVendedorByIdVendedor(Integer idVendedor){
		return vendedorRepository.findByIdVendedor(idVendedor);
	}

}
