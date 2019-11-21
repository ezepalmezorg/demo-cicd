package pe.gob.migraciones.mcm.configuracion.request;

import java.io.Serializable;

public class ParametroRENIEC implements Serializable {

    private String idDependencia;
    private String nomParametro;
    private String valor;
    private String descripcion;
    private String activo;
    private String idSesion;

    public ParametroRENIEC() {
    }

    public ParametroRENIEC(String idDependencia, String nomParametro, String valor, String descripcion, String activo, String idSesion) {
        this.idDependencia = idDependencia;
        this.nomParametro = nomParametro;
        this.valor = valor;
        this.descripcion = descripcion;
        this.activo = activo;
        this.idSesion = idSesion;
    }

    public String getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(String idDependencia) {
        this.idDependencia = idDependencia;
    }

    public String getNomParametro() {
        return nomParametro;
    }

    public void setNomParametro(String nomParametro) {
        this.nomParametro = nomParametro;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    @Override
    public String toString() {
        return "ParametroMQ{" + "idDependencia=" + idDependencia + ", nomParametro=" + nomParametro + ", valor=" + valor + ", descripcion=" + descripcion + ", activo=" + activo + ", idSesion=" + idSesion + '}';
    }
}
