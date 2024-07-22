package com.psgi.siapweb.domain.service;

import java.util.List;

import com.psgi.siapweb.domain.model.DetalleGeneral;

public interface DetalleGeneralService {


    DetalleGeneral getDetalleGeneralById(Long id_DetalleGeneral);

    //DetalleGeneral getDetalleGeneralByVcCodigo (String vc_codigo);
    List<DetalleGeneral> getAllDetalleGeneral();

    List<DetalleGeneral> getAllDetalleGeneralByEducation(Long id_education);

    List<DetalleGeneral> getAllDetalleGeneralByGeneralDescription(String vcdescripcion);

    DetalleGeneral createDetalleGeneral(DetalleGeneral DetalleGeneral, String generalName);

    DetalleGeneral editDetalleGeneralById(Long id_DetalleGeneral, DetalleGeneral DetalleGeneral);

    void deleteDetalleGeneral(Long id_DetalleGeneral);
}
