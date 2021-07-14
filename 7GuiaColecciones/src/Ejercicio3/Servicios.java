
package Ejercicio3;

import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    CantanteFamoso obj = new CantanteFamoso();
    public void Rellenar(){
        String nom, disc;
        System.out.println("Ingrese el nombre del cantante y el disco con mas ventas");
        nom = sc.next();
        disc = sc.next();
        obj.AgregarDiscos(nom, disc);
        System.out.println(obj.getCantantes());        
    }
    
}
