/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num1,num2,suma;
        
        System.out.println("Ingrese de que tamaño quiere que sea el vector");
        num1 = sc.nextInt();
        int[] vector = new int[num1];
        System.out.println("Rellene el vector");
        suma=0;
        
        for (int i=0;i<=num1-1;i++){
            vector[i]=sc.nextInt();
            suma=suma+vector[i];
        }
        
        System.out.println("La suma total del vector es de " + suma);
    }
}
