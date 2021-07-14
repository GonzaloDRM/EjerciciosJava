
package Ejercicio6;

import java.util.Date;

public class Velero extends Barco{
    
    private int mastiles;

    public Velero() {
    }
    
    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, String matricula, int slora, Date anoFabr, int precioBase) {
        super(matricula, slora, anoFabr, precioBase);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "matricula=" + matricula + ", slora=" + slora + ", Fecha de fabricacion=" + anoFabr + "mastiles=" + mastiles + '}';
    }
    
}
