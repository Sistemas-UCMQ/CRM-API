package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.EmpresaService;

@RestController
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@RequestMapping(value = "/empresa", method = RequestMethod.GET)
	public ResponseEntity<?> getEmpresas() {
		return ResponseEntity.ok(empresaService.getAll());
	}

}

