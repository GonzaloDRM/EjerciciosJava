
package Ejercicio4;

public abstract class Animal {
    
    protected String raza;
    
    public abstract void alimento();

    public Animal(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
