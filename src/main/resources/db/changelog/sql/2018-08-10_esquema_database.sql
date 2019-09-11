/*==============================================================*/
/* Table: ASISTENCIA                                            */
/*==============================================================*/
create table ASISTENCIA (
   ID_ASISTENCIA        SERIAL               not null,
   DEPOR_ID             INT4                 null,
   FECHA                DATE                 null,
   ASISTIO              BOOL                 null,
   OBSERVACIONES        VARCHAR(600)         null,
   ENTRENADOR           INT4                 null,
   constraint PK_ASISTENCIA primary key (ID_ASISTENCIA)
);

comment on table ASISTENCIA is
'Control de asistencia de los deportistas';

/*==============================================================*/
/* Index: I_ID_ASISTENCIA                                       */
/*==============================================================*/
create  index I_ID_ASISTENCIA on ASISTENCIA (
ID_ASISTENCIA
);

/*==============================================================*/
/* Table: ATR_CATEGORIZACION                                    */
/*==============================================================*/
create table ATR_CATEGORIZACION (
   CATEGORIZA_ID        SERIAL               not null,
   SOMATO_ID            INT4                 null,
   DISCOMP_ID           INT4                 null,
   CATEGORIZA_VALORCAPTA DECIMAL              null,
   constraint PK_ATR_CATEGORIZACION primary key (CATEGORIZA_ID)
);

comment on table ATR_CATEGORIZACION is
'Tabla donde se almacena datos de categorizacion de disciplina para el aspirante';

/*==============================================================*/
/* Index: I_CATEGORIZA_ID                                       */
/*==============================================================*/
create unique index I_CATEGORIZA_ID on ATR_CATEGORIZACION (
CATEGORIZA_ID
);

/*==============================================================*/
/* Table: ATR_DISCIPLINASCOMPARATIVAS                           */
/*==============================================================*/
create table ATR_DISCIPLINASCOMPARATIVAS (
   DISCOMP_ID           SERIAL               not null,
   CATDISCI_ID          INT4                 null,
   DISCOMP_ENDOMORFO    NUMERIC              null,
   DISCOMP_MESOMORFO    NUMERIC              null,
   DISCOMP_ECTOMORFO    NUMERIC              null,
   DISCOMP_EJEX         NUMERIC              null,
   DISCOMP_EJEY         NUMERIC              null,
   constraint PK_ATR_DISCIPLINASCOMPARATIVAS primary key (DISCOMP_ID)
);

comment on table ATR_DISCIPLINASCOMPARATIVAS is
'Tabla donde se almacena los la informacion de diferentes disciplinas con sus valores de somatitpos para comparar.';

/*==============================================================*/
/* Index: I_DISCOMP_ID                                          */
/*==============================================================*/
create unique index I_DISCOMP_ID on ATR_DISCIPLINASCOMPARATIVAS (
DISCOMP_ID
);

/*==============================================================*/
/* Table: ATR_FRACCIONAMIENTO                                   */
/*==============================================================*/
create table ATR_FRACCIONAMIENTO (
   FRACCIO_ID           SERIAL               not null,
   PLANILLA_ID          INT4                 null,
   FRACCIO_TEJIDOADIPOSOTOTALKG NUMERIC              null,
   FRACCIO_TEJIDOMAGROTOTALPRC NUMERIC              null,
   FRACCIO_PIELKG       NUMERIC              null,
   FRACCIO_PIELPRC      NUMERIC              null,
   FRACCIO_MOSEATOTALKG NUMERIC              null,
   FRACCIO_MOSEATOTALPRC NUMERIC              null,
   FRACCIO_MOCABEZAKG   NUMERIC              null,
   FRACCIO_MOCABEZAPRC  NUMERIC              null,
   FRACCIO_MOCUERPOKG   NUMERIC              null,
   FRACCIO_MOCUERPOPRC  NUMERIC              null,
   FRACCIO_MRESIDUALKG  NUMERIC              null,
   FRACCIO_MRESIDUALPRC NUMERIC              null,
   FRACCIO_MMUSCULARKG  NUMERIC              null,
   FRACCIO_MMUSCULARPRC NUMERIC              null,
   FRACCIO_PESOESTRUCTURADOKG NUMERIC              null,
   FRACCIO_PESOESTRUCTURADOPRC NUMERIC              null,
   FRACCIO_DIFPESOREALYESTRUCKG NUMERIC              null,
   FRACCIO_DIFPESOREALYESTRUCPRC NUMERIC              null,
   FRACCIO_TALLAMIMBROINFERIORES NUMERIC              null,
   FRACCIO_ZOSEACABE    NUMERIC              null,
   FRACCIO_SOSEACUER    NUMERIC              null,
   FRACCIO_SADIPOSO     NUMERIC              null,
   FRACCIO_ZOSEACUER    NUMERIC              null,
   FRACCIO_ZADIPOSO     NUMERIC              null,
   FRACCIO_SRESIDUAL    NUMERIC              null,
   FRACCIO_ZRESIDUAL    NUMERIC              null,
   FRACCIO_SMUSCULAR    NUMERIC              null,
   FRACCIO_ZMUSCULAR    NUMERIC              null,
   FRACCIO_TEJIDOADIPOSOTOTALPRC NUMERIC              null,
   FRACCIO_TEJIDOMAGROTOTALKG NUMERIC              null,
   constraint PK_ATR_FRACCIONAMIENTO primary key (FRACCIO_ID)
);

comment on table ATR_FRACCIONAMIENTO is
'Tabla que almacena el calculo de medidas de fraccionamiento';

/*==============================================================*/
/* Index: I_FRACCIO_ID                                          */
/*==============================================================*/
create unique index I_FRACCIO_ID on ATR_FRACCIONAMIENTO (
FRACCIO_ID
);

/*==============================================================*/
/* Table: ATR_INDICEESTADOSALUD                                 */
/*==============================================================*/
create table ATR_INDICEESTADOSALUD (
   INDI_ID              SERIAL               not null,
   FRACCIO_ID           INT4                 null,
   INDI_CINTUCADE       NUMERIC              null,
   INDI_CINTUCADE_CLF   VARCHAR(50)          null,
   INDI_ADIMUS          NUMERIC              null,
   INDI_ADIMUS_CLF      VARCHAR(50)          null,
   INDI_BODMAS          NUMERIC              null,
   INDI_BODMAS_CLF      VARCHAR(50)          null,
   INDI_MUSHUE          NUMERIC              null,
   INDI_MUSHUE_CLF      VARCHAR(50)          null,
   INDI_CONI            NUMERIC              null,
   INDI_CONI_CLF        VARCHAR(50)          null,
   INDI_IRES            NUMERIC              null,
   INDI_IRES_CLF        VARCHAR(50)          null,
   INDI_IREI            NUMERIC              null,
   INDI_IREI_CLF        VARCHAR(50)          null,
   INDI_INTERM          NUMERIC              null,
   INDI_INTERM_CLF      VARCHAR(50)          null,
   INDI_BRAQ            NUMERIC              null,
   INDI_BRAQ_CLF        VARCHAR(50)          null,
   INDI_CRUR            NUMERIC              null,
   INDI_CRUR_CLF        VARCHAR(50)          null,
   INDI_COR             NUMERIC              null,
   INDI_COR_CLF         VARCHAR(50)          null,
   INDI_ESQ             NUMERIC              null,
   INDI_ESQ_CLF         VARCHAR(50)          null,
   INDI_ACRIL           NUMERIC              null,
   INDI_ACRIL_CLF       VARCHAR(50)          null,
   INDI_ENVER           NUMERIC              null,
   INDI_ENVER_CLF       VARCHAR(50)          null,
   INDI_ESTAPRED        NUMERIC              null,
   INDI_ESTAPRED_CLF    VARCHAR(50)          null,
   constraint PK_ATR_INDICEESTADOSALUD primary key (INDI_ID)
);

comment on table ATR_INDICEESTADOSALUD is
'TABLA DONDE SE ALMACENA LOS INDICES DEL ESTADO DE SALUD DEL DEPORTISTA';

/*==============================================================*/
/* Index: I_INDICESTAD_ID                                       */
/*==============================================================*/
create unique index I_INDICESTAD_ID on ATR_INDICEESTADOSALUD (
INDI_ID
);

