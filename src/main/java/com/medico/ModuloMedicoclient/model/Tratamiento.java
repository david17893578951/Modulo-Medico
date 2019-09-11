package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trp_tratamiento database table.
 * 
 */
@Entity
@Table(name="trp_tratamiento")
@NamedQuery(name="Tratamiento.findAll", query="SELECT t FROM Tratamiento t")
public class Tratamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_TRATAMIENTO_ID_GENERATOR", sequenceName="TRP_TRATAMIENTO_TTM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_TRATAMIENTO_ID_GENERATOR")
	@Column(name="ttm_id")
	private Integer id;

	//uni-directional many-to-one association to JuicioTerapeutico
	@ManyToOne
	@JoinColumn(name="jct_id")
	private JuicioTerapeutico trpJuicioTerapeutico;

	public Tratamiento() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public JuicioTerapeutico getTrpJuicioTerapeutico() {
		return this.trpJuicioTerapeutico;
	}

	public void setTrpJuicioTerapeutico(JuicioTerapeutico trpJuicioTerapeutico) {
		this.trpJuicioTerapeutico = trpJuicioTerapeutico;
	}

}