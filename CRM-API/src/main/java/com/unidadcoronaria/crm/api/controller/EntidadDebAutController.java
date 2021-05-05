package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.EntidadDebAutService;

@RestController
public class EntidadDebAutController {
	
	@Autowired
	private EntidadDebAutService entidadDebAutService;
	
	@RequestMapping(value = "/entidadDebAut", method = RequestMethod.GET)
	public ResponseEntity<?> getEntidadesDebAut() {
		return ResponseEntity.ok(entidadDebAutService.getAll());
	}

}

