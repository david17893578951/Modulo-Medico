package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the psg_sesion database table.
 * 
 */
@Entity
@Table(name="psg_sesion")
@NamedQuery(name="Sesion.findAll", query="SELECT s FROM Sesion s")
public class Sesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PSG_SESION_ID_GENERATOR", sequenceName="PSG_SESION_SSN_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PSG_SESION_ID_GENERATOR")
	@Column(name="ssn_id")
	private Integer id;

	@Column(name="sgp_conclusion")
	private String conclusion;

	@Temporal(TemporalType.DATE)
	@Column(name="sgp_fecha")
	private Date fecha;

	@Column(name="sgp_numsesionactual")
	private Integer numsesionactual;

	@Column(name="sgp_porcentajeasistido")
	private Integer porcentajeasistido;

	@Column(name="sgp_recomendacion")
	private String recomendacion;

	//uni-directional many-to-one association to SeguimientoPsicologico
	@ManyToOne
	@JoinColumn(name="sgp_id")
	private SeguimientoPsicologico psgSeguimientoPsicologico;

	public Sesion() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getNumsesionactual() {
		return this.numsesionactual;
	}

	public void setNumsesionactual(Integer numsesionactual) {
		this.numsesionactual = numsesionactual;
	}

	public Integer getPorcentajeasistido() {
		return this.porcentajeasistido;
	}

	public void setPorcentajeasistido(Integer porcentajeasistido) {
		this.porcentajeasistido = porcentajeasistido;
	}

	public String getRecomendacion() {
		return this.recomendacion;
	}

	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}

	public SeguimientoPsicologico getPsgSeguimientoPsicologico() {
		return this.psgSeguimientoPsicologico;
	}

	public void setPsgSeguimientoPsicologico(SeguimientoPsicologico psgSeguimientoPsicologico) {
		this.psgSeguimientoPsicologico = psgSeguimientoPsicologico;
	}

}