/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada
familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las
familias.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int M,N,suma;
        
        System.out.println("Ingrese la cantidad de familias");
        M = sc.nextInt();
        suma=0;
        
        for (int i=1;i<=M;i++){
            System.out.println("Ingrese la eda de cada hijo de la cada familia " + i);
            N = sc.nextInt();
            
            suma=suma+N;
        }
        
        System.out.println("La edad promedio de los hijos de todas las familias es"
                + " de " + suma/M);
    }
}