/*==============================================================*/
/* Table: ATR_PLANILLAMEDIDAS                                   */
/*==============================================================*/
create table ATR_PLANILLAMEDIDAS (
   PLANILLA_ID          SERIAL               not null,
   DEPOR_ID             INT4                 null,
   ENTRE_ID             INT4                 null,
   FDI_ENTRE_ID         INT4                 null,
   PLANILLA_FECHAEVALUACION DATE                 null,
   PLANILLA_FECHAMENSTRUACION DATE                 null,
   PLANILLA_EDAD        VARCHAR(100)         null,
   PLANILLA_PESOCORPORAL NUMERIC              null,
   PLANILLA_ESTATURAMAXIMA NUMERIC              null,
   PLANILLA_ESTATURA_DESENTADO NUMERIC              null,
   PLANILLA_ENVERGADURA NUMERIC              null,
   PLANILLA_BRAZO_ACROMAILRADIAL NUMERIC              null,
   PLANILLA_ANTEBRAZO_RADIALESTILO NUMERIC              null,
   PLANILLA_MANO_ESTILOIDEADACTILA NUMERIC              null,
   PLANILLA_LLIOESPINAL_CAJA NUMERIC              null,
   PLANILLA_TROCANTEREA_CAJA NUMERIC              null,
   PLANILLA_MUSLO_TROCANTEREATIBIA NUMERIC              null,
   PLANILLA_PIERNA_TIBIALCAJA NUMERIC              null,
   PLANILLA_TIBIA_MEDIOMALEOLAR NUMERIC              null,
   PLANILLA_PIE_CALCANEOPUNTA NUMERIC              null,
   PLANILLA_BIOCROMIAL  NUMERIC              null,
   PLANILLA_BILIOCRESTIDEO NUMERIC              null,
   PLANILLA_TORAXICO    NUMERIC              null,
   PLANILLA_TORAXICO_ANTEROPOSTERI NUMERIC              null,
   PLANILLA_HUMERO      NUMERIC              null,
   PLANILLA_MUNIECA_BIESTILOIDEA NUMERIC              null,
   PLANILLA_FEMUR       NUMERIC              null,
   PLANILLA_TOBILLO_BIMALEOLAR NUMERIC              null,
   PLANILLA_BRAZO_RELAJADO NUMERIC              null,
   PLANILLA_BRAZO_FLEXIONADO NUMERIC              null,
   PLANILLA_ANTEBRAZO   NUMERIC              null,
   PLANILLA_MUNIECA     NUMERIC              null,
   PLANILLA_CABEZA      NUMERIC              null,
   PLANILLA_CUELLO      NUMERIC              null,
   PLANILLA_TORAX       NUMERIC              null,
   PLANILLA_CINTURA     NUMERIC              null,
   PLANILLA_CADERA      NUMERIC              null,
   PLANILLA_MUSLO_MEDIAL NUMERIC              null,
   PLANILLA_MUSLO_MAXIMO NUMERIC              null,
   PLANILLA_PANTORRILLA NUMERIC              null,
   PLANILLA_TOBILLO     NUMERIC              null,
   PLANILLA_TRICEPS     NUMERIC              null,
   PLANILLA_SUBESCAPULAR NUMERIC              null,
   PLANILLA_BICEPS      NUMERIC              null,
   PLANILLA_AXILIAR_MEDIAL NUMERIC              null,
   PLANILLA_CRESTA_ILIACA NUMERIC              null,
   PLANILLA_SUPRAESPINAL NUMERIC              null,
   PLANILLA_ABDOMINAL   NUMERIC              null,
   PLANILLA_MUSLO_ANTERIOR NUMERIC              null,
   PLANILLA_PANTORRILLA_MEDIAL NUMERIC              null,
   constraint PK_ATR_PLANILLAMEDIDAS primary key (PLANILLA_ID)
);

comment on table ATR_PLANILLAMEDIDAS is
'tabla donde se almacena los datos de los aspirantes y evaluador con las mediciones antropometricas.';

/*==============================================================*/
/* Index: I_PLANILLA_ID                                         */
/*==============================================================*/
create unique index I_PLANILLA_ID on ATR_PLANILLAMEDIDAS (
PLANILLA_ID
);

/*==============================================================*/
/* Table: ATR_PROPORCIONALIDADPHANTOM                           */
/*==============================================================*/
create table ATR_PROPORCIONALIDADPHANTOM (
   PROPHAN_ID           SERIAL               not null,
   PLANILLA_ID          INT4                 null,
   PESOCORPORAL         NUMERIC              not null,
   ESTATURAMAXIMA       NUMERIC              not null,
   ESTATURA_DESENTADO   NUMERIC              not null,
   ENVERGADURA          NUMERIC              not null,
   BRAZO_ACROMAILRADIAL NUMERIC              null,
   ANTEBRAZO_RADIALESTILOIDEA NUMERIC              null,
   MANO_ESTILOIDEADACTILAR NUMERIC              null,
   LLIOESPINAL_CAJA     NUMERIC              null,
   TROCANTEREA_CAJA     NUMERIC              null,
   MUSLO_TROCANTEREATIBIAL NUMERIC              null,
   PIERNA_TIBIALCAJA    NUMERIC              null,
   TIBIA_MEDIOMALEOLAR  NUMERIC              null,
   PIE_CALCANEOPUNTA    NUMERIC              null,
   BIOCROMIAL           NUMERIC              null,
   BILIOCRESTIDEO       NUMERIC              null,
   TORAXICO             NUMERIC              null,
   TORAXICO_ANTEROPOSTERIOR NUMERIC              null,
   HUMERO               NUMERIC              null,
   MUNIECA_BIESTILOIDEA NUMERIC              null,
   FEMUR                NUMERIC              null,
   TOBILLO_BIMALEOLAR   NUMERIC              null,
   BRAZO_RELAJADO       NUMERIC              null,
   BRAZO_FLEXIONADO     NUMERIC              null,
   ANTEBRAZO            NUMERIC              null,
   MUNIECA              NUMERIC              null,
   CABEZA               NUMERIC              null,
   CUELLO               NUMERIC              null,
   TORAX                NUMERIC              null,
   CINTURA              NUMERIC              null,
   CADERA               NUMERIC              null,
   MUSLO_MEDIAL         NUMERIC              null,
   MUSLO_MAXIMO         NUMERIC              null,
   PANTORRILLA          NUMERIC              null,
   TOBILLO              NUMERIC              null,
   TRICEPS              NUMERIC              null,
   SUBESCAPULAR         NUMERIC              null,
   BICEPS               NUMERIC              null,
   AXILIAR_MEDIAL       NUMERIC              null,
   CRESTA_ILIACA        NUMERIC              null,
   SUPRAESPINAL         NUMERIC              null,
   ABDOMINAL            NUMERIC              null,
   MUSLO_ANTERIOR       NUMERIC              null,
   PANTORRILLA_MEDIAL   NUMERIC              null,
   constraint PK_ATR_PROPORCIONALIDADPHANTOM primary key (PROPHAN_ID)
);

comment on table ATR_PROPORCIONALIDADPHANTOM is
'Tabla que almacena los datos calculados de las medidas echas basadas en la proporcianalidad phanton';

/*==============================================================*/
/* Index: I_PROPHAN_ID                                          */
/*==============================================================*/
create unique index I_PROPHAN_ID on ATR_PROPORCIONALIDADPHANTOM (
PROPHAN_ID
);

/*==============================================================*/
/* Table: ATR_SOMATOTIPO                                        */
/*==============================================================*/
create table ATR_SOMATOTIPO (
   SOMATO_ID            SERIAL               not null,
   PLANILLA_ID          INT4                 null,
   SOMATO_COMPONENTEDOS NUMERIC              null,
   SOMATO_COMPONENTETRES NUMERIC              null,
   SOMATO_COMPONENTEUNO NUMERIC              null,
   SOMATO_COMPONENTECUATRO NUMERIC              null,
   SOMATO_ENDOMORFO     NUMERIC              null,
   SOMATO_MESOMORFO     NUMERIC              null,
   SOMATO_ECTOMORFO     NUMERIC              null,
   SOMATO_EJEX          NUMERIC              null,
   SOMATO_EJEY          NUMERIC              null,
   constraint PK_ATR_SOMATOTIPO primary key (SOMATO_ID)
);

comment on table ATR_SOMATOTIPO is
'Tabla donde se almacena los valores del somatotipo calculado';

/*==============================================================*/
/* Index: I_SOMATO_ID                                           */
/*==============================================================*/
create unique index I_SOMATO_ID on ATR_SOMATOTIPO (
SOMATO_ID
);

