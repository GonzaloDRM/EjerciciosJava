
package Objetos;

import java.util.Date;

public class Personal extends Persona{
    
    private Date incorporacion;
    private int numDespacho;

    public Personal() {
    }

    public Personal(Date incorporacion, int numDespacho) {
        this.incorporacion = incorporacion;
        this.numDespacho = numDespacho;
    }

    public Personal(Date incorporacion, int numDespacho, String nombre, int dni, String estCivil) {
        super(nombre, dni, estCivil);
        this.incorporacion = incorporacion;
        this.numDespacho = numDespacho;
    }

    public Date getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(Date incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Personal{" + "nombre=" + nombre + ", dni=" + dni + ", estCivil=" + estCivil + "incorporacion=" + incorporacion + ", numDespacho=" + numDespacho + '}';
    }
    
}
