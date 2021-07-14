/*
Diseñe una función que pida el nombre y la edad de n personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de
edad. El método debe preguntarle al usuario si quiere seguir mostrando personas y
frenar cuando el usuario ingrese la palabra “No”.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String nom,resp;
        int edad;
        
        do {
            System.out.println("Ingrese nombre");
            nom = sc.next();
            System.out.println("Ingrese edad");
            edad = sc.nextInt();
            if (edad>=18){
                System.out.println(nom + " es mayor de edad");
            }
            else if (edad<=0){
                System.out.println("Ingrese una edad valida");
            }
            else {
                System.out.println(nom + " es menor de edad");
            }
            System.out.println("Desea seguir ingresando datos?");
            resp = sc.next();
        } while (!resp.toLowerCase().equals("no"));
        System.out.println("Finalizado");
    }
}