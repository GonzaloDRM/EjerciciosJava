/*
Crear una clase llamada Palabra que mantenga información sobre diferentes
palabras con un atributo ArrayList de tipo String, que se le van a ir agregando
palabras por medio del método add(String). Al final, el programa debe permitirnos
conocer el conjunto de palabras de una determinada longitud ingresada por el
usuario. Este conjunto deberá estar ordenado alfabéticamente. Crear una
aplicación que muestre toda la información que disponga la clase Palabra.

NOTA: Si necesitas saber más sobre ordenamiento en java consulta los siguientes
links. Algoritmos de ordenamiento. / Implementar Comparator
*/

package Ejercicio1;


public class Main {

    public static void main(String[] args) {
               
        Servicios srv = new Servicios();
        
        srv.Agregar();
        srv.Mostrar();
        srv.Ordenar();
        srv.Completo();
    }
    
}
