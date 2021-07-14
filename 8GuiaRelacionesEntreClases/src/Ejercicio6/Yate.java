
package Ejercicio6;

import java.util.Date;

public class Yate extends Barco{
    
    private int potenciaY;

    public Yate() {
    }

    public Yate(int potenciaY) {
        this.potenciaY = potenciaY;
    }

    public Yate(int potenciaY, String matricula, int slora, Date anoFabr, int precioBase) {
        super(matricula, slora, anoFabr, precioBase);
        this.potenciaY = potenciaY;
    }

    public int getPotenciaY() {
        return potenciaY;
    }

    public void setPotenciaY(int potenciaY) {
        this.potenciaY = potenciaY;
    }

    @Override
    public String toString() {
        return "Yate{" + "matricula=" + matricula + ", slora=" + slora + ", Fecha de fabricacion=" + anoFabr + "potenciaY=" + potenciaY + '}';
    }
    
}
