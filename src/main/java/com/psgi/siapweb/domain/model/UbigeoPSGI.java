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
@Table(name = "demarcacion")
public class UbigeoPSGI {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_demarcacion")
    Long id;

    @Column(name = "vc_descripcion")
    String demarcacion;

    @Column(name = "vc_codigo")
    String codigo;
    
    @Column(name = "vc_usuario_creacion")
    String usuario_creacion;

    @Column(name = "dt_fecha_creacion")
    String fecha_creacion;

    @Column(name = "vc_usuario_modificacion")
    String usuario_modificacion;

    @Column(name = "dt_fecha_inicio_vigencia")
    String fecha_inicio_vigencia;

    @Column(name = "dt_fecha_fin_vigencia")
    String fecha_fin_vigencia;

    @Column(name = "in_estado")
    String estado;

}
