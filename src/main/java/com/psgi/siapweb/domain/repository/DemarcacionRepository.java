package com.psgi.siapweb.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psgi.siapweb.domain.model.Demarcacion;
import java.util.List;


public interface DemarcacionRepository extends JpaRepository<Demarcacion, Long>{

    Optional<Demarcacion> findFirstByCodigo(String codigo);
}
