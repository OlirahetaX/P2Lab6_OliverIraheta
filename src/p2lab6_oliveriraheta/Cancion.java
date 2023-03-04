
package p2lab6_oliveriraheta;


public class Cancion {
    private String titulo,duracion,album;
    

    public Cancion(String titulo, String duracion, String album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
}
