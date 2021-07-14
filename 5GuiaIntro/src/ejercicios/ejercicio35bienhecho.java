/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio35bienhecho {
    private static int suma;
    private static int resta;
    private static int multiplicacion;
    private static int division;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int suma;
//        int restar;
//        int multiplicar;
//        int dividir;
        int num1,num2;
        String resp;
        System.out.println("Ingrese dos numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("Escriba que desea hacer. (S-sumar,R-restar-M-multiplicar-D-dividir)");
        resp = sc.next();
        
        
        switch (resp.toUpperCase()){
            case "S":System.out.println("La suma es " + sumar(num1,num2));
                break;
            case "R":System.out.println("La resta es " + restar(num1,num2));
                break;
            case "M":System.out.println("La multiplicacion es " + multiplicar(num1,num2));
                break;
            case "D":System.out.println("La division es " + dividir(num1,num2));
                break;                      
        }
        
    }
    public static int sumar (int num1, int num2) {
        suma = num1 + num2;
        return suma;
    }
    public static int restar (int num1, int num2) {
        resta = num1 - num2;
        return resta;   
    }
    public static int multiplicar (int num1, int num2) {
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public static int dividir (int num1, int num2) {
        division = num1 / num2;
        return division;
    }
    
    

}
