/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función contains() y replace() de Java
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num1,num2,num3,k,l;
        num1=0;
        num2=0;
        num3=0;
        k=0;
        l=0;
        
        for (int i=0;i<=9;i++){
            k=0;
            for (k=0;k<=9;k++){
                l=0;
                for (l=0;l<=9;l++){
                    if (i==3){
                        System.out.println("E" + "-" + k + "-" + l);
                    }
                    else if (k==3){
                        System.out.println(i + "-" + "E" + "-" + l);
                    }
                    else if (l==3){
                        System.out.println(i + "-" + k + "-" + "E");
                    } 
                    else {
                        System.out.println(i + "-" + k + "-" + l);
                    }
                }
            }
        }
    }
}
