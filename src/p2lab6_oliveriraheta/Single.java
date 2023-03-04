
package p2lab6_oliveriraheta;


public class Single extends Lanzamiento{
    private Cancion cancion; 

    public Single() {
        super();
    }

    public Single(Cancion cancion, String tituloPublicacion, String FecLanzamiento, int likes) {
        super(tituloPublicacion, FecLanzamiento, likes);
        this.cancion = cancion;
    }


    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
     @Override
    public String toString() {
        return super.toString();
    }
}
