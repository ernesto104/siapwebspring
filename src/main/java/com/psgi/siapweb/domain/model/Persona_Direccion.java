package com.psgi.siapweb.domain.model;

import java.util.Date;

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
@Table(name = "persona_direccion")
public class Persona_Direccion {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_persona_direccion")
    Long id;

    @OneToOne(cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name="id_persona")
    private MaestroPSGI maestroPSGI;


    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name="id_demarcacion")
    private Demarcacion demarcacion;


    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name="id_ubigeo")
    private UbigeoReniec ubigeo;

    @Column(name = "vc_direccion")
    String direccion;

    @Column(name = "vc_observacion_demarcacion")
    String observacion_demarcacion;
    

    @Column(name = "in_estado")
    int estado;

    @Column(name = "vc_usuario_creacion")
    String usuario_creacion;


    @Column(name = "dt_fecha_creacion")
    Date fecha_creacion;


    @Column(name = "vc_usuario_modificacion")
    String usuario_modificacion;


    @Column(name = "dt_fecha_modificacion")
    Date fecha_modificacion;

}
