package com.psgi.siapweb.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.psgi.siapweb.domain.model.TypeDocument;

public interface TypeDocumentService {
    
    TypeDocument getTypeDocumentById(Long id_documento);
    List<TypeDocument> getAllTypeDocuments();

    TypeDocument createTypeDocument(TypeDocument typeDocument);

    TypeDocument editTypeDocumentById(Long id_documento, TypeDocument typeDocument);

    void deleteTypeDocument(Long id_documento);
    //ResponseEntity<?> deleteTypeDocument(Long departmentId);
}
