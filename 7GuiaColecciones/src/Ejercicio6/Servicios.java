package Ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Servicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Map<String, Double> Producto = new HashMap();

    public void Menu() {
        int elegir = 0;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1 - Agregar un producto");
            System.out.println("2 - Modificar precio");
            System.out.println("3 - Eliminar un producto");
            System.out.println("4 - Mostrar lista de productos");
            System.out.println("5 - Salir");
            elegir = sc.nextInt();
            switch(elegir){
                case 1: Agregar();
                    break;
                case 2: Modificar();
                    break;
                case 3: Eliminar();
                    break;
                case 4: Mostrar();
                    break;
                case 5: break;
            }
        } while (elegir != 5);
    }
    
    public void Agregar(){
        String producto;
        double precio;
        System.out.println("Nombre del producto");
        producto = sc.next();
        System.out.println("Precio del producto");
        precio = sc.nextDouble();        
        Producto.put(producto, precio);       
    }
    
    public void Eliminar(){
        String mod;
        System.out.println("Escriba que producto desea eliminar");
        Mostrar();
        mod =  sc.next();
        Producto.remove(mod);
    }
    
    public void Mostrar(){
        Iterator<HashMap.Entry<String, Double>> it = Producto.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<String, Double> Producto = it.next();
            System.out.println(Producto.getKey() + " - " + Producto.getValue());
        }
        
    }
    
    public void Modificar(){    
        String mod;
        System.out.println("Que producto desea modificar?");
        mod = sc.next();
        for (String i : Producto.keySet()) {           
            if(mod.equals(i)){
                System.out.println("Ingrese el nuevo precio");
                Producto.put(i, sc.nextDouble());
            }
        }
//          Para recorrer el valor del mapa
        
//        for (Double i : Producto.values()) {
           
//        }
        
    }
    
    
    
}
