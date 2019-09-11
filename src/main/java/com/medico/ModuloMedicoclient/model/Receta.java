package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_receta database table.
 * 
 */
@Entity
@Table(name="mdc_receta")
@NamedQuery(name="Receta.findAll", query="SELECT r FROM Receta r")
public class Receta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_RECETA_ID_GENERATOR", sequenceName="MDC_RECETA_RCT_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_RECETA_ID_GENERATOR")
	@Column(name="rct_id")
	private Integer id;

	@Column(name="rct_cada_dia")
	private String cadaDia;

	@Column(name="rct_cada_num")
	private Integer cadaNum;

	@Column(name="rct_cantidad")
	private Integer cantidad;

	@Column(name="rct_caracteristica")
	private String caracteristica;

	@Column(name="rct_observacion")
	private String observacion;

	@Column(name="rct_psologia")
	private Integer psologia;

	//uni-directional many-to-one association to JucioMedico
	@ManyToOne
	@JoinColumn(name="jcm_id")
	private JucioMedico mdcJucioMedico;

	//uni-directional many-to-one association to Medicamento
	@ManyToOne
	@JoinColumn(name="mdm_id")
	private Medicamento mdcMedicamento;

	public Receta() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCadaDia() {
		return this.cadaDia;
	}

	public void setCadaDia(String cadaDia) {
		this.cadaDia = cadaDia;
	}

	public Integer getCadaNum() {
		return this.cadaNum;
	}

	public void setCadaNum(Integer cadaNum) {
		this.cadaNum = cadaNum;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Integer getPsologia() {
		return this.psologia;
	}

	public void setPsologia(Integer psologia) {
		this.psologia = psologia;
	}

	public JucioMedico getMdcJucioMedico() {
		return this.mdcJucioMedico;
	}

	public void setMdcJucioMedico(JucioMedico mdcJucioMedico) {
		this.mdcJucioMedico = mdcJucioMedico;
	}

	public Medicamento getMdcMedicamento() {
		return this.mdcMedicamento;
	}

	public void setMdcMedicamento(Medicamento mdcMedicamento) {
		this.mdcMedicamento = mdcMedicamento;
	}

}