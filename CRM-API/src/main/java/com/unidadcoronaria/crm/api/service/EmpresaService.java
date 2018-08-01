package com.unidadcoronaria.crm.api.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.unidadcoronaria.crm.api.domain.Empresa;
import com.unidadcoronaria.crm.api.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	final static Logger logger = Logger.getLogger(EmpresaService.class);	
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> getAll(){
		return Lists.newArrayList(empresaRepository.getEmpresasList());
	}

}
