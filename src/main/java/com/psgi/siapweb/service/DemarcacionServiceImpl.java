package com.psgi.siapweb.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psgi.siapweb.domain.model.Demarcacion;
import com.psgi.siapweb.domain.repository.DemarcacionRepository;
import com.psgi.siapweb.domain.service.DemarcacionService;

@Service
public class DemarcacionServiceImpl implements DemarcacionService{


    @Autowired
    private DemarcacionRepository demarcacionRepository;

    @Override
    public Demarcacion createDemarcacion(Demarcacion demarcacion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteDemarcacion(Long id_demarcacion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Demarcacion editDemarcacionById(Long id_demarcacion, Demarcacion demarcacion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Demarcacion> getAllDemarcacion() {
        // TODO Auto-generated method stub
        return demarcacionRepository.findAll();
    }

    @Override
    public Demarcacion getDemarcacionById(Long id_demarcacion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Demarcacion getDemarcacionByVcCodigo(String vc_codigo) {
        // TODO Auto-generated method stub
        return demarcacionRepository.findFirstByCodigo(vc_codigo).orElse(null);
        //.orElseThrow(()-> new NoSuchElementException("El elemento faltante con codigo: "+vc_codigo) );
        //throw new UnsupportedOperationException("Unimplemented method 'getDemarcacionByVcCodigo'");
    }

}