/*==============================================================*/
/* Table: CANTON                                                */
/*==============================================================*/
create table CANTON (
   DPA_CANTON           VARCHAR(10)          not null,
   DPA_PROVINCIA        VARCHAR(10)          null,
   DPA_DESCANTON        VARCHAR(100)         null,
   constraint PK_CANTON primary key (DPA_CANTON)
);

comment on table CANTON is
'tabla que contiene todos los cantones del Ecuador';

/*==============================================================*/
/* Index: I_DPA_CANTON                                          */
/*==============================================================*/
create unique index I_DPA_CANTON on CANTON (
DPA_CANTON
);

/*==============================================================*/
/* Table: COMPETENCIAS                                          */
/*==============================================================*/
create table COMPETENCIAS (
   ID_COMPETENCIA       SERIAL               not null,
   NOMBRE_COMPETENCIA   VARCHAR(50)          null,
   LUGAR                VARCHAR(1000)        null,
   FECHA_DESDE          DATE                 null,
   FECHA_HASTA          DATE                 null,
   SEXO                 VARCHAR(10)          null,
   constraint PK_COMPETENCIAS primary key (ID_COMPETENCIA)
);

comment on table COMPETENCIAS is
'va a tener registrador el dombre de la competencia q va a realizar el deportista';

/*==============================================================*/
/* Index: I_ID_COMPETENCIA                                      */
/*==============================================================*/
create  index I_ID_COMPETENCIA on COMPETENCIAS (
ID_COMPETENCIA
);

/*==============================================================*/
/* Table: ED_CAMPOS_ENTRENAMIENTO                               */
/*==============================================================*/
create table ED_CAMPOS_ENTRENAMIENTO (
   CAMPENTRE_ID         SERIAL               not null,
   CAMPENTRE_NOMBRE     VARCHAR(50)          null,
   constraint PK_ED_CAMPOS_ENTRENAMIENTO primary key (CAMPENTRE_ID)
);

/*==============================================================*/
/* Index: CAMPENTRE_ID                                          */
/*==============================================================*/
create  index CAMPENTRE_ID on ED_CAMPOS_ENTRENAMIENTO (
CAMPENTRE_ID
);

/*==============================================================*/
/* Table: ED_CONTROL_ASISTENCIA                                 */
/*==============================================================*/
create table ED_CONTROL_ASISTENCIA (
   ID_CONTROL_ASIST     SERIAL               not null,
   ID_ASISTENCIA        INT4                 null,
   CATDISCI_ID          INT4                 null,
   HORARIO              VARCHAR(50)          null,
   DESDE                VARCHAR(50)          null,
   MES                  VARCHAR(50)          null,
   constraint PK_ED_CONTROL_ASISTENCIA primary key (ID_CONTROL_ASIST)
);

comment on table ED_CONTROL_ASISTENCIA is
'Control de Asistencia a los deportistas';

/*==============================================================*/
/* Index: I_ID_CONTROL_ASIST                                    */
/*==============================================================*/
create  index I_ID_CONTROL_ASIST on ED_CONTROL_ASISTENCIA (
ID_CONTROL_ASIST
);

/*==============================================================*/
/* Table: ED_DEPORTISTA_ENTRENADOR                              */
/*==============================================================*/
create table ED_DEPORTISTA_ENTRENADOR (
   ID_DEP_ENTRE         SERIAL               not null,
   DEPOR_ID             INT4                 null,
   ENTRE_ID             INT4                 null,
   constraint PK_ED_DEPORTISTA_ENTRENADOR primary key (ID_DEP_ENTRE)
);

comment on table ED_DEPORTISTA_ENTRENADOR is
'Vmaos a obtener los id de los deportistas para sabe a que entrenador pertenece ';

/*==============================================================*/
/* Index: I_ID_DEP_ENTRE                                        */
/*==============================================================*/
create  index I_ID_DEP_ENTRE on ED_DEPORTISTA_ENTRENADOR (
ID_DEP_ENTRE
);

/*==============================================================*/
/* Table: ED_PREMIOS_DEPORTISTA                                 */
/*==============================================================*/
create table ED_PREMIOS_DEPORTISTA (
   ID_PREMIOS           SERIAL               not null,
   DEPOR_ID             INT4                 null,
   ID_COMPETENCIA       INT4                 null,
   M_ORO                INT2                 null,
   M_PLATA              INT2                 null,
   M_BRONCE             INT2                 null,
   constraint PK_ED_PREMIOS_DEPORTISTA primary key (ID_PREMIOS)
);

comment on table ED_PREMIOS_DEPORTISTA is
'Aqui vamos a poder observar que premios a obtenido cada competidor
';

/*==============================================================*/
/* Index: I_ID_PREMIOS                                          */
/*==============================================================*/
create  index I_ID_PREMIOS on ED_PREMIOS_DEPORTISTA (
ID_PREMIOS
);

/*==============================================================*/
/* Table: FDI_CATEGORIA                                         */
/*==============================================================*/
create table FDI_CATEGORIA (
   CATEGORIA_ID         SERIAL               not null,
   CATEGORIA_NOMBRE     VARCHAR(100)         null,
   CATEGORIA_DESCRIPCION VARCHAR(1000)        null,
   constraint PK_FDI_CATEGORIA primary key (CATEGORIA_ID)
);

comment on table FDI_CATEGORIA is
'Tabla que almacena las categorias de las diferentes disciplinas.';

/*==============================================================*/
/* Index: I_CATEGORIA_ID                                        */
/*==============================================================*/
create unique index I_CATEGORIA_ID on FDI_CATEGORIA (
CATEGORIA_ID
);

/*==============================================================*/
/* Table: FDI_CATEGORIA_DISCIPLINA                              */
/*==============================================================*/
create table FDI_CATEGORIA_DISCIPLINA (
   CATDISCI_ID          SERIAL               not null,
   CATEGORIA_ID         INT4                 null,
   DISCIPLINA_ID        INT4                 null,
   constraint PK_FDI_CATEGORIA_DISCIPLINA primary key (CATDISCI_ID)
);

/*==============================================================*/
/* Index: I_CATDISCI_ID                                         */
/*==============================================================*/
create  index I_CATDISCI_ID on FDI_CATEGORIA_DISCIPLINA (
CATDISCI_ID
);

/*==============================================================*/
/* Table: FDI_DEPORTISTAS                                       */
/*==============================================================*/
create table FDI_DEPORTISTAS (
   DEPOR_ID             SERIAL               not null,
   CATDISCI_ID          INT4                 null,
   PRS_ID               INT4                 null,
   DEPORT_FOTO          TEXT                 null,
   DEPORT_FOTOCEDULA    TEXT                 null,
   DEPORT_TALLAUNIF     VARCHAR(100)         null,
   DEPORT_CALZADO       NUMERIC              null,
   DEPORT_INSTIEDUCATIVA VARCHAR(100)         null,
   DEPORT_NROHERMANOS   INT4                 null,
   DEPORT_TIPODEPORT    VARCHAR(2)           null
      constraint CKC_DEPORT_TIPODEPORT_FDI_DEPO check (DEPORT_TIPODEPORT is null or (DEPORT_TIPODEPORT in ('A','F','NF','DB'))),
   DEPORT_DIVISPRUEBA   VARCHAR(100)         null,
   DEPORT_ESTRATOSOCIAL VARCHAR(100)         null,
   DEPORT_NIVELEDUCATIVO VARCHAR(100)         null,
   DEPORT_ESTADO        BOOL                 null,
   DEPORT_BAJA_DIFICULTAD VARCHAR(1000)        null,
   DEPORT_BAJA_TIEMPO_AREA VARCHAR(1000)        null,
   DEPORT_BAJA_MOTIVO_BAJA VARCHAR(1000)        null,
   DEPORT_BAJA_MEDIDAS_TOMADAS VARCHAR(1000)        null,
   DEPORT_BAJA_RECOMENDACION VARCHAR(1000)        null,
   DEPORT_BAJA_OBSERVACION VARCHAR(1000)        null,
   constraint PK_FDI_DEPORTISTAS primary key (DEPOR_ID)
);

comment on table FDI_DEPORTISTAS is
'Tabla q almacena los datos de los deportistas federados';

comment on column FDI_DEPORTISTAS.PRS_ID is
'Código único asignado a la persona registradas en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_DEPORFDI_ID                                         */
/*==============================================================*/
create  index I_DEPORFDI_ID on FDI_DEPORTISTAS (
DEPOR_ID
);

