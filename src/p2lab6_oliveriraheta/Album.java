
package p2lab6_oliveriraheta;

import java.util.ArrayList;


public class Album extends Lanzamiento{
    private ArrayList <Cancion> canciones = new ArrayList<>();

    public Album() {
        super();
    }

    public Album(String tituloPublicacion, String FecLanzamiento, int likes) {
        super(tituloPublicacion, FecLanzamiento, likes);
    }
    
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
}
