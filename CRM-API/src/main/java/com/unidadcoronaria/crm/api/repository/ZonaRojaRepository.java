package com.unidadcoronaria.crm.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.ZonaRoja;

@Repository
public interface ZonaRojaRepository extends CrudRepository<ZonaRoja, Long> {
	
    @Query(value = "Select R_IdZonaRoja From ZonasRoj_Typ_GetPuntoEnZona(:latitud,:longitud)", nativeQuery = true) 
    public Long checkZonaRoja(@Param("latitud") Double latitud, @Param("longitud") Double longitud);
    
    ZonaRoja findByIdZonaRoja(Long idZonaRoja);
	

}
