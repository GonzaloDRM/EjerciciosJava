
package Objetos;

import Interfaces.Edificio;

public class EdificioDeOficinas implements Edificio{
    
    private int largo;
    private int ancho;
    private int numeroDeOficinas;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int largo, int ancho, int numeroDeOficinas, int numeroDePisos) {
        this.largo = largo;
        this.ancho = ancho;
        this.numeroDeOficinas = numeroDeOficinas;
        this.numeroDePisos = numeroDePisos;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public double calcularSuperficie() {
        double resp = 0;
        resp = (largo*2) + (ancho*2);
        return resp;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "largo=" + largo + ", ancho=" + ancho + ", numeroDeOficinas=" + numeroDeOficinas + ", numeroDePisos=" + numeroDePisos + '}';
    }
    
    
}
