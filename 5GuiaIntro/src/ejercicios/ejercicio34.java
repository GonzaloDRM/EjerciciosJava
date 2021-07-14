/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Escriba un numero y para terminar escriba 21");
        num = sc.nextInt();
        
        while (num!=21){
            if (num>=1 || num<=20){
                System.out.print(num);
                for (int i=1;i<=num;i++){
                    System.out.print("*");
                }
            }
            else if (num==21){
                break;
            }
            else {
                System.out.println("El numero tiene que ser entre 1 y 20");
            } 
            System.out.println("");
            num = sc.nextInt();
        }
        System.out.println("Finalizado");  
    }

}
