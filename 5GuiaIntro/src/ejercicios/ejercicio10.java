/*
 Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, nume;
        System.out.println("Escribe dos numeros");
        num = sc.nextInt();
        nume = sc.nextInt();
        
        if (num<nume) 
            System.out.println("el numero mayor es " + nume);
        
        else if (num==nume) 
            System.out.println("Los numero son iguales");
        
        else
            System.out.println("El numero mayor es " + num);
        
    }
    
}
