
package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ServiciosCompletar {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public List<Persona> llenarCliente(List<Persona> todos){
        String resp;
        do{
            Persona cliente = new Persona();
            System.out.println("Ingrese el nombre de la persona");
            cliente.setNombre(sc.next());
            System.out.println("Ingrese la edad de la persona");
            cliente.setEdad(sc.nextInt());
            System.out.println("Ingrese cuanto dinero tiene");
            cliente.setDinero(sc.nextInt());
            todos.add(cliente);
            System.out.println("Desea seguir agregando clientes? (S/N)");
            resp = sc.next();
        }while(!resp.toUpperCase().equals("N"));
        return todos;
    }
    
    public Pelicula competarPeli(Pelicula pel){
        System.out.println("Ingrese el nombre de la pelicula");
        pel.setTitulo(sc.next());
        System.out.println("Ingrese el nombre del director");
        pel.setDirector(sc.next());
        System.out.println("Ingrese la duracion de la pelicula");
        pel.setDuracion(sc.nextDouble());
        System.out.println("Ingrese la edad minima permitida");
        pel.setEdadmin(sc.nextInt()); 
        return pel;
    }
        
    public Cine completarCine(Cine cine, Pelicula pel){
        cine.setPeli(pel);
        System.out.println("Ingrese el precio de la pelicula");
        cine.setPrecio(sc.nextInt());
        return cine;
    }
    
    public void automatico(){        
        Map<String, Persona> entrada = new HashMap();
        System.out.println("Cuantas personas desea crear?");
        int cant = sc.nextInt();
        int random;
        
        for (int i = 0; i < cant; i++) {
            Persona per = new Persona();
            random = (int)((Math.random()*8)+(1));
            switch(random){
                case 1: per.setNombre("Sentiago Alzasoquetes");
                    break;
                case 2: per.setNombre("Angeles Soria");
                    break;
                case 3: per.setNombre("Esteban Quito");
                    break;
                case 4: per.setNombre("Susana Horia");
                    break;
                case 5: per.setNombre("Aitor Tilla");  
                    break;
                case 6: per.setNombre("Andrés Trozado");  
                    break;
                case 7: per.setNombre("Dolores Delano");  
                    break;
                case 8: per.setNombre("Lola Mento");  
                    break;
                case 9: per.setNombre("Zacarias Flores del Campo");  
                    break;
                  
            }           
            per.setEdad((int)((Math.random()*65)+(18)));
            per.setDinero((int)((Math.random()*1000)));
            int rand = (int)((Math.random()*8)+(1));
            switch(random){
                case 1: entrada.put("A" + rand, per);
                    break;
                case 2: entrada.put("B" + rand, per);
                    break;
                case 3: entrada.put("C" + rand, per);
                    break;
                case 4: entrada.put("D" + rand, per);
                    break;
                case 5: entrada.put("E" + rand, per);
                    break;
                case 6: entrada.put("F" + rand, per);
                    break;
                case 7: entrada.put("G" + rand, per);
                    break;
                case 8: entrada.put("H" + rand, per);
                    break;
                case 9: entrada.put("I" + rand, per);
                    break;               
            }            
        }
        Iterator<HashMap.Entry<String, Persona>> it = entrada.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<String, Persona> Producto = it.next();
            System.out.println(Producto.getKey() + " - " + Producto.getValue().toString());
        } 
    }   
}
