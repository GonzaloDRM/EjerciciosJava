
package Ejercicio1;

public class Revolver {
    
    private int posActual;
    private int posBala;

    public Revolver(int posActual, int posBala) {
        this.posActual = posActual;
        this.posBala = posBala;
    }

    public Revolver() {
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosBala() {
        return posBala;
    }

    public void setPosBala(int posBala) {
        this.posBala = posBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posBala=" + posBala + '}';
    }
    
}
