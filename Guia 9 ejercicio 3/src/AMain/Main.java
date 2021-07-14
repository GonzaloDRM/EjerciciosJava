/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
*/

package AMain;

import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num = (int)(Math.random()*500);
        int resp = 0;
        int cant = 0;
        System.out.println(num);
        
        System.out.println("Adivina el numero entre 1 y 500");
        
        do{
            System.out.println("Ingrese un numero");
            resp = ret(resp, cant);
            if(resp == num){
                cant += 1;
                System.out.println("Adivinaste! ingresaste " + cant + " numeros!");
            }else if(resp < num){
                System.out.println("El numero es mayor");
                cant += 1;
            }else if(resp > num){
                System.out.println("El numero es menor");
                cant += 1;
            }
        }while(num != resp);
          
    }
    
    public static int ret(int resp, int cant){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        try {
            cant += 1;
            resp = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Ingrese un numero y no una letra... boludo...");
        } 
        return resp;
    }

}
