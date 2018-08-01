package com.unidadcoronaria.crm.api.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.unidadcoronaria.crm.api.domain.Calle;
import com.unidadcoronaria.crm.api.repository.CalleRepository;

@Service
public class CalleService {
	
	final static Logger logger = Logger.getLogger(CalleService.class);	
	
	@Autowired
	private CalleRepository calleRepository;
	
	public List<Calle> getCallesByLocalidad(Integer idLocalidad){
		return Lists.newArrayList(calleRepository.getCallesByLocalidad(idLocalidad));
	}

}
