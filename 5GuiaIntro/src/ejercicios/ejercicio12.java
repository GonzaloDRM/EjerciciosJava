/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase o palabra");
        palabra = sc.next();
        
        if (palabra.toLowerCase().equals("eureka"))
            System.out.println("Correcto");
        else 
            System.out.println("Incorrecto");
        
        
    }
    
}
