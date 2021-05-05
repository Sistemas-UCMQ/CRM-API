package com.unidadcoronaria.crm.api.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.crm.api.domain.TipoDocumento;

@Service
public class TipoDocumentoService {
	
	final static Logger logger = Logger.getLogger(TipoDocumentoService.class);	
	
	public List<String> getAll(){
		
		List<String> tiposDocumento = new ArrayList<String>();
		
		tiposDocumento.add(TipoDocumento.CI.getTipoDocumento());
		tiposDocumento.add(TipoDocumento.DNI.getTipoDocumento());
		tiposDocumento.add(TipoDocumento.EN_TRAMITE.getTipoDocumento());
		tiposDocumento.add(TipoDocumento.LC.getTipoDocumento());
		tiposDocumento.add(TipoDocumento.LE.getTipoDocumento());
		tiposDocumento.add(TipoDocumento.NINGUNO.getTipoDocumento());
		tiposDocumento.add(TipoDocumento.PASAPORTE.getTipoDocumento());
		
		return tiposDocumento;
	}

}
