package com.unidadcoronaria.crm.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.crm.api.domain.ZonaRoja;
import com.unidadcoronaria.crm.api.repository.ZonaRojaRepository;

@Service
public class ZonaRojaService {
	
	final static Logger logger = Logger.getLogger(ZonaRojaService.class);	
	
	@Autowired
	private ZonaRojaRepository zonaRojaRepository;
	
	public ZonaRoja checkZonaRoja(Double latitud, Double longitud){
		Long idZonaRoja = zonaRojaRepository.checkZonaRoja(latitud, longitud);
		return zonaRojaRepository.findByIdZonaRoja(idZonaRoja);   
	}

}
