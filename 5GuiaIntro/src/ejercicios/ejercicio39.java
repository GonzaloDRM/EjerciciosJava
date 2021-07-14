/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[100];
        
        for (int i=0;i<=99;i++){
            vector[i]=i;
        }
        for (int i=99;i>=0;i--){
            System.out.println(vector[i]);
        }
    }
}
