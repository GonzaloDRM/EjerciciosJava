
package Ejercicio3;

public class Carta {
    
    private int numero;
    private Palos palos;

    public Carta(int numero, Palos palos) {
        this.numero = numero;
        this.palos = palos;
    }

    public Carta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palos=" + palos + '}';
    }
    
}
