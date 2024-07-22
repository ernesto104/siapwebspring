package com.psgi.siapweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psgi.siapweb.domain.model.Profesion;
import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.repository.ProfessionRepository;
import com.psgi.siapweb.domain.service.ProfessionService;

@Service
public class ProfessionServiceImpl implements ProfessionService{

    @Autowired
    private ProfessionRepository professionRepository;

    @Override
    public List<Profesion> getAllprofesion() {
        // TODO Auto-generated method stub
        return professionRepository.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getAllprofesion'");
    }

    @Override
    public Profesion getProfesionById(Long id_profesion) {
        // TODO Auto-generated method stub
        return professionRepository.findById(id_profesion).orElse(null);
        //throw new UnsupportedOperationException("Unimplemented method 'getDemarcacionById'");
    }

    @Override
    public Profesion createprofesion(Profesion profesion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createprofesion'");
    }

    @Override
    public Profesion editprofesionById(Long id_profesion, Profesion profesion) {
        // TODO Auto-generated method stub
        if(professionRepository.existsById(id_profesion)) {
            Profesion profesionexits = professionRepository.findById(id_profesion).get();

            
            profesionexits = profesion;
            return professionRepository.save(profesionexits);
        }
        throw new UnsupportedOperationException("Unimplemented method 'editprofesionById'");
    }

    @Override
    public void deleteprofesion(Long id_profesion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteprofesion'");
    }

    @Override
    public List<Profesion> getAllProfesionByName(String profesionName) {

        return professionRepository.findAllByVcdescripcion(profesionName);
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getDemarcacionByName'");
    }

}
