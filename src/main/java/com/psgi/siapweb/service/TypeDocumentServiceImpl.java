package com.psgi.siapweb.service;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.repository.TypeDocumentRepository;
import com.psgi.siapweb.domain.service.TypeDocumentService;


@Service
public class TypeDocumentServiceImpl implements TypeDocumentService {

    @Autowired
    private TypeDocumentRepository typeDocumentRepository;

    

    @Override
    public TypeDocument getTypeDocumentById(Long id_documento) {
        // TODO Auto-generated method stub
        return typeDocumentRepository.findById(id_documento).orElseThrow(()-> new NoSuchElementException("para el controller"));
        //throw new UnsupportedOperationException("Unimplemented method 'getTypeDocumentById'");
    }

    @Override
    public List<TypeDocument> getAllTypeDocuments() {
        // TODO Auto-generated method stub
        /*typeDocumentRepository.saveAll( Arrays.asList(
            new TypeDocument(1L,"DNI", "Documento de Identificacion Nacional", "Activo" ),
            new TypeDocument(2L,"PAS", "Pasaporte", "Activo" ),
            new TypeDocument(3L,"CE", "Carnet de extranjería", "Activo" )
            )
            
            );*/
        return typeDocumentRepository.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getAllTypeDocuments'");
    }

    @Override
    public TypeDocument createTypeDocument(TypeDocument typeDocument) {
        // TODO Auto-generated method stub
        return typeDocumentRepository.save(typeDocument);
        //throw new UnsupportedOperationException("Unimplemented method 'createTypeDocument'");
    }

    @Override
    public void deleteTypeDocument(Long id_documento) {
        // TODO Auto-generated method stub
        typeDocumentRepository.deleteById(id_documento);
        //throw new UnsupportedOperationException("Unimplemented method 'deleteTypeDocument'");
    }

    @Override
    public TypeDocument editTypeDocumentById(Long id_documento, TypeDocument typeDocument) {
        // TODO Auto-generated method stub

        

        if(typeDocumentRepository.existsById(id_documento)) {
            TypeDocument typeDocumentexits = typeDocumentRepository.findById(id_documento).get();

            
            typeDocumentexits = typeDocument;
            return typeDocumentRepository.save(typeDocumentexits);
        }
        throw new UnsupportedOperationException("Unimplemented method 'editTypeDocumentById'");
    }

}
