package p2lab6_oliveriraheta;

public class Usuario {

    private String user, password;
    private int edad;
    private boolean tipoUsu;
//true si es artista

    public Usuario() {
    }

    public Usuario(String user, String password, int edad, boolean boo) throws Exception {
        this.user = user;
        this.password = password;
        setEdad(edad);
        this.tipoUsu = boo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {

        if (tipoUsu) {
            if (edad >= 18) {
                this.edad = edad;
            } else {
                throw new Exception("MENOR DE EDAD REQUIRIDA");
            }
        } else {
            if (edad >= 12) {
                this.edad = edad;
            } else {
                throw new Exception("MENOR DE EDAD REQUIRIDA");
            }
        }

    }
}
