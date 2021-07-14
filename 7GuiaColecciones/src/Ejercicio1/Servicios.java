
package Ejercicio1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Palabra pal = new Palabra();
    
    public void Agregar(){        
        String palabraUsuario;
        System.out.println("Ingrese las palabras que quiera y para salir escriba exit");       
        do {
           palabraUsuario = sc.next();
           pal.AgregarPalabra(palabraUsuario);
        }while(!palabraUsuario.equals("exit"));               
    }
    
    public void Mostrar(){        
        for (String obj : pal.getPalabras()) {
            System.out.println(obj);
        }       
    }
    
    public void Ordenar(){
        Collections.sort(pal.getPalabras());       
    }
    
    public void Completo(){
        for (String obj : pal.getPalabras()) {
            System.out.println(obj + ", " + obj.length());
        }
    }
   
}
