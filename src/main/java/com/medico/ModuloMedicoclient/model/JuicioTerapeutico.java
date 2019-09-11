package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trp_juicio_terapeutico database table.
 * 
 */
@Entity
@Table(name="trp_juicio_terapeutico")
@NamedQuery(name="JuicioTerapeutico.findAll", query="SELECT j FROM JuicioTerapeutico j")
public class JuicioTerapeutico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_JUICIO_TERAPEUTICO_ID_GENERATOR", sequenceName="TRP_JUICIO_TERAPEUTICO_JCT_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_JUICIO_TERAPEUTICO_ID_GENERATOR")
	@Column(name="jct_id")
	private Integer id;

	@Column(name="jct_juicio")
	private String juicio;

	@Column(name="jct_observacion")
	private String observacion;

	@Column(name="jct_sesionnum")
	private Integer sesionnum;

	//uni-directional many-to-one association to SeguimientoFisioterapia
	@ManyToOne
	@JoinColumn(name="sgf_id")
	private SeguimientoFisioterapia trpSeguimientoFisioterapia;

	public JuicioTerapeutico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJuicio() {
		return this.juicio;
	}

	public void setJuicio(String juicio) {
		this.juicio = juicio;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Integer getSesionnum() {
		return this.sesionnum;
	}

	public void setSesionnum(Integer sesionnum) {
		this.sesionnum = sesionnum;
	}

	public SeguimientoFisioterapia getTrpSeguimientoFisioterapia() {
		return this.trpSeguimientoFisioterapia;
	}

	public void setTrpSeguimientoFisioterapia(SeguimientoFisioterapia trpSeguimientoFisioterapia) {
		this.trpSeguimientoFisioterapia = trpSeguimientoFisioterapia;
	}

}