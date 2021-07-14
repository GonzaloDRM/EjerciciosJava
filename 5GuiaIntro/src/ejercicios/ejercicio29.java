/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num, resp;
        
        System.out.println("Ingrese un numero entero para determinar su largo");
        num=sc.nextInt();
        resp=1;
        
        while (num>9) {
            num=num/10;
            resp=resp+1;
        }
        
        System.out.println("El largo es de " + resp);
    }

}
