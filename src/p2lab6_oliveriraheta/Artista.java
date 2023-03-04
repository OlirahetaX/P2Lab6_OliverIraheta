package p2lab6_oliveriraheta;

import java.util.ArrayList;

public class Artista extends Usuario {

    private String nameAr;
    private ArrayList canciones = new ArrayList();
    private ArrayList albumes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String nameAr, String user, String password, int edad, boolean boo) throws Exception {
        super(user, password, edad, boo);
        this.nameAr = nameAr;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public ArrayList getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList canciones) {
        this.canciones = canciones;
    }

    public ArrayList getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList albumes) {
        this.albumes = albumes;
    }
    
}
