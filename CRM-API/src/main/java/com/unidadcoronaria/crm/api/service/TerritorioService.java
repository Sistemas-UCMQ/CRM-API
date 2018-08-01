package com.unidadcoronaria.crm.api.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.unidadcoronaria.crm.api.domain.Territorio;
import com.unidadcoronaria.crm.api.repository.TerritorioRepository;


@Service
public class TerritorioService {
	
	final static Logger logger = Logger.getLogger(TerritorioService.class);	
	
	@Autowired
	private TerritorioRepository territorioRepository;
	
	public List<Territorio> getLocalidadesOperativas(){
		return Lists.newArrayList(territorioRepository.getLocalidadesList());
	}

}
