package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;


/**
 * The persistent class for the trf_motivo database table.
 * 
 */
@Entity
@Table(name="trf_motivo")
@NamedQuery(name="Motivo.findAll", query="SELECT m FROM Motivo m")
public class Motivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRF_MOTIVO_ID_GENERATOR", sequenceName="TRF_MOTIVO_MTV_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRF_MOTIVO_ID_GENERATOR")
	@Column(name="mtv_id")
	private Integer id;

	@Column(name="mtv_area")
	private String area;

	@Column(name="mtv_motivo")
	@JsonView(Perfiles.PublicView.class)
	private String motivo;

	public Motivo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}