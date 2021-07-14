/*
 Crear un programa que dado un numero determine si es par o impar.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escribe un numero para determinar si es par o impar");
        num = sc.nextInt();
        
        if ((num%2)!=0) 
            System.out.println("El numero es impar");
        else 
            System.out.println("El numero es par");
        
    }
}
