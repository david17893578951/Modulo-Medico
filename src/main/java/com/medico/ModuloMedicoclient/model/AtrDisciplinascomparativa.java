package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the atr_disciplinascomparativas database table.
 * 
 */
@Entity
@Table(name="atr_disciplinascomparativas")
@NamedQuery(name="AtrDisciplinascomparativa.findAll", query="SELECT a FROM AtrDisciplinascomparativa a")
public class AtrDisciplinascomparativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_DISCIPLINASCOMPARATIVAS_DISCOMPID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_DISCIPLINASCOMPARATIVAS_DISCOMPID_GENERATOR")
	@Column(name="discomp_id")
	private Integer discompId;

	@Column(name="discomp_ectomorfo")
	private BigDecimal discompEctomorfo;

	@Column(name="discomp_ejex")
	private BigDecimal discompEjex;

	@Column(name="discomp_ejey")
	private BigDecimal discompEjey;

	@Column(name="discomp_endomorfo")
	private BigDecimal discompEndomorfo;

	@Column(name="discomp_mesomorfo")
	private BigDecimal discompMesomorfo;

	//bi-directional many-to-one association to AtrCategorizacion
	@OneToMany(mappedBy="atrDisciplinascomparativa")
	private List<AtrCategorizacion> atrCategorizacions;

	//bi-directional many-to-one association to FdiCategoriaDisciplina
	@ManyToOne
	@JoinColumn(name="catdisci_id")
	private FdiCategoriaDisciplina fdiCategoriaDisciplina;

	public AtrDisciplinascomparativa() {
	}

	public Integer getDiscompId() {
		return this.discompId;
	}

	public void setDiscompId(Integer discompId) {
		this.discompId = discompId;
	}

	public BigDecimal getDiscompEctomorfo() {
		return this.discompEctomorfo;
	}

	public void setDiscompEctomorfo(BigDecimal discompEctomorfo) {
		this.discompEctomorfo = discompEctomorfo;
	}

	public BigDecimal getDiscompEjex() {
		return this.discompEjex;
	}

	public void setDiscompEjex(BigDecimal discompEjex) {
		this.discompEjex = discompEjex;
	}

	public BigDecimal getDiscompEjey() {
		return this.discompEjey;
	}

	public void setDiscompEjey(BigDecimal discompEjey) {
		this.discompEjey = discompEjey;
	}

	public BigDecimal getDiscompEndomorfo() {
		return this.discompEndomorfo;
	}

	public void setDiscompEndomorfo(BigDecimal discompEndomorfo) {
		this.discompEndomorfo = discompEndomorfo;
	}

	public BigDecimal getDiscompMesomorfo() {
		return this.discompMesomorfo;
	}

	public void setDiscompMesomorfo(BigDecimal discompMesomorfo) {
		this.discompMesomorfo = discompMesomorfo;
	}

	public List<AtrCategorizacion> getAtrCategorizacions() {
		return this.atrCategorizacions;
	}

	public void setAtrCategorizacions(List<AtrCategorizacion> atrCategorizacions) {
		this.atrCategorizacions = atrCategorizacions;
	}

	public AtrCategorizacion addAtrCategorizacion(AtrCategorizacion atrCategorizacion) {
		getAtrCategorizacions().add(atrCategorizacion);
		atrCategorizacion.setAtrDisciplinascomparativa(this);

		return atrCategorizacion;
	}

	public AtrCategorizacion removeAtrCategorizacion(AtrCategorizacion atrCategorizacion) {
		getAtrCategorizacions().remove(atrCategorizacion);
		atrCategorizacion.setAtrDisciplinascomparativa(null);

		return atrCategorizacion;
	}

	public FdiCategoriaDisciplina getFdiCategoriaDisciplina() {
		return this.fdiCategoriaDisciplina;
	}

	public void setFdiCategoriaDisciplina(FdiCategoriaDisciplina fdiCategoriaDisciplina) {
		this.fdiCategoriaDisciplina = fdiCategoriaDisciplina;
	}

}