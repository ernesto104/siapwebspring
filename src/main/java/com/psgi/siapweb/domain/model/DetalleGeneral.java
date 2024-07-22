package com.psgi.siapweb.domain.model;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "detalle_general")
public class DetalleGeneral extends AuditableEntityClass{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_detalle_general")
    Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="id_general")
    private General general;
    //Long id_general;

    String vc_descripcion_corto;

    //@Column(name = "vc_descripcion_largo")
    String vc_descripcion_largo;


    String vc_codigo;


    int bt_interno;

    int in_estado;

    String vc_usuario_creacion;

    //Date dt_fecha_creacion;

    String vc_usuario_modificacion;

    //Date dt_fecha_modificacion;

    int in_order;


    Date dt_fecha_inicio_vigencia;


    Date dt_fecha_fin_vigencia;


    
    
}
