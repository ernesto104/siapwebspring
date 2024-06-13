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
@Table(name = "ubigeo_psgi")
public class UbigeoPSGI {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    String id;


    String codigo_region;

    String codigo_area;
    
    String codigo_zona;

    String codigo_sector;

    String codigo_grupo;

    String nombre;

    String estado;

}
