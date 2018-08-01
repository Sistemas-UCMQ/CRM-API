package com.unidadcoronaria.crm.api.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.unidadcoronaria.crm.api.domain.Preafiliacion;
import com.unidadcoronaria.crm.api.repository.PreafiliacionRepository;


@Service
public class PreafiliacionService {
	
	final static Logger logger = Logger.getLogger(PreafiliacionService.class);	
	
	@Autowired
	private PreafiliacionRepository preafiliacionRepository;
	
	public List<Preafiliacion> getAll(){
		return Lists.newArrayList(preafiliacionRepository.findAll());
	}

}
