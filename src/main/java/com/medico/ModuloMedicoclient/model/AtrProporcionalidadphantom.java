package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the atr_proporcionalidadphantom database table.
 * 
 */
@Entity
@Table(name="atr_proporcionalidadphantom")
@NamedQuery(name="AtrProporcionalidadphantom.findAll", query="SELECT a FROM AtrProporcionalidadphantom a")
public class AtrProporcionalidadphantom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_PROPORCIONALIDADPHANTOM_PROPHANID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_PROPORCIONALIDADPHANTOM_PROPHANID_GENERATOR")
	@Column(name="prophan_id")
	private Integer prophanId;

	private BigDecimal abdominal;

	private BigDecimal antebrazo;

	@Column(name="antebrazo_radialestiloidea")
	private BigDecimal antebrazoRadialestiloidea;

	@Column(name="axiliar_medial")
	private BigDecimal axiliarMedial;

	private BigDecimal biceps;

	private BigDecimal biliocrestideo;

	private BigDecimal biocromial;

	@Column(name="brazo_acromailradial")
	private BigDecimal brazoAcromailradial;

	@Column(name="brazo_flexionado")
	private BigDecimal brazoFlexionado;

	@Column(name="brazo_relajado")
	private BigDecimal brazoRelajado;

	private BigDecimal cabeza;

	private BigDecimal cadera;

	private BigDecimal cintura;

	@Column(name="cresta_iliaca")
	private BigDecimal crestaIliaca;

	private BigDecimal cuello;

	private BigDecimal envergadura;

	@Column(name="estatura_desentado")
	private BigDecimal estaturaDesentado;

	private BigDecimal estaturamaxima;

	private BigDecimal femur;

	private BigDecimal humero;

	@Column(name="llioespinal_caja")
	private BigDecimal llioespinalCaja;

	@Column(name="mano_estiloideadactilar")
	private BigDecimal manoEstiloideadactilar;

	private BigDecimal munieca;

	@Column(name="munieca_biestiloidea")
	private BigDecimal muniecaBiestiloidea;

	@Column(name="muslo_anterior")
	private BigDecimal musloAnterior;

	@Column(name="muslo_maximo")
	private BigDecimal musloMaximo;

	@Column(name="muslo_medial")
	private BigDecimal musloMedial;

	@Column(name="muslo_trocantereatibial")
	private BigDecimal musloTrocantereatibial;

	private BigDecimal pantorrilla;

	@Column(name="pantorrilla_medial")
	private BigDecimal pantorrillaMedial;

	private BigDecimal pesocorporal;

	@Column(name="pie_calcaneopunta")
	private BigDecimal pieCalcaneopunta;

	@Column(name="pierna_tibialcaja")
	private BigDecimal piernaTibialcaja;

	private BigDecimal subescapular;

	private BigDecimal supraespinal;

	@Column(name="tibia_mediomaleolar")
	private BigDecimal tibiaMediomaleolar;

	private BigDecimal tobillo;

	@Column(name="tobillo_bimaleolar")
	private BigDecimal tobilloBimaleolar;

	private BigDecimal torax;

	private BigDecimal toraxico;

	@Column(name="toraxico_anteroposterior")
	private BigDecimal toraxicoAnteroposterior;

	private BigDecimal triceps;

	@Column(name="trocanterea_caja")
	private BigDecimal trocantereaCaja;

	//bi-directional many-to-one association to AtrPlanillamedida
	@ManyToOne
	@JoinColumn(name="planilla_id")
	private AtrPlanillamedida atrPlanillamedida;

	public AtrProporcionalidadphantom() {
	}

	public Integer getProphanId() {
		return this.prophanId;
	}

	public void setProphanId(Integer prophanId) {
		this.prophanId = prophanId;
	}

	public BigDecimal getAbdominal() {
		return this.abdominal;
	}

	public void setAbdominal(BigDecimal abdominal) {
		this.abdominal = abdominal;
	}

	public BigDecimal getAntebrazo() {
		return this.antebrazo;
	}

	public void setAntebrazo(BigDecimal antebrazo) {
		this.antebrazo = antebrazo;
	}

	public BigDecimal getAntebrazoRadialestiloidea() {
		return this.antebrazoRadialestiloidea;
	}

	public void setAntebrazoRadialestiloidea(BigDecimal antebrazoRadialestiloidea) {
		this.antebrazoRadialestiloidea = antebrazoRadialestiloidea;
	}

	public BigDecimal getAxiliarMedial() {
		return this.axiliarMedial;
	}

	public void setAxiliarMedial(BigDecimal axiliarMedial) {
		this.axiliarMedial = axiliarMedial;
	}

	public BigDecimal getBiceps() {
		return this.biceps;
	}

	public void setBiceps(BigDecimal biceps) {
		this.biceps = biceps;
	}

	public BigDecimal getBiliocrestideo() {
		return this.biliocrestideo;
	}

	public void setBiliocrestideo(BigDecimal biliocrestideo) {
		this.biliocrestideo = biliocrestideo;
	}

	public BigDecimal getBiocromial() {
		return this.biocromial;
	}

	public void setBiocromial(BigDecimal biocromial) {
		this.biocromial = biocromial;
	}

	public BigDecimal getBrazoAcromailradial() {
		return this.brazoAcromailradial;
	}

	public void setBrazoAcromailradial(BigDecimal brazoAcromailradial) {
		this.brazoAcromailradial = brazoAcromailradial;
	}

	public BigDecimal getBrazoFlexionado() {
		return this.brazoFlexionado;
	}

	public void setBrazoFlexionado(BigDecimal brazoFlexionado) {
		this.brazoFlexionado = brazoFlexionado;
	}

	public BigDecimal getBrazoRelajado() {
		return this.brazoRelajado;
	}

	public void setBrazoRelajado(BigDecimal brazoRelajado) {
		this.brazoRelajado = brazoRelajado;
	}

	public BigDecimal getCabeza() {
		return this.cabeza;
	}

	public void setCabeza(BigDecimal cabeza) {
		this.cabeza = cabeza;
	}

	public BigDecimal getCadera() {
		return this.cadera;
	}

	public void setCadera(BigDecimal cadera) {
		this.cadera = cadera;
	}

	public BigDecimal getCintura() {
		return this.cintura;
	}

	public void setCintura(BigDecimal cintura) {
		this.cintura = cintura;
	}

	public BigDecimal getCrestaIliaca() {
		return this.crestaIliaca;
	}

	public void setCrestaIliaca(BigDecimal crestaIliaca) {
		this.crestaIliaca = crestaIliaca;
	}

	public BigDecimal getCuello() {
		return this.cuello;
	}

	public void setCuello(BigDecimal cuello) {
		this.cuello = cuello;
	}

	public BigDecimal getEnvergadura() {
		return this.envergadura;
	}

	public void setEnvergadura(BigDecimal envergadura) {
		this.envergadura = envergadura;
	}

	public BigDecimal getEstaturaDesentado() {
		return this.estaturaDesentado;
	}

	public void setEstaturaDesentado(BigDecimal estaturaDesentado) {
		this.estaturaDesentado = estaturaDesentado;
	}

	public BigDecimal getEstaturamaxima() {
		return this.estaturamaxima;
	}

	public void setEstaturamaxima(BigDecimal estaturamaxima) {
		this.estaturamaxima = estaturamaxima;
	}

	public BigDecimal getFemur() {
		return this.femur;
	}

	public void setFemur(BigDecimal femur) {
		this.femur = femur;
	}

	public BigDecimal getHumero() {
		return this.humero;
	}

	public void setHumero(BigDecimal humero) {
		this.humero = humero;
	}

	public BigDecimal getLlioespinalCaja() {
		return this.llioespinalCaja;
	}

	public void setLlioespinalCaja(BigDecimal llioespinalCaja) {
		this.llioespinalCaja = llioespinalCaja;
	}

	public BigDecimal getManoEstiloideadactilar() {
		return this.manoEstiloideadactilar;
	}

	public void setManoEstiloideadactilar(BigDecimal manoEstiloideadactilar) {
		this.manoEstiloideadactilar = manoEstiloideadactilar;
	}

	public BigDecimal getMunieca() {
		return this.munieca;
	}

	public void setMunieca(BigDecimal munieca) {
		this.munieca = munieca;
	}

	public BigDecimal getMuniecaBiestiloidea() {
		return this.muniecaBiestiloidea;
	}

	public void setMuniecaBiestiloidea(BigDecimal muniecaBiestiloidea) {
		this.muniecaBiestiloidea = muniecaBiestiloidea;
	}

	public BigDecimal getMusloAnterior() {
		return this.musloAnterior;
	}

	public void setMusloAnterior(BigDecimal musloAnterior) {
		this.musloAnterior = musloAnterior;
	}

	public BigDecimal getMusloMaximo() {
		return this.musloMaximo;
	}

	public void setMusloMaximo(BigDecimal musloMaximo) {
		this.musloMaximo = musloMaximo;
	}

	public BigDecimal getMusloMedial() {
		return this.musloMedial;
	}

	public void setMusloMedial(BigDecimal musloMedial) {
		this.musloMedial = musloMedial;
	}

	public BigDecimal getMusloTrocantereatibial() {
		return this.musloTrocantereatibial;
	}

	public void setMusloTrocantereatibial(BigDecimal musloTrocantereatibial) {
		this.musloTrocantereatibial = musloTrocantereatibial;
	}

	public BigDecimal getPantorrilla() {
		return this.pantorrilla;
	}

	public void setPantorrilla(BigDecimal pantorrilla) {
		this.pantorrilla = pantorrilla;
	}

	public BigDecimal getPantorrillaMedial() {
		return this.pantorrillaMedial;
	}

	public void setPantorrillaMedial(BigDecimal pantorrillaMedial) {
		this.pantorrillaMedial = pantorrillaMedial;
	}

	public BigDecimal getPesocorporal() {
		return this.pesocorporal;
	}

	public void setPesocorporal(BigDecimal pesocorporal) {
		this.pesocorporal = pesocorporal;
	}

	public BigDecimal getPieCalcaneopunta() {
		return this.pieCalcaneopunta;
	}

	public void setPieCalcaneopunta(BigDecimal pieCalcaneopunta) {
		this.pieCalcaneopunta = pieCalcaneopunta;
	}

	public BigDecimal getPiernaTibialcaja() {
		return this.piernaTibialcaja;
	}

	public void setPiernaTibialcaja(BigDecimal piernaTibialcaja) {
		this.piernaTibialcaja = piernaTibialcaja;
	}

	public BigDecimal getSubescapular() {
		return this.subescapular;
	}

	public void setSubescapular(BigDecimal subescapular) {
		this.subescapular = subescapular;
	}

	public BigDecimal getSupraespinal() {
		return this.supraespinal;
	}

	public void setSupraespinal(BigDecimal supraespinal) {
		this.supraespinal = supraespinal;
	}

	public BigDecimal getTibiaMediomaleolar() {
		return this.tibiaMediomaleolar;
	}

	public void setTibiaMediomaleolar(BigDecimal tibiaMediomaleolar) {
		this.tibiaMediomaleolar = tibiaMediomaleolar;
	}

	public BigDecimal getTobillo() {
		return this.tobillo;
	}

	public void setTobillo(BigDecimal tobillo) {
		this.tobillo = tobillo;
	}

	public BigDecimal getTobilloBimaleolar() {
		return this.tobilloBimaleolar;
	}

	public void setTobilloBimaleolar(BigDecimal tobilloBimaleolar) {
		this.tobilloBimaleolar = tobilloBimaleolar;
	}

	public BigDecimal getTorax() {
		return this.torax;
	}

	public void setTorax(BigDecimal torax) {
		this.torax = torax;
	}

	public BigDecimal getToraxico() {
		return this.toraxico;
	}

	public void setToraxico(BigDecimal toraxico) {
		this.toraxico = toraxico;
	}

	public BigDecimal getToraxicoAnteroposterior() {
		return this.toraxicoAnteroposterior;
	}

	public void setToraxicoAnteroposterior(BigDecimal toraxicoAnteroposterior) {
		this.toraxicoAnteroposterior = toraxicoAnteroposterior;
	}

	public BigDecimal getTriceps() {
		return this.triceps;
	}

	public void setTriceps(BigDecimal triceps) {
		this.triceps = triceps;
	}

	public BigDecimal getTrocantereaCaja() {
		return this.trocantereaCaja;
	}

	public void setTrocantereaCaja(BigDecimal trocantereaCaja) {
		this.trocantereaCaja = trocantereaCaja;
	}

	public AtrPlanillamedida getAtrPlanillamedida() {
		return this.atrPlanillamedida;
	}

	public void setAtrPlanillamedida(AtrPlanillamedida atrPlanillamedida) {
		this.atrPlanillamedida = atrPlanillamedida;
	}

}