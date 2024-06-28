package com.psgi.siapweb.domain.model;

import java.util.Date;

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
@Table(name = "maestro_psgi")
public class MaestroPSGI {


    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_persona")
    Long id;


    @Column(name = "vc_ape_materno")
    String ape_materno;

    @Column(name = "vc_ape_paterno")
    String ape_paterno;

    @Column(name = "vc_nombres")
    String nombres;

    @Column(name = "id_dg_sexo")
    Long sexo;

    @Column(name = "id_dg_tipo_documento")
    Long tipo_documento;


    @Column(name = "vc_nro_documento")
    String nro_documento;

    @Column(name = "dt_fecha_nacimiento")
    Date fecha_nacimiento;

    @Column(name = "vc_centro_trabajo")
    String centro_trabajo;

    
    String vc_direccion_trabajo;

    String vc_telefono_trabajo;


    String vc_celular_trabajo;

    Long id_pais;

    String vc_lugar_nacimiento;

    Long id_dg_estado_civil;

    Date dt_fecha_matrimonio;

    Long id_dg_grado_instruccion;

    Long id_profesion;

    String vc_nombre_completo;


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
