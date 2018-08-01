package com.unidadcoronaria.crm.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.Calle;

@Repository
public interface CalleRepository extends CrudRepository<Calle, Long> {
	
	@Query("SELECT c FROM Calle c WHERE c.localidad.idTerritorio = :idLocalidad")
	public List<Calle> getCallesByLocalidad(@Param("idLocalidad") Integer idLocalidad);

}
