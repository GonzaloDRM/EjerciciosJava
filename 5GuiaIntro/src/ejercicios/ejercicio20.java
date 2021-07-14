/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int limit,num,suma;
        System.out.println("Ingrese un numero limite");
        limit = sc.nextInt();
        suma=0;
        
        System.out.println("Ingrese un numero hasta llegar a " + limit);
        num = sc.nextInt();
        suma=suma+num;
        
        while (suma<limit){
            
            num = sc.nextInt();
            suma=suma+num;
            
        }

    System.out.println("La suma total fue de " + suma + " y el limite era de " + limit);
        
    }
    
}
