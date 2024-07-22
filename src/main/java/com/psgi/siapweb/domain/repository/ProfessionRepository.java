package com.psgi.siapweb.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psgi.siapweb.domain.model.Profesion;
import java.util.List;


public interface ProfessionRepository extends JpaRepository<Profesion, Long>{

    List<Profesion> findAllByVcdescripcion(String vcdescripcion);

}
