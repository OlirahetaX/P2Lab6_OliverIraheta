
package p2lab6_oliveriraheta;


public class Cancion {
    private String titulo,duracion;
    private Album album;

    public Cancion(String titulo, String duracion, Album album) {
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    
}
