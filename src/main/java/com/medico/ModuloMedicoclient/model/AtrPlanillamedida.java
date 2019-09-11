package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the atr_planillamedidas database table.
 * 
 */
@Entity
@Table(name="atr_planillamedidas")
@NamedQuery(name="AtrPlanillamedida.findAll", query="SELECT a FROM AtrPlanillamedida a")
public class AtrPlanillamedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_PLANILLAMEDIDAS_PLANILLAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_PLANILLAMEDIDAS_PLANILLAID_GENERATOR")
	@Column(name="planilla_id")
	private Integer planillaId;

	@Column(name="planilla_abdominal")
	private BigDecimal planillaAbdominal;

	@Column(name="planilla_antebrazo")
	private BigDecimal planillaAntebrazo;

	@Column(name="planilla_antebrazo_radialestilo")
	private BigDecimal planillaAntebrazoRadialestilo;

	@Column(name="planilla_axiliar_medial")
	private BigDecimal planillaAxiliarMedial;

	@Column(name="planilla_biceps")
	private BigDecimal planillaBiceps;

	@Column(name="planilla_biliocrestideo")
	private BigDecimal planillaBiliocrestideo;

	@Column(name="planilla_biocromial")
	private BigDecimal planillaBiocromial;

	@Column(name="planilla_brazo_acromailradial")
	private BigDecimal planillaBrazoAcromailradial;

	@Column(name="planilla_brazo_flexionado")
	private BigDecimal planillaBrazoFlexionado;

	@Column(name="planilla_brazo_relajado")
	private BigDecimal planillaBrazoRelajado;

	@Column(name="planilla_cabeza")
	private BigDecimal planillaCabeza;

	@Column(name="planilla_cadera")
	private BigDecimal planillaCadera;

	@Column(name="planilla_cintura")
	private BigDecimal planillaCintura;

	@Column(name="planilla_cresta_iliaca")
	private BigDecimal planillaCrestaIliaca;

	@Column(name="planilla_cuello")
	private BigDecimal planillaCuello;

	@Column(name="planilla_edad")
	private String planillaEdad;

	@Column(name="planilla_envergadura")
	private BigDecimal planillaEnvergadura;

	@Column(name="planilla_estatura_desentado")
	private BigDecimal planillaEstaturaDesentado;

	@Column(name="planilla_estaturamaxima")
	private BigDecimal planillaEstaturamaxima;

	@Temporal(TemporalType.DATE)
	@Column(name="planilla_fechaevaluacion")
	private Date planillaFechaevaluacion;

	@Temporal(TemporalType.DATE)
	@Column(name="planilla_fechamenstruacion")
	private Date planillaFechamenstruacion;

	@Column(name="planilla_femur")
	private BigDecimal planillaFemur;

	@Column(name="planilla_humero")
	private BigDecimal planillaHumero;

	@Column(name="planilla_llioespinal_caja")
	private BigDecimal planillaLlioespinalCaja;

	@Column(name="planilla_mano_estiloideadactila")
	private BigDecimal planillaManoEstiloideadactila;

	@Column(name="planilla_munieca")
	private BigDecimal planillaMunieca;

	@Column(name="planilla_munieca_biestiloidea")
	private BigDecimal planillaMuniecaBiestiloidea;

	@Column(name="planilla_muslo_anterior")
	private BigDecimal planillaMusloAnterior;

	@Column(name="planilla_muslo_maximo")
	private BigDecimal planillaMusloMaximo;

	@Column(name="planilla_muslo_medial")
	private BigDecimal planillaMusloMedial;

	@Column(name="planilla_muslo_trocantereatibia")
	private BigDecimal planillaMusloTrocantereatibia;

	@Column(name="planilla_pantorrilla")
	private BigDecimal planillaPantorrilla;

	@Column(name="planilla_pantorrilla_medial")
	private BigDecimal planillaPantorrillaMedial;

	@Column(name="planilla_pesocorporal")
	private BigDecimal planillaPesocorporal;

	@Column(name="planilla_pie_calcaneopunta")
	private BigDecimal planillaPieCalcaneopunta;

	@Column(name="planilla_pierna_tibialcaja")
	private BigDecimal planillaPiernaTibialcaja;

	@Column(name="planilla_subescapular")
	private BigDecimal planillaSubescapular;

	@Column(name="planilla_supraespinal")
	private BigDecimal planillaSupraespinal;

	@Column(name="planilla_tibia_mediomaleolar")
	private BigDecimal planillaTibiaMediomaleolar;

	@Column(name="planilla_tobillo")
	private BigDecimal planillaTobillo;

	@Column(name="planilla_tobillo_bimaleolar")
	private BigDecimal planillaTobilloBimaleolar;

	@Column(name="planilla_torax")
	private BigDecimal planillaTorax;

	@Column(name="planilla_toraxico")
	private BigDecimal planillaToraxico;

	@Column(name="planilla_toraxico_anteroposteri")
	private BigDecimal planillaToraxicoAnteroposteri;

	@Column(name="planilla_triceps")
	private BigDecimal planillaTriceps;

	@Column(name="planilla_trocanterea_caja")
	private BigDecimal planillaTrocantereaCaja;

	//bi-directional many-to-one association to AtrFraccionamiento
	@OneToMany(mappedBy="atrPlanillamedida")
	private List<AtrFraccionamiento> atrFraccionamientos;

	//bi-directional many-to-one association to FdiDeportista
	@ManyToOne
	@JoinColumn(name="depor_id")
	private FdiDeportista fdiDeportista;

	//bi-directional many-to-one association to FdiEntrenador
	@ManyToOne
	@JoinColumn(name="entre_id")
	private FdiEntrenador fdiEntrenador1;

	//bi-directional many-to-one association to FdiEntrenador
	@ManyToOne
	@JoinColumn(name="fdi_entre_id")
	private FdiEntrenador fdiEntrenador2;

	//bi-directional many-to-one association to AtrProporcionalidadphantom
	@OneToMany(mappedBy="atrPlanillamedida")
	private List<AtrProporcionalidadphantom> atrProporcionalidadphantoms;

	//bi-directional many-to-one association to AtrSomatotipo
	@OneToMany(mappedBy="atrPlanillamedida")
	private List<AtrSomatotipo> atrSomatotipos;

	public AtrPlanillamedida() {
	}

	public Integer getPlanillaId() {
		return this.planillaId;
	}

	public void setPlanillaId(Integer planillaId) {
		this.planillaId = planillaId;
	}

	public BigDecimal getPlanillaAbdominal() {
		return this.planillaAbdominal;
	}

	public void setPlanillaAbdominal(BigDecimal planillaAbdominal) {
		this.planillaAbdominal = planillaAbdominal;
	}

	public BigDecimal getPlanillaAntebrazo() {
		return this.planillaAntebrazo;
	}

	public void setPlanillaAntebrazo(BigDecimal planillaAntebrazo) {
		this.planillaAntebrazo = planillaAntebrazo;
	}

	public BigDecimal getPlanillaAntebrazoRadialestilo() {
		return this.planillaAntebrazoRadialestilo;
	}

	public void setPlanillaAntebrazoRadialestilo(BigDecimal planillaAntebrazoRadialestilo) {
		this.planillaAntebrazoRadialestilo = planillaAntebrazoRadialestilo;
	}

	public BigDecimal getPlanillaAxiliarMedial() {
		return this.planillaAxiliarMedial;
	}

	public void setPlanillaAxiliarMedial(BigDecimal planillaAxiliarMedial) {
		this.planillaAxiliarMedial = planillaAxiliarMedial;
	}

	public BigDecimal getPlanillaBiceps() {
		return this.planillaBiceps;
	}

	public void setPlanillaBiceps(BigDecimal planillaBiceps) {
		this.planillaBiceps = planillaBiceps;
	}

	public BigDecimal getPlanillaBiliocrestideo() {
		return this.planillaBiliocrestideo;
	}

	public void setPlanillaBiliocrestideo(BigDecimal planillaBiliocrestideo) {
		this.planillaBiliocrestideo = planillaBiliocrestideo;
	}

	public BigDecimal getPlanillaBiocromial() {
		return this.planillaBiocromial;
	}

	public void setPlanillaBiocromial(BigDecimal planillaBiocromial) {
		this.planillaBiocromial = planillaBiocromial;
	}

	public BigDecimal getPlanillaBrazoAcromailradial() {
		return this.planillaBrazoAcromailradial;
	}

	public void setPlanillaBrazoAcromailradial(BigDecimal planillaBrazoAcromailradial) {
		this.planillaBrazoAcromailradial = planillaBrazoAcromailradial;
	}

	public BigDecimal getPlanillaBrazoFlexionado() {
		return this.planillaBrazoFlexionado;
	}

	public void setPlanillaBrazoFlexionado(BigDecimal planillaBrazoFlexionado) {
		this.planillaBrazoFlexionado = planillaBrazoFlexionado;
	}

	public BigDecimal getPlanillaBrazoRelajado() {
		return this.planillaBrazoRelajado;
	}

	public void setPlanillaBrazoRelajado(BigDecimal planillaBrazoRelajado) {
		this.planillaBrazoRelajado = planillaBrazoRelajado;
	}

	public BigDecimal getPlanillaCabeza() {
		return this.planillaCabeza;
	}

	public void setPlanillaCabeza(BigDecimal planillaCabeza) {
		this.planillaCabeza = planillaCabeza;
	}

	public BigDecimal getPlanillaCadera() {
		return this.planillaCadera;
	}

	public void setPlanillaCadera(BigDecimal planillaCadera) {
		this.planillaCadera = planillaCadera;
	}

	public BigDecimal getPlanillaCintura() {
		return this.planillaCintura;
	}

	public void setPlanillaCintura(BigDecimal planillaCintura) {
		this.planillaCintura = planillaCintura;
	}

	public BigDecimal getPlanillaCrestaIliaca() {
		return this.planillaCrestaIliaca;
	}

	public void setPlanillaCrestaIliaca(BigDecimal planillaCrestaIliaca) {
		this.planillaCrestaIliaca = planillaCrestaIliaca;
	}

	public BigDecimal getPlanillaCuello() {
		return this.planillaCuello;
	}

	public void setPlanillaCuello(BigDecimal planillaCuello) {
		this.planillaCuello = planillaCuello;
	}

	public String getPlanillaEdad() {
		return this.planillaEdad;
	}

	public void setPlanillaEdad(String planillaEdad) {
		this.planillaEdad = planillaEdad;
	}

	public BigDecimal getPlanillaEnvergadura() {
		return this.planillaEnvergadura;
	}

	public void setPlanillaEnvergadura(BigDecimal planillaEnvergadura) {
		this.planillaEnvergadura = planillaEnvergadura;
	}

	public BigDecimal getPlanillaEstaturaDesentado() {
		return this.planillaEstaturaDesentado;
	}

	public void setPlanillaEstaturaDesentado(BigDecimal planillaEstaturaDesentado) {
		this.planillaEstaturaDesentado = planillaEstaturaDesentado;
	}

	public BigDecimal getPlanillaEstaturamaxima() {
		return this.planillaEstaturamaxima;
	}

	public void setPlanillaEstaturamaxima(BigDecimal planillaEstaturamaxima) {
		this.planillaEstaturamaxima = planillaEstaturamaxima;
	}

	public Date getPlanillaFechaevaluacion() {
		return this.planillaFechaevaluacion;
	}

	public void setPlanillaFechaevaluacion(Date planillaFechaevaluacion) {
		this.planillaFechaevaluacion = planillaFechaevaluacion;
	}

	public Date getPlanillaFechamenstruacion() {
		return this.planillaFechamenstruacion;
	}

	public void setPlanillaFechamenstruacion(Date planillaFechamenstruacion) {
		this.planillaFechamenstruacion = planillaFechamenstruacion;
	}

	public BigDecimal getPlanillaFemur() {
		return this.planillaFemur;
	}

	public void setPlanillaFemur(BigDecimal planillaFemur) {
		this.planillaFemur = planillaFemur;
	}

	public BigDecimal getPlanillaHumero() {
		return this.planillaHumero;
	}

	public void setPlanillaHumero(BigDecimal planillaHumero) {
		this.planillaHumero = planillaHumero;
	}

	public BigDecimal getPlanillaLlioespinalCaja() {
		return this.planillaLlioespinalCaja;
	}

	public void setPlanillaLlioespinalCaja(BigDecimal planillaLlioespinalCaja) {
		this.planillaLlioespinalCaja = planillaLlioespinalCaja;
	}

	public BigDecimal getPlanillaManoEstiloideadactila() {
		return this.planillaManoEstiloideadactila;
	}

	public void setPlanillaManoEstiloideadactila(BigDecimal planillaManoEstiloideadactila) {
		this.planillaManoEstiloideadactila = planillaManoEstiloideadactila;
	}

	public BigDecimal getPlanillaMunieca() {
		return this.planillaMunieca;
	}

	public void setPlanillaMunieca(BigDecimal planillaMunieca) {
		this.planillaMunieca = planillaMunieca;
	}

	public BigDecimal getPlanillaMuniecaBiestiloidea() {
		return this.planillaMuniecaBiestiloidea;
	}

	public void setPlanillaMuniecaBiestiloidea(BigDecimal planillaMuniecaBiestiloidea) {
		this.planillaMuniecaBiestiloidea = planillaMuniecaBiestiloidea;
	}

	public BigDecimal getPlanillaMusloAnterior() {
		return this.planillaMusloAnterior;
	}

	public void setPlanillaMusloAnterior(BigDecimal planillaMusloAnterior) {
		this.planillaMusloAnterior = planillaMusloAnterior;
	}

	public BigDecimal getPlanillaMusloMaximo() {
		return this.planillaMusloMaximo;
	}

	public void setPlanillaMusloMaximo(BigDecimal planillaMusloMaximo) {
		this.planillaMusloMaximo = planillaMusloMaximo;
	}

	public BigDecimal getPlanillaMusloMedial() {
		return this.planillaMusloMedial;
	}

	public void setPlanillaMusloMedial(BigDecimal planillaMusloMedial) {
		this.planillaMusloMedial = planillaMusloMedial;
	}

	public BigDecimal getPlanillaMusloTrocantereatibia() {
		return this.planillaMusloTrocantereatibia;
	}

	public void setPlanillaMusloTrocantereatibia(BigDecimal planillaMusloTrocantereatibia) {
		this.planillaMusloTrocantereatibia = planillaMusloTrocantereatibia;
	}

	public BigDecimal getPlanillaPantorrilla() {
		return this.planillaPantorrilla;
	}

	public void setPlanillaPantorrilla(BigDecimal planillaPantorrilla) {
		this.planillaPantorrilla = planillaPantorrilla;
	}

	public BigDecimal getPlanillaPantorrillaMedial() {
		return this.planillaPantorrillaMedial;
	}

	public void setPlanillaPantorrillaMedial(BigDecimal planillaPantorrillaMedial) {
		this.planillaPantorrillaMedial = planillaPantorrillaMedial;
	}

	public BigDecimal getPlanillaPesocorporal() {
		return this.planillaPesocorporal;
	}

	public void setPlanillaPesocorporal(BigDecimal planillaPesocorporal) {
		this.planillaPesocorporal = planillaPesocorporal;
	}

	public BigDecimal getPlanillaPieCalcaneopunta() {
		return this.planillaPieCalcaneopunta;
	}

	public void setPlanillaPieCalcaneopunta(BigDecimal planillaPieCalcaneopunta) {
		this.planillaPieCalcaneopunta = planillaPieCalcaneopunta;
	}

	public BigDecimal getPlanillaPiernaTibialcaja() {
		return this.planillaPiernaTibialcaja;
	}

	public void setPlanillaPiernaTibialcaja(BigDecimal planillaPiernaTibialcaja) {
		this.planillaPiernaTibialcaja = planillaPiernaTibialcaja;
	}

	public BigDecimal getPlanillaSubescapular() {
		return this.planillaSubescapular;
	}

	public void setPlanillaSubescapular(BigDecimal planillaSubescapular) {
		this.planillaSubescapular = planillaSubescapular;
	}

	public BigDecimal getPlanillaSupraespinal() {
		return this.planillaSupraespinal;
	}

	public void setPlanillaSupraespinal(BigDecimal planillaSupraespinal) {
		this.planillaSupraespinal = planillaSupraespinal;
	}

	public BigDecimal getPlanillaTibiaMediomaleolar() {
		return this.planillaTibiaMediomaleolar;
	}

	public void setPlanillaTibiaMediomaleolar(BigDecimal planillaTibiaMediomaleolar) {
		this.planillaTibiaMediomaleolar = planillaTibiaMediomaleolar;
	}

	public BigDecimal getPlanillaTobillo() {
		return this.planillaTobillo;
	}

	public void setPlanillaTobillo(BigDecimal planillaTobillo) {
		this.planillaTobillo = planillaTobillo;
	}

	public BigDecimal getPlanillaTobilloBimaleolar() {
		return this.planillaTobilloBimaleolar;
	}

	public void setPlanillaTobilloBimaleolar(BigDecimal planillaTobilloBimaleolar) {
		this.planillaTobilloBimaleolar = planillaTobilloBimaleolar;
	}

	public BigDecimal getPlanillaTorax() {
		return this.planillaTorax;
	}

	public void setPlanillaTorax(BigDecimal planillaTorax) {
		this.planillaTorax = planillaTorax;
	}

	public BigDecimal getPlanillaToraxico() {
		return this.planillaToraxico;
	}

	public void setPlanillaToraxico(BigDecimal planillaToraxico) {
		this.planillaToraxico = planillaToraxico;
	}

	public BigDecimal getPlanillaToraxicoAnteroposteri() {
		return this.planillaToraxicoAnteroposteri;
	}

	public void setPlanillaToraxicoAnteroposteri(BigDecimal planillaToraxicoAnteroposteri) {
		this.planillaToraxicoAnteroposteri = planillaToraxicoAnteroposteri;
	}

	public BigDecimal getPlanillaTriceps() {
		return this.planillaTriceps;
	}

	public void setPlanillaTriceps(BigDecimal planillaTriceps) {
		this.planillaTriceps = planillaTriceps;
	}

	public BigDecimal getPlanillaTrocantereaCaja() {
		return this.planillaTrocantereaCaja;
	}

	public void setPlanillaTrocantereaCaja(BigDecimal planillaTrocantereaCaja) {
		this.planillaTrocantereaCaja = planillaTrocantereaCaja;
	}

	public List<AtrFraccionamiento> getAtrFraccionamientos() {
		return this.atrFraccionamientos;
	}

	public void setAtrFraccionamientos(List<AtrFraccionamiento> atrFraccionamientos) {
		this.atrFraccionamientos = atrFraccionamientos;
	}

	public AtrFraccionamiento addAtrFraccionamiento(AtrFraccionamiento atrFraccionamiento) {
		getAtrFraccionamientos().add(atrFraccionamiento);
		atrFraccionamiento.setAtrPlanillamedida(this);

		return atrFraccionamiento;
	}

	public AtrFraccionamiento removeAtrFraccionamiento(AtrFraccionamiento atrFraccionamiento) {
		getAtrFraccionamientos().remove(atrFraccionamiento);
		atrFraccionamiento.setAtrPlanillamedida(null);

		return atrFraccionamiento;
	}

	public FdiDeportista getFdiDeportista() {
		return this.fdiDeportista;
	}

	public void setFdiDeportista(FdiDeportista fdiDeportista) {
		this.fdiDeportista = fdiDeportista;
	}

	public FdiEntrenador getFdiEntrenador1() {
		return this.fdiEntrenador1;
	}

	public void setFdiEntrenador1(FdiEntrenador fdiEntrenador1) {
		this.fdiEntrenador1 = fdiEntrenador1;
	}

	public FdiEntrenador getFdiEntrenador2() {
		return this.fdiEntrenador2;
	}

	public void setFdiEntrenador2(FdiEntrenador fdiEntrenador2) {
		this.fdiEntrenador2 = fdiEntrenador2;
	}

	public List<AtrProporcionalidadphantom> getAtrProporcionalidadphantoms() {
		return this.atrProporcionalidadphantoms;
	}

	public void setAtrProporcionalidadphantoms(List<AtrProporcionalidadphantom> atrProporcionalidadphantoms) {
		this.atrProporcionalidadphantoms = atrProporcionalidadphantoms;
	}

	public AtrProporcionalidadphantom addAtrProporcionalidadphantom(AtrProporcionalidadphantom atrProporcionalidadphantom) {
		getAtrProporcionalidadphantoms().add(atrProporcionalidadphantom);
		atrProporcionalidadphantom.setAtrPlanillamedida(this);

		return atrProporcionalidadphantom;
	}

	public AtrProporcionalidadphantom removeAtrProporcionalidadphantom(AtrProporcionalidadphantom atrProporcionalidadphantom) {
		getAtrProporcionalidadphantoms().remove(atrProporcionalidadphantom);
		atrProporcionalidadphantom.setAtrPlanillamedida(null);

		return atrProporcionalidadphantom;
	}

	public List<AtrSomatotipo> getAtrSomatotipos() {
		return this.atrSomatotipos;
	}

	public void setAtrSomatotipos(List<AtrSomatotipo> atrSomatotipos) {
		this.atrSomatotipos = atrSomatotipos;
	}

	public AtrSomatotipo addAtrSomatotipo(AtrSomatotipo atrSomatotipo) {
		getAtrSomatotipos().add(atrSomatotipo);
		atrSomatotipo.setAtrPlanillamedida(this);

		return atrSomatotipo;
	}

	public AtrSomatotipo removeAtrSomatotipo(AtrSomatotipo atrSomatotipo) {
		getAtrSomatotipos().remove(atrSomatotipo);
		atrSomatotipo.setAtrPlanillamedida(null);

		return atrSomatotipo;
	}

}