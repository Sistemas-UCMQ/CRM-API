package com.unidadcoronaria.crm.api.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.unidadcoronaria.crm.api.domain.EntidadDebAut;
import com.unidadcoronaria.crm.api.repository.EntidadDebAutRepository;

@Service
public class EntidadDebAutService {
	
	final static Logger logger = Logger.getLogger(EntidadDebAutService.class);	
	
	@Autowired
	private EntidadDebAutRepository entidadDebAutRepository;
	
	public List<EntidadDebAut> getAll(){
		return Lists.newArrayList(entidadDebAutRepository.findAll());
	}

}
