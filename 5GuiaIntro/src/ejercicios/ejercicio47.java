/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int matriz[][] = new int[4][4];
        int suma;
        suma = 0;
        
        for(int i=0;i<=3;i++){
            for(int k=0;k<=3;k++){
                matriz[i][k] = (int) (Math.random()*100);
                suma = suma + matriz[i][k];
            }            
        }
        
        System.out.println("La suma total es de " + suma);   
    }
}
