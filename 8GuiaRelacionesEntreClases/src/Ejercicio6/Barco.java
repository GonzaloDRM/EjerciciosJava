
package Ejercicio6;

import java.util.Date;

public class Barco {
    
    protected String matricula;
    protected int slora;
    protected Date anoFabr;
    protected int precioBase;

    public Barco() {
    }

    public Barco(String matricula, int slora, Date anoFabr, int precioBase) {
        this.matricula = matricula;
        this.slora = slora;
        this.anoFabr = anoFabr;
        this.precioBase = precioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSlora() {
        return slora;
    }

    public void setSlora(int slora) {
        this.slora = slora;
    }

    public Date getAnoFabr() {
        return anoFabr;
    }

    public void setAnoFabr(Date anoFabr) {
        this.anoFabr = anoFabr;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", slora=" + slora + ", anoFabr=" + anoFabr + '}';
    }
        
}
