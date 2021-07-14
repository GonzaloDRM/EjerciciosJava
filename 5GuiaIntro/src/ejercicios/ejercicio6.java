/*
Dada las horas trabajadas de una persona y el valor por hora. Calcular su salario e
imprimirlo. Salario = Hs. trabajadas * valor por hora
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio6 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        short horas;
        System.out.println("ingrese las horas trabajadas(el valor por hora es de 100)");
        horas = sc.nextShort();
        System.out.println("El salario de este dia es de " + horas*100);
        
        
    }
    
}
