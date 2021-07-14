/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int matriz[][] = new int[4][4];
        
        for(int i=0;i<=3;i++){
            for(int k=0;k<=3;k++){
                matriz[i][k] = (int) (Math.random()*100);
            }            
        }
        
        for(int i=0;i<=3;i++){
            for(int k=0;k<=3;k++){
                System.out.print(matriz[i][k] + ", ");
            }  
            System.out.println("");
        }       
    }
}
