
package p2lab6_oliveriraheta;

import java.util.ArrayList;


public class ListaDeCancion {
    private String nombre;
    private int likes;
    private ArrayList <Cancion> canciones = new ArrayList();

    public ListaDeCancion() {
    }

    public ListaDeCancion(String nombre, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
}
