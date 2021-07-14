
package Ejercicio4;

public class Caballo extends Animal{

    public Caballo(String raza) {
        super(raza);
    }

    @Override
    public void alimento() {
        System.out.println("El caballo come eno");
    }
       
}
