package com.mediateca;

//update

public class DiffDoc {
    // Atributos relevantes de diffdoc
    private String codigo;
    private String titulo;
    private String tipoDocumento; // Tipo: mapa, manual, folleto, etc.
    private String descripcion;   // Breve descripción del documento
    private int anioPublicacion;
    private int unidadesDisponibles;

    // Constructor vacío
    public DiffDoc() {
    }

    // Constructor completo
    public DiffDoc(String codigo, String titulo, String tipoDocumento, String descripcion, int anioPublicacion, int unidadesDisponibles) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tipoDocumento = tipoDocumento;
        this.descripcion = descripcion;
        this.anioPublicacion = anioPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    // Metodo para mostrar información del documento
    @Override
    public String toString() {
        return "DiffDoc{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", unidadesDisponibles=" + unidadesDisponibles +
                '}';
    }
}
