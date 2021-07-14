/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num, tot, total, par, impar;
        par=0;
        impar=0;
        total=0;
        tot=1;
        
        System.out.println("Ingrese numeros hasta finalizar con un multiplo de 5");
        
        do {
            num = sc.nextInt();
            total=total+1; 
            
            if (num>=0) {
                if (num%5==0) {
                    break;
                }
                else {
                    if (num%2==0){
                    par=par+1;
                }
                    else if (num%2==1){
                    impar=impar+1;
                }
                }
                
            }
            
        } while (tot!=0);
        
        System.out.println("Fueron ingresados " + total + " numeros en total, " + par + " pares, " + impar + " impares");
        
    }
    
}
