package com.psgi.siapweb.domain.model;

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
@Table(name = "ubigeo_reniec")
public class UbigeoReniec {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    String id;


    String departamento;
    
    String provincia;
    
    String distrito;

    String NDepartamento;

    String NProvincia;

    String NDistrito;

    String estado;


}
