
package Ejercicio2;

public class Cine {
    
    private Pelicula peli;
    private int precio;

    public Cine(Pelicula peli, int precio) {
        this.peli = peli;
        this.precio = precio;
    }

    public Cine() {
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", precio=" + precio + '}';
    }
    
}