/*==============================================================*/
/* Table: FDI_DISCIPLINA                                        */
/*==============================================================*/
create table FDI_DISCIPLINA (
   DISCIPLINA_ID        SERIAL               not null,
   CAMPENTRE_ID         INT4                 null,
   DISCIPLINA_NOMBRE    VARCHAR(500)         null,
   constraint PK_FDI_DISCIPLINA primary key (DISCIPLINA_ID)
);

/*==============================================================*/
/* Index: DISCIPLINA_ID                                         */
/*==============================================================*/
create  index DISCIPLINA_ID on FDI_DISCIPLINA (
DISCIPLINA_ID
);

/*==============================================================*/
/* Table: FDI_ENTRENADOR                                        */
/*==============================================================*/
create table FDI_ENTRENADOR (
   ENTRE_ID             SERIAL               not null,
   PRS_ID               INT4                 null,
   CATDISCI_ID          INT4                 null,
   ENTRE_ESTADO         BOOL                 null,
   ENTRE_FOTO           TEXT                 null,
   ENTRE_FOTO_CEDULA    TEXT                 null,
   constraint PK_FDI_ENTRENADOR primary key (ENTRE_ID)
);

comment on table FDI_ENTRENADOR is
'tabla que contiene todos los entrenadores de la federacion deportiva de imbabura';

comment on column FDI_ENTRENADOR.PRS_ID is
'Código único asignado a la persona registradas en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_ENTRE_ID                                            */
/*==============================================================*/
create unique index I_ENTRE_ID on FDI_ENTRENADOR (
ENTRE_ID
);

/*==============================================================*/
/* Table: FDI_PERSONA                                           */
/*==============================================================*/
create table FDI_PERSONA (
   PRS_ID               SERIAL               not null,
   DPA_PARR             VARCHAR(10)          null,
   PRS_CEDULA           VARCHAR(15)          not null,
   PRS_NOMBRE           VARCHAR(50)          null,
   PRS_APELLIDO         VARCHAR(50)          null,
   PRS_FECHA_NACIMIENTO DATE                 null,
   PRS_NACIONALIDAD     VARCHAR(100)         null,
   PRS_PROVINCIA        VARCHAR(50)          null,
   PRS_CANTON           VARCHAR(50)          null,
   PRS_PARROQUIA        VARCHAR(50)          null,
   PRS_DIR_RECIDENCIA   VARCHAR(300)         null,
   PRS_ESTADO_CIVIL     VARCHAR(30)          null
      constraint CKC_PRS_ESTADO_CIVIL_FDI_PERS check (PRS_ESTADO_CIVIL is null or (PRS_ESTADO_CIVIL in ('S','C','V','D','U'))),
   PRS_ETNIA            VARCHAR(50)          null,
   PRS_SEXO             VARCHAR(15)          null
      constraint CKC_PRS_SEXO_FDI_PERS check (PRS_SEXO is null or (PRS_SEXO in ('M','F'))),
   PRS_GRUPO_SANGUINEO  VARCHAR(10)          null,
   PRS_OCUPACION        VARCHAR(50)          null,
   PRS_TELEFONO         VARCHAR(15)          null,
   PRS_CORREO           VARCHAR(100)         null,
   PRS_DISCAPACIDAD     BOOL                 null,
   PRS_TIPODISCAPACIDAD VARCHAR(100)         null,
   PRS_NOMPADRE         VARCHAR(100)         null,
   PRS_NOMMADRE         VARCHAR(100)         null,
   PRS_TELPADRES        VARCHAR(30)          null,
   PRS_ESTADO           BOOL                 null,
   constraint PK_FDI_PERSONA primary key (PRS_ID),
   constraint AK_K_PRS_CEDULA_FDI_PERS unique (PRS_CEDULA)
);

comment on table FDI_PERSONA is
'Tabla de personas registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_ID is
'Código único asignado a la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_CEDULA is
'Cedula o pasaporte de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_NOMBRE is
'Nombres de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_APELLIDO is
'Apellidos de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_FECHA_NACIMIENTO is
'Fecha de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_PROVINCIA is
'Lugar de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_CANTON is
'Lugar de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_PARROQUIA is
'Lugar de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_ESTADO_CIVIL is
'Estado civil de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_ETNIA is
'Etnia de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_SEXO is
'Sexo de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_GRUPO_SANGUINEO is
'Grupo sanguíneo de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_OCUPACION is
'Ocupación de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_TELEFONO is
'Teléfono de la persona registradas en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_PRS_ID                                              */
/*==============================================================*/
create unique index I_PRS_ID on FDI_PERSONA (
PRS_ID
);

/*==============================================================*/
/* Table: FDI_ROL                                               */
/*==============================================================*/
create table FDI_ROL (
   ROL_ID               SERIAL               not null,
   ROL_NAME             VARCHAR(100)         null,
   constraint PK_FDI_ROL primary key (ROL_ID)
);

comment on table FDI_ROL is
'esta tabla almacena los roles de la federacion deportiva de imbabura';

/*==============================================================*/
/* Index: I_ROL_ID                                              */
/*==============================================================*/
create unique index I_ROL_ID on FDI_ROL (
ROL_ID
);

/*==============================================================*/
/* Table: FDI_USERS_ROLES                                       */
/*==============================================================*/
create table FDI_USERS_ROLES (
   USROL_ID             SERIAL               not null,
   ROL_ID               INT4                 not null,
   PRS_ID               INT4                 null,
   CLAVE                VARCHAR(30000)       null,
   constraint PK_FDI_USERS_ROLES primary key (USROL_ID)
);

comment on table FDI_USERS_ROLES is
'tabla que almacena los usuarios y roles que existen para el ingreso al sistema del FDI
';

comment on column FDI_USERS_ROLES.PRS_ID is
'Código único asignado a la persona registradas en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_USROL_ID                                            */
/*==============================================================*/
create unique index I_USROL_ID on FDI_USERS_ROLES (
USROL_ID
);

/*==============================================================*/
/* Table: MDC_BENEFICIO                                         */
/*==============================================================*/
create table MDC_BENEFICIO (
   BNF_ID               SERIAL               not null,
   PRS_ID               INT4                 null,
   BNF_FECHA_ASIGNACION DATE                 null,
   BNF_DISPOSICION      VARCHAR(30)          null,
   BNF_ESTADO           BOOL                 null,
   constraint PK_MDC_BENEFICIO primary key (BNF_ID)
);

comment on table MDC_BENEFICIO is
'Tabla de registro de beneficios que tiene la persona en la federación deportiva de Imbabura';

comment on column MDC_BENEFICIO.BNF_ID is
'Código único de registro de beneficios que tiene la persona en la federación deportiva de Imbabura';

comment on column MDC_BENEFICIO.PRS_ID is
'Código foráneo asignado a la persona registradas en la federación deportiva de Imbabura';

comment on column MDC_BENEFICIO.BNF_FECHA_ASIGNACION is
'Fecha de asignación del registro de beneficios que tiene la persona en la federación deportiva de Imbabura';

comment on column MDC_BENEFICIO.BNF_DISPOSICION is
'Imbabura';

comment on column MDC_BENEFICIO.BNF_ESTADO is
'Estado del registro de beneficios que tiene la persona en la federación deportiva de Imbabura: el cual se cambiara a estado inactivo cuando se cree uno nuevo';

/*==============================================================*/
/* Index: I_BNF_ID                                              */
/*==============================================================*/
create  index I_BNF_ID on MDC_BENEFICIO (
BNF_ID
);

/*==============================================================*/
/* Table: MDC_CALENDARIO                                        */
/*==============================================================*/
create table MDC_CALENDARIO (
   CLD_ID               SERIAL               not null,
   CLD_DESCRIPCION      VARCHAR(20)          null,
   CLD_FECHA_INICIO     DATE                 null,
   CLD_FECHA_FIN        DATE                 null,
   CLD_AREA             VARCHAR(15)          null,
   constraint PK_MDC_CALENDARIO primary key (CLD_ID)
);

comment on table MDC_CALENDARIO is
'Tabla calendario de reservas de citas';

comment on column MDC_CALENDARIO.CLD_ID is
'Código único para cada calendario médico en la federación deportiva de Imbabura';

comment on column MDC_CALENDARIO.CLD_DESCRIPCION is
'Descripción del agendamiento del calendario médico en la federación deportiva de Imbabura';

