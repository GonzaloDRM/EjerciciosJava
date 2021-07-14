/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
 tipo de dispositivo lee caracteres enviados por un sensor. Las lecturas se realizan
 de a 5 caracteres (buffer) por vez, los cuales deben llegar con un formato fijo: el
 primer carácter tiene que ser X y el último tiene que ser 0.
 Las secuencias leídas que respeten el formato se consideran correctas, la
 secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
 secuencia distinta de FDE que no sea correcta se considera inválida. Al finalizar el
 proceso, se imprime un informe indicando la cantidad de lecturas correctas e
 inválidas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
 siguientes funciones de Java Substring() y Length().
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String carac, prim, ult;
        int largo;
        System.out.println("Escribe 5 caracteres seguidos y para finalizar escribe &&&&&");

        do {
            carac = sc.next();
            largo = carac.length();

            if (largo == 5) {
                prim = carac.substring(0, 1);
                ult = carac.substring(4, 5);
                System.out.println(ult);
                if ("x".equals(prim.toLowerCase()) && "0".equals(ult)) {
                    System.out.println("Correcto");
                } else {
                    System.out.println("Incorrecto");
                }
            } else {
                System.out.println("solo se permite 5 cifras");
            }
        } while (!"&&&&&".equals(carac));
    }
}

