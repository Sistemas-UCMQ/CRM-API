package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.VendedorService;

@RestController
public class VendedorController {
	
	@Autowired
	private VendedorService vendedorService;
	
	@RequestMapping(value = "/vendedor/{idVendedor}", method = RequestMethod.GET)
	public ResponseEntity<?> getVendedor(@PathVariable("idVendedor") Integer idVendedor) {
		return ResponseEntity.ok(vendedorService.getVendedorByIdVendedor(idVendedor));
	}

}

