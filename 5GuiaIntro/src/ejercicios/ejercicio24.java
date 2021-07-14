/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num, suma, i;
        System.out.println("Ingrese numeros, como maximo 20 o hasta que "
                + "ingrese el numero 0, se sumaran solo los numeros positivos");
        suma=0;
        i=1;
        
        do {
            num = sc.nextInt();
            i=i+1;
            
            if (num>0){
                suma=suma+num;
            }
            else if (num==0) {
                break;
            }
                
        } while (i<=20 || num!=0);
        
        System.out.println("La suma total es de " + suma);
        
    }
    
}
