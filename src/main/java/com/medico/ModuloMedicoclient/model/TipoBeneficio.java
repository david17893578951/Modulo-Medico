package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_tipo_beneficio database table.
 * 
 */
@Entity
@Table(name="mdc_tipo_beneficio")
@NamedQuery(name="TipoBeneficio.findAll", query="SELECT t FROM TipoBeneficio t")
public class TipoBeneficio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_TIPO_BENEFICIO_ID_GENERATOR", sequenceName="MDC_TIPO_BENEFICIO_TBF_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_TIPO_BENEFICIO_ID_GENERATOR")
	@Column(name="tbf_id")
	private Integer id;

	@Column(name="tbf_tipo")
	private String tipo;

	//uni-directional many-to-one association to Beneficio
	@ManyToOne
	@JoinColumn(name="bnf_id")
	private Beneficio mdcBeneficio;

	public TipoBeneficio() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Beneficio getMdcBeneficio() {
		return this.mdcBeneficio;
	}

	public void setMdcBeneficio(Beneficio mdcBeneficio) {
		this.mdcBeneficio = mdcBeneficio;
	}

}