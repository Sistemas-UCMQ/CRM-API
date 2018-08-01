package com.unidadcoronaria.crm.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.Preafiliacion;

@Repository
public interface PreafiliacionRepository extends CrudRepository<Preafiliacion, Long> {

}
