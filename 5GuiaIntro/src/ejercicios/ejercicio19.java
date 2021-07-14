/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int nota;
        System.out.println("Ingrese una nota entre 0 y 10");
        nota = sc.nextInt();
        
        if (nota>=0 && nota<=10) {
            
        }
        else {
            while (nota>=10 || nota<=0) {
                System.out.println("La nota tiene que ser entre 0 y 10");
                nota = sc.nextInt();
            }
        }

        System.out.println("Correcto, la nota es " + nota);
    }
    
}
