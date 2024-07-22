package com.psgi.siapweb.domain.service;

import java.util.List;

import com.psgi.siapweb.domain.model.Demarcacion;
import com.psgi.siapweb.domain.model.Profesion;

public interface ProfessionService {

    List<Profesion> getAllprofesion();

    Profesion getProfesionById(Long id_profesion);

    List<Profesion> getAllProfesionByName(String profesionName);

    Profesion createprofesion(Profesion profesion);

    Profesion editprofesionById(Long id_profesion, Profesion profesion);

    void deleteprofesion(Long id_profesion);

}
