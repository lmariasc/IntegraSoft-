
package dominio;

/**
 *
 * @author IntegraSoft
 */
public class CasoPrueba {

    private Long idCasoPrueba;
    private String casoUso;
    private String moduloSistema;
    private String versionEjecucion;
    private String fechaEjecucion;
    private String descripcionCasoPrueba;
    private String preCondiciones;
    private String pasosPrueba;
    private String postCondiciones;
    private String defectosDesviaciones;
    private String veredicto;
    private String observaciones;
    private String probador;
    private String nombre;
    private String firma;
    private String fecha;

    public CasoPrueba() {
    }

    public CasoPrueba(String casoUso, String moduloSistema, String versionEjecucion, String fechaEjecucion, String descripcionCasoPrueba, String preCondiciones, String pasosPrueba, String postCondiciones, String defectosDesviaciones, String veredicto, String observaciones, String probador, String nombre, String firma, String fecha) {
        this.casoUso = casoUso;
        this.moduloSistema = moduloSistema;
        this.versionEjecucion = versionEjecucion;
        this.fechaEjecucion = fechaEjecucion;
        this.descripcionCasoPrueba = descripcionCasoPrueba;
        this.preCondiciones = preCondiciones;
        this.pasosPrueba = pasosPrueba;
        this.postCondiciones = postCondiciones;
        this.defectosDesviaciones = defectosDesviaciones;
        this.veredicto = veredicto;
        this.observaciones = observaciones;
        this.probador = probador;
        this.nombre = nombre;
        this.firma = firma;
        this.fecha = fecha;
    }

    public CasoPrueba(Long idCasoPrueba, String casoUso, String moduloSistema, String versionEjecucion, String fechaEjecucion, String descripcionCasoPrueba, String preCondiciones, String pasosPrueba, String postCondiciones, String defectosDesviaciones, String veredicto, String observaciones, String probador, String nombre, String firma, String fecha) {
        this.idCasoPrueba = idCasoPrueba;
        this.casoUso = casoUso;
        this.moduloSistema = moduloSistema;
        this.versionEjecucion = versionEjecucion;
        this.fechaEjecucion = fechaEjecucion;
        this.descripcionCasoPrueba = descripcionCasoPrueba;
        this.preCondiciones = preCondiciones;
        this.pasosPrueba = pasosPrueba;
        this.postCondiciones = postCondiciones;
        this.defectosDesviaciones = defectosDesviaciones;
        this.veredicto = veredicto;
        this.observaciones = observaciones;
        this.probador = probador;
        this.nombre = nombre;
        this.firma = firma;
        this.fecha = fecha;
    }

    public Long getIdCasoPrueba() {
        return idCasoPrueba;
    }

    public void setIdCasoPrueba(Long idCasoPrueba) {
        this.idCasoPrueba = idCasoPrueba;
    }

    public String getCasoUso() {
        return casoUso;
    }

    public void setCasoUso(String casoUso) {
        this.casoUso = casoUso;
    }

    public String getModuloSistema() {
        return moduloSistema;
    }

    public void setModuloSistema(String moduloSistema) {
        this.moduloSistema = moduloSistema;
    }

    public String getVersionEjecucion() {
        return versionEjecucion;
    }

    public void setVersionEjecucion(String versionEjecucion) {
        this.versionEjecucion = versionEjecucion;
    }

    public String getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(String fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }

    public String getDescripcionCasoPrueba() {
        return descripcionCasoPrueba;
    }

    public void setDescripcionCasoPrueba(String descripcionCasoPrueba) {
        this.descripcionCasoPrueba = descripcionCasoPrueba;
    }

    public String getPreCondiciones() {
        return preCondiciones;
    }

    public void setPreCondiciones(String preCondiciones) {
        this.preCondiciones = preCondiciones;
    }

    public String getPasosPrueba() {
        return pasosPrueba;
    }

    public void setPasosPrueba(String pasosPrueba) {
        this.pasosPrueba = pasosPrueba;
    }

    public String getPostCondiciones() {
        return postCondiciones;
    }

    public void setPostCondiciones(String postCondiciones) {
        this.postCondiciones = postCondiciones;
    }

    public String getDefectosDesviaciones() {
        return defectosDesviaciones;
    }

    public void setDefectosDesviaciones(String defectosDesviaciones) {
        this.defectosDesviaciones = defectosDesviaciones;
    }

    public String getVeredicto() {
        return veredicto;
    }

    public void setVeredicto(String veredicto) {
        this.veredicto = veredicto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getProbador() {
        return probador;
    }

    public void setProbador(String probador) {
        this.probador = probador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}

    