
package Ejercicio1class;

public class Revolver {
    private int posicionActual;
    private int posicionBala;

    public Revolver(int posicionActual, int posicionBala) {
        this.posicionActual = posicionActual;
        this.posicionBala = posicionBala;
    }

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }
       
}
