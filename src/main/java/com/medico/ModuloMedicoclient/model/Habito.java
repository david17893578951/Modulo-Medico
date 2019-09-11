package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mcd_habito database table.
 * 
 */
@Entity
@Table(name="mcd_habito")
@NamedQuery(name="Habito.findAll", query="SELECT h FROM Habito h")
public class Habito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MCD_HABITO_ID_GENERATOR", sequenceName="MCD_HABITO_HBT_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MCD_HABITO_ID_GENERATOR")
	@Column(name="hbt_id")
	private Integer id;

	@Column(name="hbt_cantidad")
	private Integer cantidad;

	@Column(name="hbt_cantidad_dia")
	private String cantidadDia;

	@Column(name="hbt_hace_cantidad")
	private Integer haceCantidad;

	@Column(name="hbt_hace_dia")
	private String haceDia;

	@Column(name="hbt_tipo")
	private String tipo;

	//uni-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="pct_id")
	private Paciente mdcPaciente;

	public Habito() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCantidadDia() {
		return this.cantidadDia;
	}

	public void setCantidadDia(String cantidadDia) {
		this.cantidadDia = cantidadDia;
	}

	public Integer getHaceCantidad() {
		return this.haceCantidad;
	}

	public void setHaceCantidad(Integer haceCantidad) {
		this.haceCantidad = haceCantidad;
	}

	public String getHaceDia() {
		return this.haceDia;
	}

	public void setHaceDia(String haceDia) {
		this.haceDia = haceDia;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Paciente getMdcPaciente() {
		return this.mdcPaciente;
	}

	public void setMdcPaciente(Paciente mdcPaciente) {
		this.mdcPaciente = mdcPaciente;
	}

}