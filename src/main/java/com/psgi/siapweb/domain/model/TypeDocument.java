package com.psgi.siapweb.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tipo_documento")
public class TypeDocument {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column(unique = true)
    String tipo_documento;

    @Column(unique = true)
    String descripcion;


    String estado;
}
