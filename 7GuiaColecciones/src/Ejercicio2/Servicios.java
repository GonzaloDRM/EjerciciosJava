
package Ejercicio2;

import java.util.Iterator;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Objeto obj = new Objeto();
    
    public void AgregarValores(){
        Integer num;
        System.out.println("Ingrese todos los numeros que quiera y para terminar ingrese el numero -99");
        do {
            num = sc.nextInt();
            if (num!=-99){
                obj.agregarNumeros(num);
            }           
        }while(num!=-99);        
    }
    
    public void MostrarNumeros(){
        for (Integer i : obj.getNumeros()) {
            System.out.println(i);           
        }
    }
    
    public void Suma(){
        Integer suma = 0;
        Iterator <Integer> it = obj.getNumeros().iterator();
        
        while (it.hasNext()) {
            Integer s = (int) it.next();
            suma += s;
        }
        obj.setSuma(suma);
        
//        Este es el For Each!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        for (Integer i : obj.getNumeros()) {
//            suma=suma+i;
//        }
//        obj.setSuma(suma);
    }
    
    public void Promedio(){
        Integer prom = 0;
        for (Integer i : obj.getNumeros()) {
            prom = prom + i;
        }
        prom = prom / obj.getNumeros().size();
        obj.setProm(prom);  
    }
    
    public void MostrarResultados(){
        Suma();
        Promedio();
        Integer resp = 0;
        for (Integer i : obj.getNumeros()) {
            if (i>=obj.getProm()){
                resp = resp + 1;               
            }            
        }
        System.out.println("La suma es de " + obj.getSuma());
        System.out.println("El promedio es de " + obj.getProm());
        System.out.println("Hay " + resp + " mayores al promedio");       
    }
}
