/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5).
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double grados;
        System.out.println("Escriba los grados centigrados a transformar");
        grados = sc.nextDouble();
        
        System.out.println(32+((9*grados)/5));
        
    }
    
}
