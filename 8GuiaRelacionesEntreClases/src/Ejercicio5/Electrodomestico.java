
package Ejercicio5;

import java.util.Scanner;

public class Electrodomestico {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    protected int precioBase = 1000;
    protected String color = "blanco";
    protected String consum = "F";
    protected int peso = 5;
    protected double precioFinal;
    
    public Electrodomestico() {
    }
    
    public Electrodomestico(int precioBase, String color, String consum, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consum = consum;
        this.peso = peso;
    }
    
    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color);
    }

    public String getConsum() {
        return consum;
    }

    public void setConsum(String consum) {
        this.consum = consum;
        comprobarConsumo();
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    public void comprobarColor(String color){
        if(color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("verde")){
            this.color = color.substring(0, 1).toUpperCase() + color.substring(1, color.length()).toLowerCase();
        } else{
            this.color = "Blanco";
        }
    }
    
    public void comprobarConsumo(){
        if(consum.toUpperCase().equals("A") || consum.toUpperCase().equals("B") || consum.toUpperCase().equals("D") || consum.toUpperCase().equals("E")){
            consum = consum.toUpperCase();
        }else{
            consum = "F";
        }   
    }
    
    public double precioFinal(){
        int con=0, pes=0;
        switch(consum.toUpperCase()){
            case "A": con = 1000;
                break;
            case "B": con = 800;
                break;
            case "C": con = 600;
                break;
            case "D": con = 500;
                break;
            case "E": con = 300;
                break;
            case "F": con = 100;
                break;
        }
        if(peso<=19){
            pes = 100;
        }else if(peso<=49 && peso>=20){
            pes = 500;
        }else if(peso<=79 && peso>=50){
            pes = 800;
        }else{
            pes = 1000;
        }       
        precioFinal = getPrecioBase() + con + pes;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "sc=" + sc + ", precioBase=" + precioBase + ", color=" + color + ", consum=" + consum + ", peso=" + peso + ", precioFinal=" + precioFinal + '}';
    }
    
}
