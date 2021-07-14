
package Ejercicio4;

public class Perro extends Animal{

    public Perro(String raza) {
        super(raza);
    }


    @Override
    public void alimento() {
        System.out.println("El perro come galletas");
    }
       
}
