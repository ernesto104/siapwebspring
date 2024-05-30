package com.psgi.siapweb.domain.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.psgi.siapweb.domain.model.TypeDocument;

public interface TypeDocumentService {
    
    TypeDocument getTypeDocumentById(int id_documento);
    List<TypeDocument> getAllTypeDocuments();

    TypeDocument createTypeDocument(TypeDocument typeDocument);

    TypeDocument editTypeDocumentById(int id_documento, TypeDocument typeDocument);

    void deleteTypeDocument(int id_documento);
    //ResponseEntity<?> deleteTypeDocument(Long departmentId);
}
