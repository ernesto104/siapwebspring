package com.psgi.siapweb.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psgi.siapweb.domain.model.DetalleGeneral;
import java.util.List;


public interface DetalleGeneralRepository extends JpaRepository<DetalleGeneral, Long>{

    List<DetalleGeneral> findAllByGeneralId (Long generalId);

    List<DetalleGeneral> findAllByGeneralVcdescripcion (String vcdescripcion);

}
