package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_medicamento database table.
 * 
 */
@Entity
@Table(name="mdc_medicamento")
@NamedQuery(name="Medicamento.findAll", query="SELECT m FROM Medicamento m")
public class Medicamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_MEDICAMENTO_ID_GENERATOR", sequenceName="MDC_MEDICAMENTO_MDM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_MEDICAMENTO_ID_GENERATOR")
	@Column(name="mdm_id")
	private Integer id;

	@Column(name="mdm_codigo")
	private String codigo;

	@Column(name="mdm_nombre")
	private String nombre;

	@Column(name="mdm_stock")
	private Integer stock;

	public Medicamento() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}