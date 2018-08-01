package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.PreafiliacionService;

@RestController
public class PreafiliacionController {
	
	@Autowired
	private PreafiliacionService preafiliacionService;
	
	@RequestMapping(value = "/preafiliacion", method = RequestMethod.GET)
	public ResponseEntity<?> getPreafiliaciones() {
		return ResponseEntity.ok(preafiliacionService.getAll());
	}

}

