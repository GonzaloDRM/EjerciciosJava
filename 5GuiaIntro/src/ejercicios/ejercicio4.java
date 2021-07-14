/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/

package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una frase");
        frase = sc.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
    }
    
}
