package modelo;

public class canal {
    
    private int nroCanal;
    private String nombre;
    private int cantidadVideos;
    private int suscripciones;

    public canal() {
        this.nroCanal = 0;
        this.nombre = "no info";
        this.cantidadVideos = 0;
        this.suscripciones = 0;
    }

    public int getNroCanal() {
        return nroCanal;
    }

    public void setNroCanal(int nroCanal) {
        this.nroCanal = nroCanal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }

    public void setCantidadVideos(int cantidadVideos) {
        this.cantidadVideos = cantidadVideos;
    }

    public int getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(int suscripciones) {
        this.suscripciones = suscripciones;
    }

    @Override
    public String toString() {
        return "canal{" + "nroCanal=" + nroCanal + ", nombre=" + nombre 
                + ", cantidadVideos=" + cantidadVideos + ", suscripciones=" 
                + suscripciones + '}';
    }
    
    
    
    

}
