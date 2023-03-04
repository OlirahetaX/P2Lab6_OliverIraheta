
package p2lab6_oliveriraheta;

import java.util.ArrayList;


public class Cliente extends Usuario{
    private ArrayList cancionesFav = new ArrayList();
    private ArrayList RepCreadas = new ArrayList();
    private ArrayList cancionesLike = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(String user, String password, int edad, boolean boo) throws Exception {
        super(user, password, edad, boo);
    }

    public ArrayList getCancionesFav() {
        return cancionesFav;
    }

    public void setCancionesFav(ArrayList cancionesFav) {
        this.cancionesFav = cancionesFav;
    }

    public ArrayList getRepCreadas() {
        return RepCreadas;
    }

    public void setRepCreadas(ArrayList RepCreadas) {
        this.RepCreadas = RepCreadas;
    }

    public ArrayList getCancionesLike() {
        return cancionesLike;
    }

    public void setCancionesLike(ArrayList cancionesLike) {
        this.cancionesLike = cancionesLike;
    }
    
}