comment on column MDC_CALENDARIO.CLD_FECHA_INICIO is
'Fecha inicio del agendamiento del calendario médico en la federación deportiva de Imbabura';

comment on column MDC_CALENDARIO.CLD_FECHA_FIN is
'Fecha fin del agendamiento del calendario médico en la federación deportiva de Imbabura';

comment on column MDC_CALENDARIO.CLD_AREA is
'área médica en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_CLD_ID                                              */
/*==============================================================*/
create  index I_CLD_ID on MDC_CALENDARIO (
CLD_ID
);

/*==============================================================*/
/* Table: MDC_CATALOGO                                          */
/*==============================================================*/
create table MDC_CATALOGO (
   CAT_ID               SERIAL               not null,
   CAT_CLAVE            VARCHAR(20)          null,
   CAT_CLAVE_PADRE      VARCHAR(20)          null,
   CAT_NOMBRE           VARCHAR(100)         null,
   CAT_DESCRIPCION      VARCHAR(500)         null,
   CAT_ESTADO           VARCHAR(1)           null,
   constraint PK_MDC_CATALOGO primary key (CAT_ID)
);

comment on table MDC_CATALOGO is
'tabla catalogo guardara una lista de select a mostrar en el sistema cliente';

comment on column MDC_CATALOGO.CAT_ID is
'Identificador de la tabla catalogo';

comment on column MDC_CATALOGO.CAT_CLAVE is
'Clave de la lista par los select ';

comment on column MDC_CATALOGO.CAT_CLAVE_PADRE is
'Clave padre de las listas a mostrar en los select del sistema';

comment on column MDC_CATALOGO.CAT_NOMBRE is
'Nombre de cada item a mostrar en los select del sistema';

comment on column MDC_CATALOGO.CAT_DESCRIPCION is
'descripcion de cada nombre de cada item a mostrar en los select del sistema';

comment on column MDC_CATALOGO.CAT_ESTADO is
'Estado de cada item a mostrar en los select del sistema';

/*==============================================================*/
/* Index: I_CAT_ID                                              */
/*==============================================================*/
create  index I_CAT_ID on MDC_CATALOGO (
CAT_ID
);

/*==============================================================*/
/* Table: MDC_TIPO_BENEFICIO                                    */
/*==============================================================*/
create table MDC_TIPO_BENEFICIO (
   TBF_ID               SERIAL               not null,
   BNF_ID               INT4                 null,
   TBF_TIPO             VARCHAR(30)          null,
   constraint PK_MDC_TIPO_BENEFICIO primary key (TBF_ID)
);

comment on table MDC_TIPO_BENEFICIO is
'Tabla de registro de tipo beneficios que tiene la persona en la federación deportiva de Imbabura';

comment on column MDC_TIPO_BENEFICIO.TBF_ID is
'Código único de registro de tipo beneficios que tiene la persona en la federación deportiva de Imbabura';

comment on column MDC_TIPO_BENEFICIO.BNF_ID is
'Código foráneo de registro de beneficios que tiene la persona en la federación deportiva de Imbabura';

comment on column MDC_TIPO_BENEFICIO.TBF_TIPO is
'Registro de tipo beneficios que tiene la persona en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_TBF_ID                                              */
/*==============================================================*/
create  index I_TBF_ID on MDC_TIPO_BENEFICIO (
TBF_ID
);

/*==============================================================*/
/* Table: MDC_TIPO_DESCUENTO                                    */
/*==============================================================*/
create table MDC_TIPO_DESCUENTO (
   TDC_ID               SERIAL               not null,
   PRS_ID               INT4                 null,
   TDC_TIPO             VARCHAR(4)           null,
   TDC_DESCUENTO        VARCHAR(4)           null,
   TDC_FECHA_ASIGNACION DATE                 null,
   TDC_OBSERVACION      VARCHAR(500)         null,
   TDC_ESTADO           BOOL                 null,
   constraint PK_MDC_TIPO_DESCUENTO primary key (TDC_ID)
);

comment on table MDC_TIPO_DESCUENTO is
'Tabla de registro del tipo de descuento que tiene la persona registrada en la federación deportiva de Imbabura';

comment on column MDC_TIPO_DESCUENTO.TDC_ID is
'Código único de registro del tipo de descuento que tiene la persona registrada en la federación deportiva de Imbabura';

comment on column MDC_TIPO_DESCUENTO.PRS_ID is
'Código foráneo asignado a la persona registradas en la federación deportiva de Imbabura';

comment on column MDC_TIPO_DESCUENTO.TDC_TIPO is
'registro del tipo de descuento que tiene la persona registrada en la federación deportiva de Imbabura';

comment on column MDC_TIPO_DESCUENTO.TDC_DESCUENTO is
'Porcentaje del descuento que tiene la persona registrada en la federación deportiva de Imbabura';

comment on column MDC_TIPO_DESCUENTO.TDC_OBSERVACION is
'Observaciones del descuento que tiene la persona registrada en la federación deportiva de Imbabura';

comment on column MDC_TIPO_DESCUENTO.TDC_ESTADO is
'estado del descuento que tiene la persona registrada en la federación deportiva de Imbabura: este cambia a inactivo cuando se crea uno nuevo
';

/*==============================================================*/
/* Index: I_TDC_ID                                              */
/*==============================================================*/
create  index I_TDC_ID on MDC_TIPO_DESCUENTO (
TDC_ID
);

/*==============================================================*/
/* Table: PARROQUIA                                             */
/*==============================================================*/
create table PARROQUIA (
   DPA_PARR             VARCHAR(10)          not null,
   DPA_CANTON           VARCHAR(10)          null,
   DPA_DESPARR          VARCHAR(100)         null,
   constraint PK_PARROQUIA primary key (DPA_PARR)
);

comment on table PARROQUIA is
'tabla que contiene todas las parroquias del ecuador';

/*==============================================================*/
/* Index: I_DPA_PARR                                            */
/*==============================================================*/
create unique index I_DPA_PARR on PARROQUIA (
DPA_PARR
);

/*==============================================================*/
/* Table: PROVINCIA                                             */
/*==============================================================*/
create table PROVINCIA (
   DPA_PROVINCIA        VARCHAR(10)          not null,
   DPA_DESPROV          VARCHAR(100)         null,
   constraint PK_PROVINCIA primary key (DPA_PROVINCIA)
);

comment on table PROVINCIA is
'tabla que contiene las provincias del ecuador';

/*==============================================================*/
/* Index: I_DPA_PROVINCIA                                       */
/*==============================================================*/
create unique index I_DPA_PROVINCIA on PROVINCIA (
DPA_PROVINCIA
);

/*==============================================================*/
/* Table: PSG_SEGUIMIENTO_PSICOLOGICO                           */
/*==============================================================*/
create table PSG_SEGUIMIENTO_PSICOLOGICO (
   SGP_ID               SERIAL               not null,
   MTV_ID               INT4                 null,
   PRS_ID               INT4                 null,
   SGP_FECHA            DATE                 null,
   SGP_TRANSITORIAB     BOOL                 null,
   SGP_TRANSITORIA      VARCHAR(70)          null,
   SGP_PERMANENTEB      BOOL                 null,
   SGP_PERMANENTE       VARCHAR(70)          null,
   SGP_TABACO           BOOL                 null,
   SGP_ALCOHOL          BOOL                 null,
   SGP_DROGA            BOOL                 null,
   SGP_MEDICAMENTO      BOOL                 null,
   SGP_ANAMNESI_FAMILIAR VARCHAR(500)         null,
   SGP_PSICOANAMNESI_FAMILIAR VARCHAR(2000)        null,
   SGP_PSICOANAMNESI_PERSONAL VARCHAR(2000)        null,
   SGP_SESIONNUM        INT4                 null,
   SGP_ESTADO           BOOL                 null,
   constraint PK_PSG_SEGUIMIENTO_PSICOLOGICO primary key (SGP_ID)
);

