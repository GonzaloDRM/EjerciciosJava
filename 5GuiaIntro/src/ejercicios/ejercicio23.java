/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num1, num2, resp;
        String respl = null;
        System.out.println("Ingrese dos numeros enteros positivos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        do {
            System.out.println("Que desea hacer?");
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir"); 
            
            resp = sc.nextInt();
            
            switch (resp){
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num1/num2);
                    break;
                case 5:
                    System.out.println("Seguro que desea salir (s/n)");
                    respl=sc.next();
                        if ("s".equals(respl)){
                            break;
                        }
                        else if ("n".equals(respl)){
                        resp=0;
                        System.out.println("continuemos");
                    }
            }
        } while ("n".equals(respl));
    }  
}
