package modelo;

//Clase Video (para tabla video)
public class Video {

    private int nroVideo;
    private int hora;
    private int minuto;
    private int segundo;
    private String descripcion;
    private boolean hd;
    private String url;

    public Video() {
        this.nroVideo = 0;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
        this.descripcion = "no info";
        this.hd = true;
        this.url="no info";
        
        
    }

    public int getNroVideo() {
        return nroVideo;
    }

    public void setNroVideo(int nroVideo) {
        this.nroVideo = nroVideo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isHd() {
        return hd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Video{" + "nroVideo=" + nroVideo + ", hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + ", descripcion=" + descripcion + ", hd=" + hd + ", url=" + url + '}';
    }
    
    
}