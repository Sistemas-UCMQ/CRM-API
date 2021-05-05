package com.unidadcoronaria.crm.api.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.crm.api.domain.Afiliado;


@Repository
public interface AfiliadoRepository extends CrudRepository<Afiliado, Long> {
	
	/*@Query("SELECT e FROM Empresa e WHERE e.grupoUcmq = 'T'")
	public List<Empresa> getEmpresasList();*/
	
	public Afiliado findByNumeroDocumento(int numeroDocumento);

    @Query(value = "Select R_SocioInfo From TlmkLlam_Crm_CheckTelSocio(:telephone)", nativeQuery = true)
    public String checkTelephone(@Param("telephone") String telephone);
    

    
    
    

    
}
