package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.SexoService;

@RestController
public class SexoController {
	
	@Autowired
	private SexoService sexoService;
	
	@RequestMapping(value = "/sexo", method = RequestMethod.GET)
	public ResponseEntity<?> getSexos() {
		return ResponseEntity.ok(sexoService.getAll());
	}

}