comment on table PSG_SEGUIMIENTO_PSICOLOGICO is
'Tabla de seguimiento psicológico de cada paciente atendido en la federación deportiva de Imbabura';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_ID is
'Código único para cada seguimiento psicológico de cada paciente atendido en la federación deportiva de Imbabura';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.MTV_ID is
'Código foráneo para el motivo de la consulta médica en la federación deportiva de Imbabura';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.PRS_ID is
'Código foráneo asignado a la persona registradas en la federación deportiva de Imbabura';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_FECHA is
'Fecha de la psicoterapia';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_TRANSITORIAB is
'Afirmación anamnesis transitoria';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_TRANSITORIA is
'Anamnesis transitoria';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_PERMANENTEB is
'Afirmación anamnesis permanente';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_PERMANENTE is
'Anamnesis permanente';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_TABACO is
'Afirmación anamnesis tabaco';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_ALCOHOL is
'Afirmación anamnesis alcohol';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_DROGA is
'Afirmación anamnesis drogas';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_MEDICAMENTO is
'Afirmación anamnesis medicamentos';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_ANAMNESI_FAMILIAR is
'Afirmación anamnesis familiar';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_PSICOANAMNESI_FAMILIAR is
'Afirmación psicoanamnesis familiar';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_PSICOANAMNESI_PERSONAL is
'Afirmación psicoanamnesis personal';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_SESIONNUM is
'Numero de sesiones sugeridas por el fisioterapeuta de la federación deportiva de Imbabura';

comment on column PSG_SEGUIMIENTO_PSICOLOGICO.SGP_ESTADO is
'Estado del seguimiento psicoterapéutico asignado por el fisioterapeuta de la federación deportiva de Imbabura: el campo cambia a estado inactivo cuando es creada cuanto se crea uno nuevo';

/*==============================================================*/
/* Index: I_SGP_ID                                              */
/*==============================================================*/
create  index I_SGP_ID on PSG_SEGUIMIENTO_PSICOLOGICO (
SGP_ID
);

/*==============================================================*/
/* Table: PSG_SESION                                            */
/*==============================================================*/
create table PSG_SESION (
   SSN_ID               SERIAL               not null,
   SGP_ID               INT4                 null,
   SGP_FECHA            DATE                 null,
   SGP_CONCLUSION       VARCHAR(1000)        null,
   SGP_RECOMENDACION    VARCHAR(1000)        null,
   SGP_NUMSESIONACTUAL  INT4                 null,
   SGP_PORCENTAJEASISTIDO INT4                 null,
   constraint PK_PSG_SESION primary key (SSN_ID)
);

comment on table PSG_SESION is
'Tabla de numero de sesiones psicológicas de cada paciente atendido en la federación deportiva de Imbabura';

comment on column PSG_SESION.SSN_ID is
'Código único para cada sesión psicológica de cada paciente atendido en la federación deportiva de Imbabura';

comment on column PSG_SESION.SGP_ID is
'Código foráneo para cada seguimiento psicológico de cada paciente atendido en la federación deportiva de Imbabura';

comment on column PSG_SESION.SGP_FECHA is
'Fecha de asistencia para seguimiento de las Psicoterapias diarias';

comment on column PSG_SESION.SGP_CONCLUSION is
'Conclusiones de la sesión con el paciente ';

comment on column PSG_SESION.SGP_RECOMENDACION is
'Recomendación de la sesión con el paciente ';

comment on column PSG_SESION.SGP_NUMSESIONACTUAL is
'Números de sesiones actuales asistidas por el paciente, el campo será auto incrementará hasta el número de sesiones diagnosticados por el psicólogo';

comment on column PSG_SESION.SGP_PORCENTAJEASISTIDO is
'Porcentaje de asistencia de acuerdo con el número de asistencia a las terapias psicológicas';

/*==============================================================*/
/* Index: I_SSN_ID                                              */
/*==============================================================*/
create  index I_SSN_ID on PSG_SESION (
SSN_ID
);

/*==============================================================*/
/* Table: TEST_DEPORTISTAS                                      */
/*==============================================================*/
create table TEST_DEPORTISTAS (
   ID_TEST              SERIAL               not null,
   ID_DEP_ENTRE         INT4                 null,
   PESO                 VARCHAR(100)         null,
   TALLA                VARCHAR(100)         null,
   ESCALON              VARCHAR(100)         null,
   MESOCICLO            VARCHAR(100)         null,
   FECHA                DATE                 null,
   NRO_DEPORTISTAS      INT2                 null,
   OBJETIVO             VARCHAR(10000)       null,
   TIPO_TEST            VARCHAR(10000)       null,
   TOMA1                VARCHAR(100)         null,
   TOMA2                VARCHAR(100)         null,
   TOMA3                VARCHAR(100)         null,
   TOMA4                VARCHAR(100)         null,
   TOMA5                VARCHAR(100)         null,
   EVALUACION           VARCHAR(2)           null
      constraint CKC_EVALUACION_TEST_DEP check (EVALUACION is null or (EVALUACION in ('MB','B','R','M'))),
   constraint PK_TEST_DEPORTISTAS primary key (ID_TEST)
);

comment on table TEST_DEPORTISTAS is
'Se va a tener los test realizados a todos los deportistas';

/*==============================================================*/
/* Index: I_ID_TEST                                             */
/*==============================================================*/
create  index I_ID_TEST on TEST_DEPORTISTAS (
ID_TEST
);

/*==============================================================*/
/* Table: TRF_MOTIVO                                            */
/*==============================================================*/
create table TRF_MOTIVO (
   MTV_ID               SERIAL               not null,
   MTV_AREA             VARCHAR(20)          null,
   MTV_MOTIVO           VARCHAR(50)          null,
   constraint PK_TRF_MOTIVO primary key (MTV_ID)
);

comment on table TRF_MOTIVO is
'Tabla de motivo de consulta de cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRF_MOTIVO.MTV_ID is
'Código único para el motivo de la consulta médica en la federación deportiva de Imbabura';

comment on column TRF_MOTIVO.MTV_AREA is
'Área médica asignada al motivo de la consulta médica en la federación deportiva de Imbabura';

comment on column TRF_MOTIVO.MTV_MOTIVO is
'Motivo de la consulta médica en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_MTV_ID                                              */
/*==============================================================*/
create  index I_MTV_ID on TRF_MOTIVO (
MTV_ID
);

/*==============================================================*/
/* Table: TRP_DIAGNOSTICO_TERAPEUTICO                           */
/*==============================================================*/
create table TRP_DIAGNOSTICO_TERAPEUTICO (
   PBF_ID               SERIAL               not null,
   SGF_ID               INT4                 null,
   MTV_ID               INT4                 null,
   PBF_AREA_AFECTADA    VARCHAR(50)          null,
   PBF_ESCALA           VARCHAR(2)           null,
   PBF_ANTECEDENTE      VARCHAR(1000)        null,
   PBF_DIAGNOSTICO      VARCHAR(1000)        null,
   PBF_SESIONNUM        INT4                 null,
   constraint PK_TRP_DIAGNOSTICO_TERAPEUTICO primary key (PBF_ID)
);

comment on table TRP_DIAGNOSTICO_TERAPEUTICO is
'Tabla de pruebas físicas que se realizan a cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.PBF_ID is
'Código único de las pruebas físicas que se realizan a cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.SGF_ID is
'Código foráneo para cada seguimiento fisioterapéutico de cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.MTV_ID is
'Código foráneo para el motivo de la consulta médica en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.PBF_AREA_AFECTADA is
'Área afectada del paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.PBF_ESCALA is
'Escala según la prueba de Daniels del Área afectada del paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.PBF_ANTECEDENTE is
'Antecedentes del paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.PBF_DIAGNOSTICO is
'diagnóstico de las pruebas físicas que realizan exámenes sobre del Área afectada del paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_DIAGNOSTICO_TERAPEUTICO.PBF_SESIONNUM is
'Numero de sesiones diagnosticadas por fisioterapista de la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_PBF_ID                                              */
/*==============================================================*/
create  index I_PBF_ID on TRP_DIAGNOSTICO_TERAPEUTICO (
PBF_ID
);

/*==============================================================*/
/* Table: TRP_SEGUIMIENTO_FISIOTERAPIA                          */
/*==============================================================*/
create table TRP_SEGUIMIENTO_FISIOTERAPIA (
   SGF_ID               SERIAL               not null,
   PRS_ID               INT4                 null,
   SGF_FECHA            DATE                 null,
   SGF_DIAGNOSTICO_SUG  VARCHAR(100)         null,
   AGF_AREA_SUG         VARCHAR(30)          null,
   SGF_NUMSESION_SUG    INT4                 null,
   SGF_OBSERVACION_SUG  VARCHAR(500)         null,
   SGF_ESTADO           BOOL                 null,
   constraint PK_TRP_SEGUIMIENTO_FISIOTERAPI primary key (SGF_ID)
);

