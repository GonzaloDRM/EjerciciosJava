/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int vector1[] = new int[3];
        int vector2[] = new int[3];
        int suma;
        suma = 0;
        
        System.out.println("Rellene el primer vector con 3 numeros");
        
        for(int i=0;i<=2;i++) {
            vector1[i] = sc.nextInt();
        }
        
        System.out.println("Rellene el segundo vector con 3 numeros");
        
        for(int i=0;i<=2;i++) {
            vector2[i] = sc.nextInt();
        }
        
        for(int i=0;i<=2;i++){
            if (vector1[i]!=vector2[i]){
                System.out.println("El vector no es igual en el puesto " + i);
                break;
            }
            else {
                suma=suma+1;
            }
        }
        
        if (suma==3){
            System.out.println("Los vectores son iguales");
        }        
    }
}
