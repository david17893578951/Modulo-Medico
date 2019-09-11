package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_ficha_socioeconomica database table.
 * 
 */
@Entity
@Table(name="mdc_ficha_socioeconomica")
@NamedQuery(name="FichaSocioeconomica.findAll", query="SELECT f FROM FichaSocioeconomica f")
public class FichaSocioeconomica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_FICHA_SOCIOECONOMICA_ID_GENERATOR", sequenceName="MDC_FICHA_SOCIOECONOMICA_FSE_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_FICHA_SOCIOECONOMICA_ID_GENERATOR")
	@Column(name="fse_id")
	private Integer id;

	//uni-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="pct_id")
	private Paciente mdcPaciente;

	public FichaSocioeconomica() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getMdcPaciente() {
		return this.mdcPaciente;
	}

	public void setMdcPaciente(Paciente mdcPaciente) {
		this.mdcPaciente = mdcPaciente;
	}

}