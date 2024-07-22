package com.psgi.siapweb.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psgi.siapweb.domain.model.MaestroPSGI;
import java.util.List;


public interface MaestroPSGIRepository extends JpaRepository<MaestroPSGI, Long>{

    List<MaestroPSGI> findByVcnombrecompletoContains (String vc_nombre_completo);
}
