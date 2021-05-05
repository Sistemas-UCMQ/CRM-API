package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.EstadoService;

@RestController
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(value = "/estado", method = RequestMethod.GET)
	public ResponseEntity<?> getEstados() {
		return ResponseEntity.ok(estadoService.getAll());
	}

}

