/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio22While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int cant, i, num, max, min, suma;
        System.out.println("Ingrese la cantidad de numeros que pondrá");
        cant = sc.nextInt();
        i=0;
        min=0;
        max=0;
        suma=0;
        
        do {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            suma=suma+num;
            i=i+1;
            if (i==1){
                min=num;
            }
            if (num>max)
                max=num;
            else if (num<min)
                min=num;
        } while (i!=cant);
        
        System.out.println("El maximo es " + max + " el min es " + min
        + " el promedio es " + suma/cant);
    }
    
}
