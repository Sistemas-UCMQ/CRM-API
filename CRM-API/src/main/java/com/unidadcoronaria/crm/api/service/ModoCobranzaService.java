package com.unidadcoronaria.crm.api.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


import com.unidadcoronaria.crm.api.domain.ModoCobranza;

@Service
public class ModoCobranzaService {
	
	final static Logger logger = Logger.getLogger(ModoCobranzaService.class);	
	
	public List<String> getAll(){
		
		List<String> modosCobranza = new ArrayList<String>();
		
		modosCobranza.add(ModoCobranza.DEBITO_AUTOMATICO.getModoCobranza());
		modosCobranza.add(ModoCobranza.DOMICILIARIA.getModoCobranza());
		modosCobranza.add(ModoCobranza.EN_BASE.getModoCobranza());
		modosCobranza.add(ModoCobranza.PAGO_FACIL.getModoCobranza());
		modosCobranza.add(ModoCobranza.SIN_CARGO.getModoCobranza());
		
		return modosCobranza;
	}

}
