package Ejercicio7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Servicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Map<Integer, String> Ciudades = new HashMap();

    public void Ingresar() {
        String ciudad;
        int codigo;
        System.out.println("Ingrese su codigo postal");
        codigo = sc.nextInt();
        System.out.println("Ingrese una ciudad");
        ciudad = sc.next();
        Ciudades.put(codigo, ciudad);
    }

    public void Menu() {
        int resp = 0;
        do {
            System.out.println("Seleccione que opcion desea realizar");
            System.out.println("1 - Agregar 1 Ciudad con su codigo postal");
            System.out.println("2 - Imprimir todos los datos ingresados");
            System.out.println("3 - Ingresar un codigo postal y mostrar su ciudad y modificar el codigo");
            System.out.println("4 - Eliminar una ciudad con su codigo");
            System.out.println("5 - Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1: Ingresar();
                    break;
                case 2: Mostrar();
                    break;
                case 3: Buscar();
                    break;
                case 4: Eliminar();
                    break;
                case 5: break;
            }
        } while (resp != 5);

    }

    public void Mostrar() {
        Iterator<HashMap.Entry<Integer, String>> it = Ciudades.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> Ciudades = it.next();
            System.out.println(Ciudades.getKey() + " - " + Ciudades.getValue());
        }
    }
    
    public void Buscar(){
        int r;
        String acum;
        System.out.println("Ingrese el codigo posta de la ciudad que quiere cambiar");
        r = sc.nextInt();        
        System.out.println(Ciudades.get(r));
        acum = Ciudades.get(r);
        Ciudades.remove(r);
        System.out.println("Ingrese la nueva key");
        r = sc.nextInt();
        Ciudades.put(r, acum);  
    }
    
    public void Eliminar(){
        int r;
        System.out.println("Ingrese el codigo postal de la ciudad que desea borrar");
        r = sc.nextInt();
        Ciudades.remove(r);
    }
}
