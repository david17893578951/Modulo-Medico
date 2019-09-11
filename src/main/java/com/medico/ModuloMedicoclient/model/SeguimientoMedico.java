package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mdc_seguimiento_medico database table.
 * 
 */
@Entity
@Table(name="mdc_seguimiento_medico")
@NamedQuery(name="SeguimientoMedico.findAll", query="SELECT s FROM SeguimientoMedico s")
public class SeguimientoMedico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_SEGUIMIENTO_MEDICO_ID_GENERATOR", sequenceName="MDC_SEGUIMIENTO_MEDICO_SGM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_SEGUIMIENTO_MEDICO_ID_GENERATOR")
	@Column(name="sgm_id")
	private Integer id;

	@Column(name="sgm_cantidad")
	private BigDecimal cantidad;

	@Temporal(TemporalType.DATE)
	@Column(name="sgm_fecha")
	private Date fecha;

	@Column(name="sgm_numfactura")
	private String numfactura;

	@Column(name="sgm_pago")
	private Boolean pago;

	//uni-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="pct_id")
	private Paciente mdcPaciente;

	public SeguimientoMedico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNumfactura() {
		return this.numfactura;
	}

	public void setNumfactura(String numfactura) {
		this.numfactura = numfactura;
	}

	public Boolean getPago() {
		return this.pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	public Paciente getMdcPaciente() {
		return this.mdcPaciente;
	}

	public void setMdcPaciente(Paciente mdcPaciente) {
		this.mdcPaciente = mdcPaciente;
	}

}