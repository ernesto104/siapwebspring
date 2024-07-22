package com.psgi.siapweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psgi.siapweb.domain.model.DetalleGeneral;
import com.psgi.siapweb.domain.model.General;
import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.repository.DetalleGeneralRepository;
import com.psgi.siapweb.domain.repository.GeneralRepository;
import com.psgi.siapweb.domain.service.DetalleGeneralService;

@Service
public class DetalleGeneralServiceImpl implements DetalleGeneralService{

    @Autowired
    DetalleGeneralRepository detalleGeneralRepository;

    @Autowired
    GeneralRepository generalRepository;


    @Override
    public DetalleGeneral getDetalleGeneralById(Long id_DetalleGeneral) {
        // TODO Auto-generated method stub
        return detalleGeneralRepository.findById(id_DetalleGeneral).orElse(null);
        //throw new UnsupportedOperationException("Unimplemented method 'getDetalleGeneralById'");
    }

    @Override
    public List<DetalleGeneral> getAllDetalleGeneral() {

        return detalleGeneralRepository.findAll();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllDetalleGeneral'");
    }

    @Override
    public DetalleGeneral createDetalleGeneral(DetalleGeneral DetalleGeneral, String generalName) {

        General existingGeneral = generalRepository.findByVcdescripcion(generalName).orElse(null);

        DetalleGeneral.setGeneral(existingGeneral);
        DetalleGeneral.setBt_interno(0);
        DetalleGeneral.setIn_order(0);

        return detalleGeneralRepository.save(DetalleGeneral);
        // TODO Auto-generated method stub
        //hrow new UnsupportedOperationException("Unimplemented method 'createDetalleGeneral'");
    }

    @Override
    public DetalleGeneral editDetalleGeneralById(Long id_DetalleGeneral, DetalleGeneral DetalleGeneral) {
        // TODO Auto-generated method stub

        if(detalleGeneralRepository.existsById(id_DetalleGeneral)) {
            DetalleGeneral detalleGeneralExists = detalleGeneralRepository.findById(id_DetalleGeneral).get();

            
            detalleGeneralExists.setVc_descripcion_corto(DetalleGeneral.getVc_descripcion_corto());
            detalleGeneralExists.setVc_descripcion_largo(DetalleGeneral.getVc_descripcion_largo());
            detalleGeneralExists.setIn_estado(DetalleGeneral.getIn_estado());
            return detalleGeneralRepository.save(detalleGeneralExists);
        }
        throw new UnsupportedOperationException("Unimplemented method 'editDetalleGeneralById'");
        //throw new UnsupportedOperationException("Unimplemented method 'editDetalleGeneralById'");
    }

    @Override
    public void deleteDetalleGeneral(Long id_DetalleGeneral) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDetalleGeneral'");
    }

    @Override
    public List<DetalleGeneral> getAllDetalleGeneralByEducation(Long id_education) {

        return detalleGeneralRepository.findAllByGeneralId(id_education);
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllDetalleGeneralByEducation'");
    }

    @Override
    public List<DetalleGeneral> getAllDetalleGeneralByGeneralDescription(String vcdescripcion) {
        // TODO Auto-generated method stub
        return detalleGeneralRepository.findAllByGeneralVcdescripcion(vcdescripcion);
        //throw new UnsupportedOperationException("Unimplemented method 'getAllDetalleGeneralByCondicionJuridica'");
    }


    

}
