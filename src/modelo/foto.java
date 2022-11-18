package modelo;

public class foto {

    private int nroFoto;
    private String formato;
    private String relacionAspecto;
    private String descripcion;

    public foto() {
        this.nroFoto = 0;
        this.formato = "no info";
        this.relacionAspecto = "no info";
        this.descripcion = "no info";
    }

    public int getNroFoto() {
        return nroFoto;
    }

    public void setNroFoto(int nroFoto) {
        this.nroFoto = nroFoto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getRelacionAspecto() {
        return relacionAspecto;
    }

    public void setRelacionAspecto(String relacionAspecto) {
        this.relacionAspecto = relacionAspecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "foto{" + "nroFoto=" + nroFoto + ", formato=" + formato 
                + ", relacionAspecto=" + relacionAspecto + ", descripcion=" 
                + descripcion + '}';
    }
    
    
    
    
}
