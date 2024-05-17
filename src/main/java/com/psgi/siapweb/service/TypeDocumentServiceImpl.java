package com.psgi.siapweb.service;

import java.util.List;

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
        return typeDocumentRepository.findById(id_documento).get();
        //throw new UnsupportedOperationException("Unimplemented method 'getTypeDocumentById'");
    }

    @Override
    public List<TypeDocument> getAllTypeDocuments() {
        // TODO Auto-generated method stub
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

}