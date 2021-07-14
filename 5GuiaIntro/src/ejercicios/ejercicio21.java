/*
 Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double alt, suma, prom,men;
        int cant,cantmen;
        System.out.println("Ingrese la cantidad de personas");
        cant = sc.nextInt();
        suma = 0;
        men=0;
        cantmen=0;
        
        for (int i=1;i<=cant;i++) {
            System.out.println("Ingrese altura");
            alt = sc.nextDouble();
            suma = suma + alt;
            if (alt<=1.6){
                men=men+alt;
                cantmen=cantmen+1;
            }
        }
            
        prom = suma/cant;
        System.out.println("El promedio de personas menores a 1.6 es de " + (men/cantmen));
        System.out.println("El promedio de todas las personas es de " + prom);
        
    }
    
}
