/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada
familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las
familias.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio33bienhecho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int M,N,suma,hijo,sumaf;
        
        System.out.println("Ingrese la cantidad de familias");
        M = sc.nextInt();
        suma=0;
        sumaf=0;
        
        for (int i=1;i<=M;i++){
            System.out.println("Ingrese la cantidad de hijos de la familia " + i);
            N = sc.nextInt();
            System.out.println("Ingrese las edades de los hijos de la familia " + i);
            for (int k=1;k<=N;k++){
                hijo=sc.nextInt();
                suma=suma+hijo;
            }
            sumaf=sumaf+N;            
        }
        
        System.out.println("El promedio de edad de los hijos de todas las familias es de " + (suma/sumaf));

    }

}
