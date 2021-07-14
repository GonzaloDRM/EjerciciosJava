/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num1, num2;
        String resp;
        System.out.println("Ingrese dos numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("Escriba que desea hacer. (S-sumar,R-restar-M-multiplicar-D-dividir)");
        resp = sc.next();
       
        switch (resp.toUpperCase()){
            case "S":System.out.println("La suma es " + (num1 + num2));
                break;
            case "R":System.out.println("La resta es " + (num1 - num2));
                break;
            case "M":System.out.println("La multiplicacion es " + (num1 * num2));
                break;
            case "D":System.out.println("La division es " + (num1 / num2));
                break;
    }
    }
}
