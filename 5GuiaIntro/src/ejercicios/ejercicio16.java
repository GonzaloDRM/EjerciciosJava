/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = sc.next();
        
        if (letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e") || 
                letra.toLowerCase().equals("i") || letra.toLowerCase().equals("o") || letra.toLowerCase().equals("u"))
            System.out.println("Es una vocal");
        else
            System.out.println("Es una consonante");
        
    }
    
}