comment on table TRP_SEGUIMIENTO_FISIOTERAPIA is
'Tabla de seguimiento fisioterapéutico de cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.SGF_ID is
'Código único para cada seguimiento fisioterapéutico de cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.PRS_ID is
'Código foráneo asignado a la persona registradas en la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.SGF_FECHA is
'Fecha de la terapia después de pasar por el médico general';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.SGF_DIAGNOSTICO_SUG is
'Diagnóstico sugerido por el doctor Código de la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.AGF_AREA_SUG is
'Área afectada diagnosticado por el doctor de la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.SGF_NUMSESION_SUG is
'Numero de sesiones sugeridas por el doctor de la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.SGF_OBSERVACION_SUG is
'Observaciones sugeridas por el doctor de la federación deportiva de Imbabura';

comment on column TRP_SEGUIMIENTO_FISIOTERAPIA.SGF_ESTADO is
'Estado del seguimiento terapéutico asignado por el doctor de la federación deportiva de Imbabura: el campo cambia a estado inactivo cuando es creada cuanto se crea uno nuevo';

/*==============================================================*/
/* Index: I__SGF_ID                                             */
/*==============================================================*/
create  index I__SGF_ID on TRP_SEGUIMIENTO_FISIOTERAPIA (
SGF_ID
);

/*==============================================================*/
/* Table: TRP_TERAPIA                                           */
/*==============================================================*/
create table TRP_TERAPIA (
   TTM_ID               SERIAL               not null,
   PBF_ID               INT4                 null,
   TTM_FECHA            DATE                 null,
   TTM_CQCB             BOOL                 null,
   TTM_CQC              VARCHAR(20)          null,
   TTM_CRIOTERAPIAB     BOOL                 null,
   TTM_CRIOTERAPIA      VARCHAR(20)          null,
   TTM_PARAFINAB        BOOL                 null,
   TTM_PARAFINA         VARCHAR(20)          null,
   TTM_ELECTROTERAPIAB  BOOL                 null,
   TTM_ELECTROTERAPIA   VARCHAR(20)          null,
   TTM_UB               BOOL                 null,
   TTM_U                VARCHAR(20)          null,
   TTM_MAGNETOB         BOOL                 null,
   TTM_MAGNETO          VARCHAR(20)          null,
   TTM_LASERB           BOOL                 null,
   TTM_LASER            VARCHAR(20)          null,
   TTM_ISOMETRICOB      BOOL                 null,
   TTM_ISOMETRICO       VARCHAR(20)          null,
   TTM_ISOTONICOB       BOOL                 null,
   TTM_ISOTONICO        VARCHAR(20)          null,
   TTM_PROPIOCEPCIONB   BOOL                 null,
   TTM_PROPIOCEPCION    VARCHAR(20)          null,
   TTM_TERAPEUTICOB     BOOL                 null,
   TTM_TERAPEUTICO      VARCHAR(20)          null,
   TTM_ESTIRAMIENTOB    BOOL                 null,
   TTM_ESTIRAMIENTO     VARCHAR(20)          null,
   TTM_OTROB            BOOL                 null,
   TTM_OTRO             VARCHAR(20)          null,
   TTM_NUMSESIONACTUAL  INT4                 null,
   TTM_PORCENTAJEASISTIDO INT4                 null,
   TTM_INDICACION       VARCHAR(200)         null,
   constraint PK_TRP_TERAPIA primary key (TTM_ID)
);

comment on table TRP_TERAPIA is
'Tabla de tratamiento cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_TERAPIA.TTM_ID is
'Código único para el tratamiento cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_TERAPIA.PBF_ID is
'Código foráneo de las pruebas físicas que se realizan a cada paciente atendido en la federación deportiva de Imbabura';

comment on column TRP_TERAPIA.TTM_FECHA is
'Fecha de asistencia para seguimiento de las terapias diarias';

comment on column TRP_TERAPIA.TTM_CQCB is
'Afirmación tratamiento cqc';

comment on column TRP_TERAPIA.TTM_CQC is
'Tratamiento cqc';

comment on column TRP_TERAPIA.TTM_CRIOTERAPIAB is
'Afirmación tratamiento crioterapia';

comment on column TRP_TERAPIA.TTM_CRIOTERAPIA is
'Tratamiento crioterapia';

comment on column TRP_TERAPIA.TTM_PARAFINAB is
'Afirmación tratamiento parafina';

comment on column TRP_TERAPIA.TTM_PARAFINA is
'Tratamiento parafina';

comment on column TRP_TERAPIA.TTM_ELECTROTERAPIAB is
'Afirmación tratamiento electroterapia';

comment on column TRP_TERAPIA.TTM_ELECTROTERAPIA is
'Tratamiento electroterapia';

comment on column TRP_TERAPIA.TTM_UB is
'Afirmación tratamiento us';

comment on column TRP_TERAPIA.TTM_U is
'Tratamiento us';

comment on column TRP_TERAPIA.TTM_MAGNETOB is
'Afirmación tratamiento magneto';

comment on column TRP_TERAPIA.TTM_MAGNETO is
'Tratamiento magneto';

comment on column TRP_TERAPIA.TTM_LASERB is
'Afirmación tratamiento laser';

comment on column TRP_TERAPIA.TTM_LASER is
'Tratamiento laser';

comment on column TRP_TERAPIA.TTM_ISOMETRICOB is
'Afirmación tratamiento isometrico';

comment on column TRP_TERAPIA.TTM_ISOMETRICO is
'Tratamiento isometrico';

comment on column TRP_TERAPIA.TTM_ISOTONICOB is
'Afirmación tratamiento isotonico';

comment on column TRP_TERAPIA.TTM_ISOTONICO is
'Tratamiento isotonico';

comment on column TRP_TERAPIA.TTM_PROPIOCEPCIONB is
'Afirmación tratamiento propiocepción';

comment on column TRP_TERAPIA.TTM_PROPIOCEPCION is
'Tratamiento propiocepción';

comment on column TRP_TERAPIA.TTM_ESTIRAMIENTOB is
'Afirmación tratamiento estiramiento';

comment on column TRP_TERAPIA.TTM_ESTIRAMIENTO is
'Tratamiento estiramiento';

comment on column TRP_TERAPIA.TTM_OTROB is
'Afirmación otros tratamientos ';

comment on column TRP_TERAPIA.TTM_OTRO is
'Otros tratamientos ';

comment on column TRP_TERAPIA.TTM_NUMSESIONACTUAL is
'Números de sesiones actuales asistidas por el paciente, el campo será auto incrementará hasta el número de sesiones diagnosticados por el terapeuta ';

comment on column TRP_TERAPIA.TTM_PORCENTAJEASISTIDO is
'Porcentaje de asistencia de acuerdo al número de asistencia a los ejercicios terapéuticos';

comment on column TRP_TERAPIA.TTM_INDICACION is
'Indicaciones del fisioterapeuta de acuerdo con el tratamiento asignado a realizar ';

/*==============================================================*/
/* Index: I_TTM_ID                                              */
/*==============================================================*/
create  index I_TTM_ID on TRP_TERAPIA (
TTM_ID
);

alter table ASISTENCIA
   add constraint FK_ASISTENC_ASISTENCI_FDI_DEPO foreign key (DEPOR_ID)
      references FDI_DEPORTISTAS (DEPOR_ID)
      on delete restrict on update restrict;

alter table ATR_CATEGORIZACION
   add constraint FK_ATR_CATE_RF_ATR_CA_ATR_DISC foreign key (DISCOMP_ID)
      references ATR_DISCIPLINASCOMPARATIVAS (DISCOMP_ID)
      on delete restrict on update restrict;

alter table ATR_CATEGORIZACION
   add constraint FK_ATR_CATE_RF_ATR_CA_ATR_SOMA foreign key (SOMATO_ID)
      references ATR_SOMATOTIPO (SOMATO_ID)
      on delete restrict on update restrict;

alter table ATR_DISCIPLINASCOMPARATIVAS
   add constraint FK_ATR_DISC_RF_ATR_DI_FDI_CATE foreign key (CATDISCI_ID)
      references FDI_CATEGORIA_DISCIPLINA (CATDISCI_ID)
      on delete restrict on update restrict;

alter table ATR_FRACCIONAMIENTO
   add constraint FK_ATR_FRAC_RF_ATR_FR_ATR_PLAN foreign key (PLANILLA_ID)
      references ATR_PLANILLAMEDIDAS (PLANILLA_ID)
      on delete restrict on update restrict;

