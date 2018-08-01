package com.unidadcoronaria.crm.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.Territorio;

@Repository
public interface TerritorioRepository extends CrudRepository<Territorio, Long> {
	
	@Query("SELECT t FROM Territorio t WHERE t.nivel = 4 and idZonaOperativa > 0")
	public List<Territorio> getLocalidadesList();

}
