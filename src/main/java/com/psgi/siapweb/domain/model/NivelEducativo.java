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
@Table(name = "nivel_educativo")
public class NivelEducativo {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "codigo_nivel")
    Long id;

    String descripcion;

    String estado;

}