alter table ATR_INDICEESTADOSALUD
   add constraint FK_ATR_INDI_RF_ATR_IN_ATR_FRAC foreign key (FRACCIO_ID)
      references ATR_FRACCIONAMIENTO (FRACCIO_ID)
      on delete restrict on update restrict;

alter table ATR_PLANILLAMEDIDAS
   add constraint FK_ATR_PLAN_RF_FDI_ENTR foreign key (FDI_ENTRE_ID)
      references FDI_ENTRENADOR (ENTRE_ID)
      on delete restrict on update restrict;

alter table ATR_PLANILLAMEDIDAS
   add constraint FK_ATR_PLAN_RF_ATR_PL_FDI_ENTR foreign key (ENTRE_ID)
      references FDI_ENTRENADOR (ENTRE_ID)
      on delete restrict on update restrict;

alter table ATR_PLANILLAMEDIDAS
   add constraint FK_ATR_PLAN_RF_ATR_PL_FDI_DEPO foreign key (DEPOR_ID)
      references FDI_DEPORTISTAS (DEPOR_ID)
      on delete restrict on update restrict;

alter table ATR_PROPORCIONALIDADPHANTOM
   add constraint FK_ATR_PROP_RF_ATR_PR_ATR_PLAN foreign key (PLANILLA_ID)
      references ATR_PLANILLAMEDIDAS (PLANILLA_ID)
      on delete restrict on update restrict;

alter table ATR_SOMATOTIPO
   add constraint FK_ATR_SOMA_RF_ATR_SO_ATR_PLAN foreign key (PLANILLA_ID)
      references ATR_PLANILLAMEDIDAS (PLANILLA_ID)
      on delete restrict on update restrict;

alter table CANTON
   add constraint FK_CANTON_RF_CANTON_PROVINCI foreign key (DPA_PROVINCIA)
      references PROVINCIA (DPA_PROVINCIA)
      on delete restrict on update restrict;

alter table ED_CONTROL_ASISTENCIA
   add constraint FK_ED_CONTR_ED_CONTRO_ASISTENC foreign key (ID_ASISTENCIA)
      references ASISTENCIA (ID_ASISTENCIA)
      on delete restrict on update restrict;

alter table ED_CONTROL_ASISTENCIA
   add constraint FK_ED_CONTR_ED_CONTRO_FDI_CATE foreign key (CATDISCI_ID)
      references FDI_CATEGORIA_DISCIPLINA (CATDISCI_ID)
      on delete restrict on update restrict;

alter table ED_DEPORTISTA_ENTRENADOR
   add constraint FK_ED_DEPOR_ED_DEPORT_FDI_ENTR foreign key (ENTRE_ID)
      references FDI_ENTRENADOR (ENTRE_ID)
      on delete restrict on update restrict;

alter table ED_DEPORTISTA_ENTRENADOR
   add constraint FK_ED_DEPOR_ED_DEPORT_FDI_DEPO foreign key (DEPOR_ID)
      references FDI_DEPORTISTAS (DEPOR_ID)
      on delete restrict on update restrict;

alter table ED_PREMIOS_DEPORTISTA
   add constraint FK_ED_PREMI_ED_PREMIO_COMPETEN foreign key (ID_COMPETENCIA)
      references COMPETENCIAS (ID_COMPETENCIA)
      on delete restrict on update restrict;

alter table ED_PREMIOS_DEPORTISTA
   add constraint FK_ED_PREMI_ED_PREMIO_FDI_DEPO foreign key (DEPOR_ID)
      references FDI_DEPORTISTAS (DEPOR_ID)
      on delete restrict on update restrict;

alter table FDI_CATEGORIA_DISCIPLINA
   add constraint FK_FDI_CATE_RF_FDI_CA_FDI_CATE foreign key (CATEGORIA_ID)
      references FDI_CATEGORIA (CATEGORIA_ID)
      on delete restrict on update restrict;

alter table FDI_CATEGORIA_DISCIPLINA
   add constraint FK_FDI_CATE_RF_FDI_CA_FDI_DISC foreign key (DISCIPLINA_ID)
      references FDI_DISCIPLINA (DISCIPLINA_ID)
      on delete restrict on update restrict;

alter table FDI_DEPORTISTAS
   add constraint FK_FDI_DEPO_RF_ATR_DE_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table FDI_DEPORTISTAS
   add constraint FK_FDI_DEPO_RF_FDI_DE_FDI_CATE foreign key (CATDISCI_ID)
      references FDI_CATEGORIA_DISCIPLINA (CATDISCI_ID)
      on delete restrict on update restrict;

alter table FDI_DISCIPLINA
   add constraint FK_FDI_DISC_RF_FDI_DI_ED_CAMPO foreign key (CAMPENTRE_ID)
      references ED_CAMPOS_ENTRENAMIENTO (CAMPENTRE_ID)
      on delete restrict on update restrict;

alter table FDI_ENTRENADOR
   add constraint FK_FDI_ENTR_FDI_ENTRE_FDI_CATE foreign key (CATDISCI_ID)
      references FDI_CATEGORIA_DISCIPLINA (CATDISCI_ID)
      on delete restrict on update restrict;

alter table FDI_ENTRENADOR
   add constraint FK_FDI_ENTR_RF_FDI_EN_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table FDI_PERSONA
   add constraint FK_FDI_PERS_RF_FDI_PE_PARROQUI foreign key (DPA_PARR)
      references PARROQUIA (DPA_PARR)
      on delete restrict on update restrict;

alter table FDI_USERS_ROLES
   add constraint FK_FDI_USER_RF_FDI_US_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table FDI_USERS_ROLES
   add constraint FK_FDI_USER_RF_FDI_US_FDI_ROL foreign key (ROL_ID)
      references FDI_ROL (ROL_ID)
      on delete restrict on update restrict;

alter table MDC_BENEFICIO
   add constraint FK_MDC_BENE_R_PERSONA_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table MDC_TIPO_BENEFICIO
   add constraint FK_MDC_TIPO_REFERENCE_MDC_BENE foreign key (BNF_ID)
      references MDC_BENEFICIO (BNF_ID)
      on delete restrict on update restrict;

alter table MDC_TIPO_DESCUENTO
   add constraint FK_MDC_TIPO_R_PERSONA_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table PARROQUIA
   add constraint FK_PARROQUI_RF_PARROQ_CANTON foreign key (DPA_CANTON)
      references CANTON (DPA_CANTON)
      on delete restrict on update restrict;

alter table PSG_SEGUIMIENTO_PSICOLOGICO
   add constraint FK_PSG_SEGU_R_MOTIVO__TRF_MOTI foreign key (MTV_ID)
      references TRF_MOTIVO (MTV_ID)
      on delete restrict on update restrict;

alter table PSG_SEGUIMIENTO_PSICOLOGICO
   add constraint FK_PSG_SEGU_R_PERSONA_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table PSG_SESION
   add constraint FK_PSG_SESI_R_SEGUIMI_PSG_SEGU foreign key (SGP_ID)
      references PSG_SEGUIMIENTO_PSICOLOGICO (SGP_ID)
      on delete restrict on update restrict;

alter table TEST_DEPORTISTAS
   add constraint FK_TEST_DEP_TEST_DEPO_ED_DEPOR foreign key (ID_DEP_ENTRE)
      references ED_DEPORTISTA_ENTRENADOR (ID_DEP_ENTRE)
      on delete restrict on update restrict;

alter table TRP_DIAGNOSTICO_TERAPEUTICO
   add constraint FK_TRP_DIAG_R_MOTIVO__TRF_MOTI foreign key (MTV_ID)
      references TRF_MOTIVO (MTV_ID)
      on delete restrict on update restrict;

alter table TRP_DIAGNOSTICO_TERAPEUTICO
   add constraint FK_TRP_DIAG_R_SEGUIMI_TRP_SEGU foreign key (SGF_ID)
      references TRP_SEGUIMIENTO_FISIOTERAPIA (SGF_ID)
      on delete restrict on update restrict;

alter table TRP_SEGUIMIENTO_FISIOTERAPIA
   add constraint FK_TRP_SEGU_R_PERSONA_FDI_PERS foreign key (PRS_ID)
      references FDI_PERSONA (PRS_ID)
      on delete restrict on update restrict;

alter table TRP_TERAPIA
   add constraint FK_TRP_TERA_R_SEGUIMI_TRP_DIAG foreign key (PBF_ID)
      references TRP_DIAGNOSTICO_TERAPEUTICO (PBF_ID)
      on delete restrict on update restrict;
