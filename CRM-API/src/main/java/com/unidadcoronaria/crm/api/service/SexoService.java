package com.unidadcoronaria.crm.api.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.crm.api.domain.Sexo;

@Service
public class SexoService {
	
	final static Logger logger = Logger.getLogger(SexoService.class);	
	
	public List<String> getAll(){
		
		List<String> sexos = new ArrayList<String>();
		
		sexos.add(Sexo.FEMENINO.getSexo());
		sexos.add(Sexo.MASCULINO.getSexo());
		
		return sexos;
	}

}
