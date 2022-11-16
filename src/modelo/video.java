package modelo;

public class video {
    
    private int idVideo;
    private String tiutlo;
    private double duracion;
    private String canal;
    private String descripcion;
    private int reproducciones;

    public video() {
        this.idVideo = 0;
        this.tiutlo = "no info";
        this.duracion = 0;
        this.canal = "no info";
        this.descripcion = "no info";
        this.reproducciones = 0;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    @Override
    public String toString() {
        return "video{" + "idVideo=" + idVideo + ", tiutlo=" + tiutlo + ", duracion=" + duracion + ", canal=" + canal + ", descripcion=" + descripcion + ", reproducciones=" + reproducciones + '}';
    }
    
    
    
    

}
