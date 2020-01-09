package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;

import java.util.Date;


/**
 * The persistent class for the trp_seguimiento_fisioterapia database table.
 * 
 */
@Entity
@Table(name="trp_seguimiento_fisioterapia")
@NamedQuery(name="SeguimientoFisioterapia.findAll", query="SELECT s FROM SeguimientoFisioterapia s")
public class SeguimientoFisioterapia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_SEGUIMIENTO_FISIOTERAPIA_ID_GENERATOR", sequenceName="TRP_SEGUIMIENTO_FISIOTERAPIA_SGF_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_SEGUIMIENTO_FISIOTERAPIA_ID_GENERATOR")
	@Column(name="sgf_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer id;

	@Column(name="agf_area_sug")
	private String areaSug;

	@Column(name="sgf_diagnostico_sug")
	@JsonView(Perfiles.PublicView.class)
	private String diagnosticoSug;

	@Column(name="sgf_estado")
	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="sgf_fecha")
	private Date fecha;

	@Column(name="sgf_numsesion_sug")
	private Integer numsesionSug;

	@Column(name="sgf_observacion_sug")
	private String observacionSug;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="prs_id")
	@JsonView(Perfiles.PublicView.class)
	private Persona fdiPersona;

	public SeguimientoFisioterapia() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaSug() {
		return this.areaSug;
	}

	public void setAreaSug(String areaSug) {
		this.areaSug = areaSug;
	}

	public String getDiagnosticoSug() {
		return this.diagnosticoSug;
	}

	public void setDiagnosticoSug(String diagnosticoSug) {
		this.diagnosticoSug = diagnosticoSug;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getNumsesionSug() {
		return this.numsesionSug;
	}

	public void setNumsesionSug(Integer numsesionSug) {
		this.numsesionSug = numsesionSug;
	}

	public String getObservacionSug() {
		return this.observacionSug;
	}

	public void setObservacionSug(String observacionSug) {
		this.observacionSug = observacionSug;
	}

	public Persona getFdiPersona() {
		return this.fdiPersona;
	}

	public void setFdiPersona(Persona fdiPersona) {
		this.fdiPersona = fdiPersona;
	}

}