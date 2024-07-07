package com.psgi.siapweb.domain.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Demarcacion {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_demarcacion")
    Long id;

    @Column(name = "vc_descripcion")
    String demarcacion;

    @Column(name = "vc_codigo")
    String codigo;
    
    @Column(name = "id_dg_nivel_demarcacion")
    int nivel_demarcacion;

    @Column(name = "id_demarcacion_padre")
    long demarcacion_padre;

    @Column(name = "vc_usuario_creacion")
    String usuario_creacion;

    @Column(name = "dt_fecha_creacion")
    String fecha_creacion;

    @Column(name = "vc_usuario_modificacion")
    String usuario_modificacion;

    @Column(name = "dt_fecha_modificacion")
    String fecha_modificacion;

    @Column(name = "dt_fecha_inicio_vigencia")
    String fecha_inicio_vigencia;

    @Column(name = "dt_fecha_fin_vigencia")
    String fecha_fin_vigencia;

    @Column(name = "in_estado")
    String estado;


    @OneToMany(mappedBy = "demarcacion", cascade = CascadeType.ALL)
    private List<Persona_Direccion> persona_Direccions = new ArrayList<>();

}
