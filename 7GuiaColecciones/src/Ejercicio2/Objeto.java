
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Objeto {
    
    private List<Integer> numeros = new ArrayList();
    private Integer suma;
    private Integer prom;

    public Objeto() {
    }

    public Objeto(Integer suma, Integer prom) {
        this.suma = suma;
        this.prom = prom;
    }
    

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void agregarNumeros(Integer algo){
        numeros.add(algo);
    }

    public Integer getSuma() {
        return suma;
    }

    public void setSuma(Integer suma) {
        this.suma = suma;
    }

    public Integer getProm() {
        return prom;
    }

    public void setProm(Integer prom) {
        this.prom = prom;
    }
 
}