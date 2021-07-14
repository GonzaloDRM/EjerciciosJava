package Ejercicio3conArrayList;

import java.util.Scanner;

public class Servicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cantantes cant = new Cantantes();

    public void Agregar() {
        String cantante;
        String disco;
        String resp;
        do {
            System.out.println("Ingrese un cantante o grupo");
            cantante = sc.next();
            System.out.println("Ingrese su disco");
            disco = sc.next();
            cant.Agregar(cantante + ": " + disco);
            System.out.println("Desea seguir agregando? (S/N)");
            resp = sc.next();
        } while (!resp.toLowerCase().equals("n"));

    }
    
    public void Mostrar(){
        int p = 0;
        for (String i : cant.getCantantesyDiscos()) {
            
            System.out.println(p + " - "+ i); 
            p += 1;
        }
    }
    
    public void Menu(){
        int n, borr;
        String resp;
        do {
            System.out.println("Elija que opcion desea tomar");
            System.out.println("1 - Agregar");
            System.out.println("2 - Borrar");
            System.out.println("3 - Salir");
            n = sc.nextInt();
            switch (n){
                case 1: Agregar(); 
                    break;
                case 2: Mostrar();
                        System.out.println("Ingrese la posicion del artista que desea borrar");
                        borr = sc.nextInt();
                        cant.getCantantesyDiscos().remove(borr);
                        break;
                case 3: break;               
            }
            System.out.println("Desea volver al menu?(S/N)");
            resp = sc.next();
        }while(!resp.toLowerCase().equals("n"));
    }

}
