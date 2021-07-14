
package Ejercicio4;

public class Gato extends Animal{

    public Gato(String raza) {
        super(raza);
    }


    @Override
    public void alimento() {
        System.out.println("El gato come pescado");
    }
       
}
