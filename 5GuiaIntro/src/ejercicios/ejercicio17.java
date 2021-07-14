/*
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos odontológicos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String clase;
        int costo;
        System.out.println("Escribir que clase de socio es (A, B o C)");
        clase = sc.next();
        System.out.println("Ingrese el costo total del tratamiento");
        costo = sc.nextInt();
        
        switch (clase.toUpperCase()){
            case "A":
                System.out.println("Debera abonar " + costo/2);
                break;
            case "B":
                System.out.println("Debera abonar " + costo*0.65);
                break;    
            case "C":
                System.out.println("Debera abonar " + costo);
                break;    
                
        }
        
    }
    
}
