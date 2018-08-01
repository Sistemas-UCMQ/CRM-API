package com.unidadcoronaria.crm.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
	
	@Query("SELECT e FROM Empresa e WHERE e.grupoUcmq = 'T'")
	public List<Empresa> getEmpresasList();

}
