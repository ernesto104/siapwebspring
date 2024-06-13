package com.psgi.siapweb.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psgi.siapweb.domain.model.TypeDocument;


public interface TypeDocumentRepository extends JpaRepository<TypeDocument, Long> {

}
