
package Objetos;

public class Persona {
    
    protected String nombre;
    protected int dni;
    protected String estCivil;

    public Persona() {
    }

    public Persona(String nombre, int dni, String estCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.estCivil = estCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", estCivil=" + estCivil + '}';
    }
     
}
