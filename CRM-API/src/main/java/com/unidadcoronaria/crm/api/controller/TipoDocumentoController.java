package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.TipoDocumentoService;

@RestController
public class TipoDocumentoController {
	
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@RequestMapping(value = "/tipoDocumento", method = RequestMethod.GET)
	public ResponseEntity<?> getTiposDocumento() {
		return ResponseEntity.ok(tipoDocumentoService.getAll());
	}

}

