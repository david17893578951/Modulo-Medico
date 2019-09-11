package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the atr_categorizacion database table.
 * 
 */
@Entity
@Table(name="atr_categorizacion")
@NamedQuery(name="AtrCategorizacion.findAll", query="SELECT a FROM AtrCategorizacion a")
public class AtrCategorizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_CATEGORIZACION_CATEGORIZAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_CATEGORIZACION_CATEGORIZAID_GENERATOR")
	@Column(name="categoriza_id")
	private Integer categorizaId;

	@Column(name="categoriza_valorcapta")
	private BigDecimal categorizaValorcapta;

	//bi-directional many-to-one association to AtrDisciplinascomparativa
	@ManyToOne
	@JoinColumn(name="discomp_id")
	private AtrDisciplinascomparativa atrDisciplinascomparativa;

	//bi-directional many-to-one association to AtrSomatotipo
	@ManyToOne
	@JoinColumn(name="somato_id")
	private AtrSomatotipo atrSomatotipo;

	public AtrCategorizacion() {
	}

	public Integer getCategorizaId() {
		return this.categorizaId;
	}

	public void setCategorizaId(Integer categorizaId) {
		this.categorizaId = categorizaId;
	}

	public BigDecimal getCategorizaValorcapta() {
		return this.categorizaValorcapta;
	}

	public void setCategorizaValorcapta(BigDecimal categorizaValorcapta) {
		this.categorizaValorcapta = categorizaValorcapta;
	}

	public AtrDisciplinascomparativa getAtrDisciplinascomparativa() {
		return this.atrDisciplinascomparativa;
	}

	public void setAtrDisciplinascomparativa(AtrDisciplinascomparativa atrDisciplinascomparativa) {
		this.atrDisciplinascomparativa = atrDisciplinascomparativa;
	}

	public AtrSomatotipo getAtrSomatotipo() {
		return this.atrSomatotipo;
	}

	public void setAtrSomatotipo(AtrSomatotipo atrSomatotipo) {
		this.atrSomatotipo = atrSomatotipo;
	}

}