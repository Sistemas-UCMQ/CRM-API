package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.service.AfiliadoService;

@RestController
public class AfiliadoController {
	
	@Autowired
	private AfiliadoService afiliadoService;
	
	@RequestMapping(value = "/afiliado/documento/{numeroDocumento}", method = RequestMethod.GET)
	public ResponseEntity<?> getAfiliado(@PathVariable("numeroDocumento") int numeroDocumento) {
		return ResponseEntity.ok(afiliadoService.getByNumeroDocumento(numeroDocumento));
	}
	
	@RequestMapping(value = "/afiliado/telefono/{telefono}", method = RequestMethod.GET)
	public ResponseEntity<?> getAfiliado(@PathVariable("telefono") String telefono) {
		return ResponseEntity.ok(afiliadoService.getByTelefono(telefono));
	}

}

