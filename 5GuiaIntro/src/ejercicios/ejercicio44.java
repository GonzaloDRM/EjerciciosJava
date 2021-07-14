/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int vector[] = new int[5];
        
        for(int i=0;i<=4;i++){
            vector[i] =(int) (Math.random()*10);
        }
        
        for(int i=0;i<=4;i++){
            System.out.println(vector[i]);
        } 
    }
}
