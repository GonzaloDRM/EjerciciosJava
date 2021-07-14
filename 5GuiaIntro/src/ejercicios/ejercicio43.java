/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int vector[] = new int[5];
        int num;
        
        for (int i=0;i<=4;i++){
            vector[i] = (int) (Math.random()*10);
        }
        
        System.out.println("que numero desea buscar en el vector");
        num = sc.nextInt();
        
        for (int i=0;i<=4;i++){
            if (num==vector[i]){
                System.out.println("Se encuenta en la posicion " + i);
            }                
        }        
    }
}
