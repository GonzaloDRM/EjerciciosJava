
package Objetos;

public class PersonalServ extends Persona{
    
    private String seccion;

    public PersonalServ() {
    }

    public PersonalServ(String seccion) {
        this.seccion = seccion;
    }

    public PersonalServ(String seccion, String nombre, int dni, String estCivil) {
        super(nombre, dni, estCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServ{" + "nombre=" + nombre + ", dni=" + dni + ", estCivil=" + estCivil + "seccion=" + seccion + '}';
    }
    
}    
