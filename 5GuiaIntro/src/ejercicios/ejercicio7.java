/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Ingrese un numero");
        num = sc.nextDouble();
        System.out.println("El doble es " + num*2);
        System.out.println("El triple es " + num*3);
        System.out.println("La raiz cuadrada es " + Math.sqrt(num));
        
    }
    
}
