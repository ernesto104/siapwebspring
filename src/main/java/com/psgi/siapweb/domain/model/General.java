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
@Table(name = "general")
public class General {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_general")
    Long id;

    @Column(name = "vc_descripcion")
    String vcdescripcion;


    short bt_interno;

    int in_estado;

    String vc_usuario_creacion;


    Date dt_fecha_creacion;


    String vc_usuario_modificacion;


    Date dt_fecha_modificacion;
}
