package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;


/**
 * The persistent class for the trp_diagnostico_terapeutico database table.
 * 
 */
@Entity
@Table(name="trp_diagnostico_terapeutico")
@NamedQuery(name="DiagnosticoTerapeutico.findAll", query="SELECT d FROM DiagnosticoTerapeutico d")
public class DiagnosticoTerapeutico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_DIAGNOSTICO_TERAPEUTICO_ID_GENERATOR", sequenceName="TRP_DIAGNOSTICO_TERAPEUTICO_PBF_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_DIAGNOSTICO_TERAPEUTICO_ID_GENERATOR")
	@Column(name="pbf_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer id;

	@Column(name="pbf_antecedente")
	private String antecedente;

	@Column(name="pbf_area_afectada")
	private String areaAfectada;

	@Column(name="pbf_diagnostico")
	private String diagnostico;

	@Column(name="pbf_escala")
	private String escala;

	@Column(name="pbf_sesionnum")
	private Integer sesionnum;

	//uni-directional many-to-one association to Motivo
	@ManyToOne
	@JoinColumn(name="mtv_id")
	@JsonView(Perfiles.PublicView.class)
	private Motivo trfMotivo;

	//uni-directional many-to-one association to SeguimientoFisioterapia
	@ManyToOne
	@JoinColumn(name="sgf_id")
	@JsonView(Perfiles.PublicView.class)
	private SeguimientoFisioterapia trpSeguimientoFisioterapia;

	public DiagnosticoTerapeutico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAntecedente() {
		return this.antecedente;
	}

	public void setAntecedente(String antecedente) {
		this.antecedente = antecedente;
	}

	public String getAreaAfectada() {
		return this.areaAfectada;
	}

	public void setAreaAfectada(String areaAfectada) {
		this.areaAfectada = areaAfectada;
	}

	public String getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getEscala() {
		return this.escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}

	public Integer getSesionnum() {
		return this.sesionnum;
	}

	public void setSesionnum(Integer sesionnum) {
		this.sesionnum = sesionnum;
	}

	public Motivo getTrfMotivo() {
		return this.trfMotivo;
	}

	public void setTrfMotivo(Motivo trfMotivo) {
		this.trfMotivo = trfMotivo;
	}

	public SeguimientoFisioterapia getTrpSeguimientoFisioterapia() {
		return this.trpSeguimientoFisioterapia;
	}

	public void setTrpSeguimientoFisioterapia(SeguimientoFisioterapia trpSeguimientoFisioterapia) {
		this.trpSeguimientoFisioterapia = trpSeguimientoFisioterapia;
	}

}