package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.TerritorioService;

@RestController
public class TerritorioController {
	
	@Autowired
	private TerritorioService territorioService;
	
	@RequestMapping(value = "/localidad", method = RequestMethod.GET)
	public ResponseEntity<?> getLocalidadesOperativas() {
		return ResponseEntity.ok(territorioService.getLocalidadesOperativas());
	}

}

