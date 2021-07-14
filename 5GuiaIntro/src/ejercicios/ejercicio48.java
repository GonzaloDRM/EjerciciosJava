/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int matriz[][] = new int[3][3];
        int sum,suma;
        sum=0;
        suma=0;
        
        for (int i=0;i<=2;i++) {
            for(int k=0;k<=2;k++){
                matriz[i][k] = (int)(Math.random()*100);
            }
        }
        for (int i=0;i<=2;i++) {
            for(int k=0;k<=2;k++){
                if (matriz[i][k]==matriz[k][i]){
                    suma=suma+1;
                }
            }
        }
        
        if (suma==9){
            System.out.println("Es simetrica");
        }
        else {
            System.out.println("Es anti simetrica");
        }       
    }
}
