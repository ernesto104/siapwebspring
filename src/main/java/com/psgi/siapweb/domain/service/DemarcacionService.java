package com.psgi.siapweb.domain.service;

import java.util.List;

import com.psgi.siapweb.domain.model.Demarcacion;

public interface DemarcacionService {

    Demarcacion getDemarcacionById(Long id_demarcacion);

    Demarcacion getDemarcacionByVcCodigo (String vc_codigo);
    List<Demarcacion> getAllDemarcacion();

    Demarcacion createDemarcacion(Demarcacion demarcacion);

    Demarcacion editDemarcacionById(Long id_demarcacion, Demarcacion demarcacion);

    void deleteDemarcacion(Long id_demarcacion);

}
