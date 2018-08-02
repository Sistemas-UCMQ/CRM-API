package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.ModoCobranzaService;

@RestController
public class ModoCobranzaController {
	
	@Autowired
	private ModoCobranzaService modoCobranzaService;
	
	@RequestMapping(value = "/modoCobranza", method = RequestMethod.GET)
	public ResponseEntity<?> getModosCobranza() {
		return ResponseEntity.ok(modoCobranzaService.getAll());
	}

}

