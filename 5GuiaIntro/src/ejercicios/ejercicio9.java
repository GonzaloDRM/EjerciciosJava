/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable
auxiliar.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        short A, B, C, D, E;
        System.out.println("Escribir 4 enteros");
        A = sc.nextShort();
        B = sc.nextShort();
        C = sc.nextShort();
        D = sc.nextShort();
        
        System.out.println("A=" + A + ",B=" + B + ",C=" + C + ",D=" + D);
        
        E=B;
        B=C;
        C=A;
        A=D;
        D=E;
        
        System.out.println("A=" + A + ",B=" + B + ",C=" + C + ",D=" + D);
        
    }
    
}
