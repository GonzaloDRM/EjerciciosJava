/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de la
escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Ingrese la cantidad de escalones");
        num = sc.nextInt();
        
        for (int i=1;i<=num;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
