package com.psgi.siapweb.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psgi.siapweb.domain.model.General;
import java.util.List;
import java.util.Optional;


public interface GeneralRepository extends JpaRepository<General, Long> {


    Optional<General> findByVcdescripcion(String vcdescripcion);
}
