package com.psgi.siapweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psgi.siapweb.domain.model.MaestroPSGI;
import com.psgi.siapweb.domain.repository.MaestroPSGIRepository;
import com.psgi.siapweb.domain.service.MaestroPSGIService;

@Service
public class MaestroPSGIServiceImpl implements MaestroPSGIService{


    @Autowired
    private MaestroPSGIRepository maestroPSGIRepository;

    @Override
    public MaestroPSGI getMaestroPSGIById(Long id_documento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaestroPSGIById'");
    }

    @Override
    public List<MaestroPSGI> getAllMaestroPSGI() {
        // TODO Auto-generated method stub

        return maestroPSGIRepository.findAll();
    }

    @Override
    public MaestroPSGI createMaestroPSGI(MaestroPSGI typeDocument) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createMaestroPSGI'");
    }

    @Override
    public MaestroPSGI editMaestroPSGIById(Long id_documento, MaestroPSGI typeDocument) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editMaestroPSGIById'");
    }

    @Override
    public void deleteMaestroPSGI(Long id_documento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMaestroPSGI'");
    }

}
