
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");   
    List<Electrodomestico> todos = new ArrayList();
    
    public void menu(){        
        int resp;
        do{
            System.out.println("Elija una opcion");
            System.out.println("1 - Agregar una lavadora");
            System.out.println("2 - Agregar un televisor");
            System.out.println("3 - Mostrar todos los articulos");
            System.out.println("4 - Mostrar la suma de los televisores y las lavadoras por separado");
            System.out.println("5 - Mostrar la suma total de todos los electrodomesticos");
            System.out.println("9 - Salir ");
            resp = sc.nextInt();
            switch(resp){
                case 1: lava();
                    break;
                case 2: tele();
                    break;
                case 3: Imprimir(); 
                    break;
                case 4: sumaTv();
                    break;
                case 5: sumarTodo();
                    break;
            }
        }while(resp != 9);
    }
    
    public void lava(){
        Lavadora lav = new Lavadora();
        
        System.out.println("Ingrese el color"); 
        lav.setColor(sc.next());
        System.out.println("Ingrese consumo");
        lav.setConsum(sc.next());
        System.out.println("Ingrese peso");
        lav.setPeso(sc.nextInt());
        System.out.println("Ingrese carga");
        lav.setCarga(sc.nextInt());
        lav.setPrecioFinal(lav.lavFinal());
        
        todos.add(lav);
    }
    
    public void tele(){
        Televisor tv = new Televisor();
        String resp;
        
        System.out.println("Ingrese el color");
        tv.setColor(sc.next());
        System.out.println("Ingrese el consumo (A,B,C,D,E,F)");
        tv.setConsum(sc.next());
        System.out.println("Ingrese su peso");
        tv.setPeso(sc.nextInt());
        System.out.println("Ingrese las pulgadas");
        tv.setPulgadas(sc.nextInt());
        System.out.println("Tinen sintonizador? (S/N)");
        resp=sc.next();
        if(resp.toUpperCase().equals("S")){
            tv.setSintonizador(true);
        }else{
            tv.setSintonizador(false);
        }
        tv.setPrecioFinal(tv.precioFinal());
        
        todos.add(tv);
    }
    
    public void Imprimir(){
        for (Electrodomestico i : todos) {
            System.out.println(i.toString());
        }
    }
    
    public void sumarTodo(){
        int tod = 0;
        for (int i = 0; i < todos.size(); i++) {
            tod += todos.get(i).getPrecioFinal();
        }
        System.out.println(tod);
    }
    
    public void sumaTv(){
        int sumatv = 0, sumalav = 0;
        for (Electrodomestico i : todos) {
            if(i instanceof Televisor){
                sumatv += i.getPrecioFinal();
            }else{
                sumalav += i.getPrecioFinal();
            }
        } 
        System.out.println("La suma de todos los televisores es de " + sumatv);
        System.out.println("La suma de todos las lavadoras es de " + sumalav);
    }
    
//    public void sumaLava(){
//        
//        if (electrodomesticos[i] instanceof Lavadora) {
//            Lavadora l=(Lavadora)(electrodomesticos[i]);
//            precioLavadoras+=l.precioFinal();
//        }else{
//            Televisor t = (Televisor)(electrodomesticos[i]);
//            precioTelevisores+=t.precioFinal();
//        } 
//        
//    }
    
}
