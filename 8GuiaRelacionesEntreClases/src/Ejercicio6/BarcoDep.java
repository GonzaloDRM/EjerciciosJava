
package Ejercicio6;

import java.util.Date;

public class BarcoDep extends Barco{
    
    private int potenciaD;

    public BarcoDep() {
    }

    public BarcoDep(int potenciaD) {
        this.potenciaD = potenciaD;
    }

    public BarcoDep(int potenciaD, String matricula, int slora, Date anoFabr, int precioBase) {
        super(matricula, slora, anoFabr, precioBase);
        this.potenciaD = potenciaD;
    }

    public int getPotenciaD() {
        return potenciaD;
    }

    public void setPotenciaD(int potenciaD) {
        this.potenciaD = potenciaD;
    }

    @Override
    public String toString() {
        return "BarcoDep{" + "matricula=" + matricula + ", slora=" + slora + ", Fecha de fabricacion=" + anoFabr + "potenciaD=" + potenciaD + '}';
    }
    
}
