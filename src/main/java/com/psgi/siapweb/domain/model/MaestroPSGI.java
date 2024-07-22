package com.psgi.siapweb.domain.model;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "maestro_psgi")
public class MaestroPSGI {


    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_persona")
    Long id;


    @Column(name = "vc_ape_materno")
    String ape_materno;

    @Column(name = "vc_ape_paterno")
    private String ape_paterno;

    @Column(name = "vc_nombres")
    String nombres;


    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="id_dg_sexo")
    DetalleGeneral sexo;


    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="id_dg_tipo_documento")
    DetalleGeneral tipo_documento;


    @Column(name = "vc_nro_documento")
    String nro_documento;

    @Column(name = "dt_fecha_nacimiento")
    Date fecha_nacimiento;

    @Column(name = "vc_centro_trabajo")
    String centro_trabajo;

    
    @OneToOne(mappedBy = "maestroPSGI",cascade = CascadeType.ALL)
    private Persona_Direccion persona_Direccion;

    String vc_direccion_trabajo;




    String vc_telefono_trabajo;

    

    String vc_celular_trabajo;

    Long id_pais;

    String vc_lugar_nacimiento;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="id_dg_estado_civil")
    DetalleGeneral id_dg_estado_civil;

    Date dt_fecha_matrimonio;

    
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="id_dg_grado_instruccion")
    DetalleGeneral id_dg_grado_instruccion;


    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="id_profesion")
    Profesion profesion;

    @Column(name = "vc_nombre_completo")
    String vcnombrecompleto;


    String vc_telefono;

    String vc_celular;

    String vc_email;

    String vc_codigo;

    Date dt_fecha_fallecimiento;

    int bt_fallecimiento;

    int in_estado;

    String vc_usuario_creacion;

    Date dt_fecha_creacion;

    String vc_usuario_modificacion;

    Date dt_fecha_modificacion;
}
