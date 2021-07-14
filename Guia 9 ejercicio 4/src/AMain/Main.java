/*
Defina una clase llamada DivisionNumero. En el método main utilice el método
nextLine() para leer dos números en forma de cadena. A continuación, utilice el
método parseInt() para convertir las cadenas al tipo int y guardarlas en dos
variables de tipo int (numero1 y numero2). Divida numero1 por numero2 y muestre
el resultado. El ingreso por teclado puede causar una excepción de
tipo InputMismatchException. Recordá que el método Integer.parseInt()
convierte números de tipo String a int. Si la cadena no puede
convertirse a entero, arroja una NumberFormatException. Además, al
dividir un número por cero surge una ArithmeticException. Manipule las
posibles excepciones utilizando un bloque de región segura try-catch.
*/

package AMain;

import java.util.Scanner;
import otro.DivisionNumero;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero div = new DivisionNumero();        
        String num1, num2;
        
        num1 = sc.nextLine();
        num2 = sc.nextLine();
        div.pasar(num1, num2);
        
    }

}
