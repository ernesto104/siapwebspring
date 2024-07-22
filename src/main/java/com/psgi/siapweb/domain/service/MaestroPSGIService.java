package com.psgi.siapweb.domain.service;

import java.util.List;

import com.psgi.siapweb.domain.model.MaestroPSGI;


public interface MaestroPSGIService {



    MaestroPSGI getMaestroPSGIById(Long id_documento);
    List<MaestroPSGI> getAllMaestroPSGI();

    List<MaestroPSGI> getAllMaestroPSGIByCompleteName(String completeName);

    MaestroPSGI createMaestroPSGI(MaestroPSGI typeDocument);

    MaestroPSGI editMaestroPSGIById(Long id_documento, MaestroPSGI typeDocument);

    void deleteMaestroPSGI(Long id_documento);
}
