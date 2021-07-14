/*
Realizar un programa que pida introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int largo;
        System.out.println("Escribir una palabra de 8 letras de largo");
        palabra = sc.next();
        
        if (palabra.length()==8)
            System.out.println("Correcto, la palabra fue " + palabra.length());
        else
            System.out.println("Incorrecto");
        
    }

}
