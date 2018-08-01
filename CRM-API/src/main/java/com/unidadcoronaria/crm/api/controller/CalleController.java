package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.CalleService;

@RestController
public class CalleController {
	
	@Autowired
	private CalleService calleService;
	
	@RequestMapping(value = "/calle/{idLocalidad}", method = RequestMethod.GET)
	public ResponseEntity<?> getCallesByLocalidad(@PathVariable("idLocalidad") Integer idLocalidad) {
		return ResponseEntity.ok(calleService.getCallesByLocalidad(idLocalidad));
	}

}

