
package Objetos;

import Interfaces.InstalacionDeportiva;
import Interfaces.Edificio;

public class Polideportivo implements InstalacionDeportiva, Edificio{
    
    private String nombre;
    private int largo;
    private int ancho;
    private String tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, int largo, int ancho, String tipo) {
        this.nombre = nombre;
        this.largo = largo;
        this.ancho = ancho;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int tipoDeInstalacion() {
        int resp= 0;
        if(tipo.equals("Techado")){
            resp = 1;
            System.out.println("Tipo de techo " + resp);
        }else if(tipo.equals("Abierto")){
            resp = 2;
            System.out.println("Tipo de techo " + resp);
        }else{
            resp = 0;
            System.out.println("Tipo de techo " + resp + ", ingreselo nuevamente bien");
        }
        return resp;
    }

    @Override
    public double calcularSuperficie() {
        double resp = 0;
        resp = (largo*2) + (ancho*2);
        return resp;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", largo=" + largo + ", ancho=" + ancho + ", tipo=" + tipo + '}';
    }
    
    
}
