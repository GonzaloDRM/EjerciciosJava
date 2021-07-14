/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num,resp,suma;
        System.out.println("Ingrese un numero para determinar si es primo o no");
        num = sc.nextInt();
        suma = 0;
        
        for (int i=1;i<=num;i++){
            
            resp=(num%i);
            
            if (resp==0){
                suma=(suma+1);
            }
        }
        
        if (suma<=3){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        } 
    }
}
