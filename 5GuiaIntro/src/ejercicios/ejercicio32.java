/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Ingrese el tamaño del cuadrado");
        num = sc.nextInt();
        
        for (int i=0;i<=num-1;i++){
            System.out.print("*");
            for (int k=1;k<=num-2;k++){
                if (i==0 || i==num-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        } 
    }
}
