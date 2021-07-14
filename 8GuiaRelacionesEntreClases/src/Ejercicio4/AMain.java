/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
Crear un método abstracto en la clase Animal a través del cual cada clase hija
deberá mostrar luego un mensaje por pantalla informando de que se alimenta.
Generar una clase Main que realice lo siguiente:dd
*/

package Ejercicio4;

public class AMain {

    public static void main(String[] args) {
        Perro perro = new Perro("husky");
        Gato gato = new Gato("siames");
        Caballo caba = new Caballo("criollo");
        
        perro.alimento();
        gato.alimento();
        caba.alimento();
        
    }
}
