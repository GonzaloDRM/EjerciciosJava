/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num, num1, num2, resp;
        
        num1=(int)(Math.random()*10);
        num2=(int)(Math.random()*10);
        
        num=num1*num2;
        
        System.out.println("Adivine que numero dio entre las dos multiplicaciones");
        resp = sc.nextInt();
        
        while (resp!=num){
            System.out.println("Incorrecto, ingrese nuevamente el numero");
            resp = sc.nextInt();
        }
        
        System.out.println("Correcto! el numero era " + num);
        
    }

}
