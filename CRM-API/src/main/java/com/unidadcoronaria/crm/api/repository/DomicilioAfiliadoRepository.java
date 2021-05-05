package com.unidadcoronaria.crm.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.DomicilioAfiliado;

@Repository
public interface DomicilioAfiliadoRepository extends CrudRepository<DomicilioAfiliado, Long> {

	
	public DomicilioAfiliado findByTelefono(String telefono);

}
