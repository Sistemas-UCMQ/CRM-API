package com.unidadcoronaria.crm.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.unidadcoronaria.crm.api.domain.Afiliado;
import com.unidadcoronaria.crm.api.domain.AfiliadoDTO;
import com.unidadcoronaria.crm.api.repository.AfiliadoRepository;
import com.unidadcoronaria.crm.api.repository.DomicilioAfiliadoRepository;

@Service
public class AfiliadoService {
	
	final static Logger logger = Logger.getLogger(AfiliadoService.class);	
	
	@Autowired
	private AfiliadoRepository afiliadoRepository;
	
	@Autowired
	private DomicilioAfiliadoRepository domicilioAfiliadoRepository;
	
	public Afiliado getByNumeroDocumento(int numeroDocumento){
		return afiliadoRepository.findByNumeroDocumento(numeroDocumento);
	}
	
	public AfiliadoDTO getByTelefono(String telephone){
		String afiliadoInfo = afiliadoRepository.checkTelephone(telephone);
		
	
		Gson g = new Gson();
		AfiliadoDTO p = g.fromJson(afiliadoInfo, AfiliadoDTO.class);	
		
		//AfiliadoDTO afiliadoDTO = new AfiliadoDTO();
		p.setCustomerType("Grupo Familiar");
		
		System.out.print(p);
		
		
		
		return p;
				
				
	}

}
