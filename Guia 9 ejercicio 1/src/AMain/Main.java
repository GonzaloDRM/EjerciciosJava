/*
 Inicializar un objeto de la clase Persona ejercicio 14 a null y tratar de invocar el
 método esMayorDeEdad() a través de esta referencia. Luego, englobe el código
 con una cláusula try-catch para probar la nueva excepción que debe ser
 controlada.
 */
package AMain;

import Objetos.Persona;
import Servicios.Servicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Persona persona1 = new Persona();

        try {
            System.out.println("Ingrese su nombre");
            persona1.setNombre(sc.next());     
              
        } catch (Exception e) {
            
        }
        
        try {
            System.out.println("Ingrese su edad");
            persona1.setEdad(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        
        try {
            System.out.println("Ingrese su sexo(M/F)");
            persona1.setSexo(sc.next());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        
        try {
            System.out.println("Ingrese su peso");
            persona1.setPeso(sc.nextDouble());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        
        try {
            System.out.println("Ingrese su altura");
            persona1.setAltura(sc.nextDouble());             
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        
        System.out.println("");
        
        System.out.println(persona1.toString());
        Servicio.esMayorDeEdad(persona1);
        Servicio.CalcularIMC(persona1);
        
    }

}
