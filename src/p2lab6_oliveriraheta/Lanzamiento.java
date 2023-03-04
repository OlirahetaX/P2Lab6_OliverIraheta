
package p2lab6_oliveriraheta;


public class Lanzamiento {
    private String tituloPublicacion,FecLanzamiento;
    private int likes;

    public Lanzamiento(String tituloPublicacion, String FecLanzamiento, int likes) {
        this.tituloPublicacion = tituloPublicacion;
        this.FecLanzamiento = FecLanzamiento;
        this.likes = likes;
    }

    public Lanzamiento() {
    }

    public String getTituloPublicacion() {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion) {
        this.tituloPublicacion = tituloPublicacion;
    }

    public String getFecLanzamiento() {
        return FecLanzamiento;
    }

    public void setFecLanzamiento(String FecLanzamiento) {
        this.FecLanzamiento = FecLanzamiento;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return  tituloPublicacion ;
    }
    
}
