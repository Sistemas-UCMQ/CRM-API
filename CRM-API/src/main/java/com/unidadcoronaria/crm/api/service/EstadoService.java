package com.unidadcoronaria.crm.api.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.crm.api.domain.Estado;

@Service
public class EstadoService {
	
	final static Logger logger = Logger.getLogger(EstadoService.class);	
	
	public List<String> getAll(){
		
		List<String> estado = new ArrayList<String>();
		
		estado.add(Estado.PENDIENTE.getEstado());
		estado.add(Estado.CONFIRMADA.getEstado());
		estado.add(Estado.RECHAZADA.getEstado());
		estado.add(Estado.CERRADA.getEstado());
		
		return estado;
	}

}
