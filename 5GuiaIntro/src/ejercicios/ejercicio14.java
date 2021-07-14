/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase,letra;
        System.out.println("Ingrese una frase que comiense con a");
        frase = sc.next();
        letra = frase.substring(0,1);
        
        
        if (!letra.toLowerCase().equals("a"))
            System.out.println("Incorrecto");
        else
            System.out.println("Correcto");
            
    }
    
}
