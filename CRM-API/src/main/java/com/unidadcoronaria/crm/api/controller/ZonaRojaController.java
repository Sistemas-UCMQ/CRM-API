package com.unidadcoronaria.crm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unidadcoronaria.crm.api.domain.ZonaRoja;
import com.unidadcoronaria.crm.api.service.ZonaRojaService;

@RestController
public class ZonaRojaController {
	
	@Autowired
	private ZonaRojaService zonaRojaService;
	
	@RequestMapping(value = "/zonaRoja", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public ZonaRoja checkZonaRoja(
			@RequestParam(value = "latitud", required = false) Double latitud,
			@RequestParam(value = "longitud", required = false) Double longitud) {
		return zonaRojaService.checkZonaRoja(latitud, longitud);
	}

}

