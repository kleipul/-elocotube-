package modelo;

//Clase Video (para tabla video)

public class video {
    
    private int idVideo;
    private String tiutlo;
    private int hora;
    private int minuto;
    private int segundo;
    private String canal;
    private String descripcion;
    private int reproducciones;

    public video() {
        this.idVideo = 0;
        this.tiutlo = "no info";
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
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

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
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
        return "video{" + "idVideo=" + idVideo + ", tiutlo=" + tiutlo 
                + ", hora=" + hora + ", minuto=" + minuto + ", segundo=" 
                + segundo + ", canal=" + canal + ", descripcion=" + descripcion 
                + ", reproducciones=" + reproducciones + '}';
    }
    
    

    
    

}
