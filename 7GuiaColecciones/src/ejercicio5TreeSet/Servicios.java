
package ejercicio5TreeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");    
    Set<Libro> coleccionLibros = new TreeSet();
    
    public void Menu(){
        int resp = 0;
        do {
            System.out.println("Seleccione que desea hacer");
            System.out.println("1 - Ingresar un libro nuevo a la base de datos");
            System.out.println("2 - Retirar un libro");
            System.out.println("3 - Devolver un libro");
            System.out.println("4 - Mostrar todos los datos de los libros");
            System.out.println("5 - Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1: Agregar();
                    break;
                case 2: Sacar();
                    break;
                case 3: Devolver();
                    break;
                case 4: Imprimir();
                    break;
                case 5: break;
            }
        }while(resp != 5);    
    }
    
    public void Agregar(){
        Libro libros = new Libro();
        System.out.println("Ingrese el nombre del libro");
        libros.setNombre(sc.next());
        System.out.println("Ingrese el nombre del autor");
        libros.setAutor(sc.next());
        System.out.println("Ingrese la cantidad de ejemplares disponibles");
        libros.setEjemplaresDisponibles(sc.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares entregados");
        libros.setEjemplaresPrestados(sc.nextInt());
        libros.setEjemplaresTotales(libros.getEjemplaresDisponibles() + libros.getEjemplaresPrestados());
        
        coleccionLibros.add(libros);    
    }
    
    public void Sacar(){
        System.out.println("Seleccione el nombre del libro que desea retirar");
        Imprimir();
        int c = 0;
        String nom = sc.next();
        for (Libro i : coleccionLibros) {
            if (nom.equals(i.getNombre())){
                if(i.getEjemplaresDisponibles()<1){
                    System.err.println("No hay libros disponibles");
                    c = 1;
                }else {
                    i.setEjemplaresDisponibles(i.getEjemplaresDisponibles()-1);
                    i.setEjemplaresPrestados(i.getEjemplaresPrestados()+1);
                    c = 1;
                }                
            }
        } 
        if (c == 0){
            System.err.println("El libro ingresado no existe");
        }
    }
    
    public void Devolver(){
        System.out.println("Seleccione el nombre del libro que desea devolver");
        Imprimir();
        int c = 0;
        String nom = sc.next();
        for (Libro i : coleccionLibros) {
            if (nom.equals(i.getNombre())){
                if(i.getEjemplaresPrestados()<1){
                    System.err.println("No se presto este libro");
                    c = 1;
                }else {
                    i.setEjemplaresDisponibles(i.getEjemplaresDisponibles()+1);
                    i.setEjemplaresPrestados(i.getEjemplaresPrestados()-1);
                    c = 1;
                }                
            }
        } 
        if (c == 0){
            System.err.println("El libro ingresado no existe");
        }
    }
    
    public void Imprimir(){
        Iterator <Libro> it = coleccionLibros.iterator();
        
        while (it.hasNext()) {
            Libro l = it.next();
            System.out.println(l);
        }
    }   
}
