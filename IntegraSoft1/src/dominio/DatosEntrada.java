
package dominio;

/**
 *
 * @author Integrasoft
 */
public class DatosEntrada {
    private Long idDatosPrueba;
    private String campo;
    private String valor;
    private String tipoEscenario;
    private String respuestaAplicacion;
    private String coincide;
    private String respuestaSistema;

    public DatosEntrada() {
    }

    public DatosEntrada(String campo, String valor, String tipoEscenario, String respuestaAplicacion, String coincide, String respuestaSistema) {
        this.campo = campo;
        this.valor = valor;
        this.tipoEscenario = tipoEscenario;
        this.respuestaAplicacion = respuestaAplicacion;
        this.coincide = coincide;
        this.respuestaSistema = respuestaSistema;
    }

    public DatosEntrada(Long idDatosPrueba, String campo, String valor, String tipoEscenario, String respuestaAplicacion, String coincide, String respuestaSistema) {
        this.idDatosPrueba = idDatosPrueba;
        this.campo = campo;
        this.valor = valor;
        this.tipoEscenario = tipoEscenario;
        this.respuestaAplicacion = respuestaAplicacion;
        this.coincide = coincide;
        this.respuestaSistema = respuestaSistema;
    }

    public Long getIdDatosPrueba() {
        return idDatosPrueba;
    }

    public void setIdDatosPrueba(Long idDatosPrueba) {
        this.idDatosPrueba = idDatosPrueba;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipoEscenario() {
        return tipoEscenario;
    }

    public void setTipoEscenario(String tipoEscenario) {
        this.tipoEscenario = tipoEscenario;
    }

    public String getRespuestaAplicacion() {
        return respuestaAplicacion;
    }

    public void setRespuestaAplicacion(String respuestaAplicacion) {
        this.respuestaAplicacion = respuestaAplicacion;
    }

    public String getCoincide() {
        return coincide;
    }

    public void setCoincide(String coincide) {
        this.coincide = coincide;
    }

    public String getRespuestaSistema() {
        return respuestaSistema;
    }

    public void setRespuestaSistema(String respuestaSistema) {
        this.respuestaSistema = respuestaSistema;
    }


  
}
