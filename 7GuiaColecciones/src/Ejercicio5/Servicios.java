package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Libro> listaLibros = new ArrayList();
    
    public void Menu() {
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
                case 5:
                    break;
            }
        } while (resp != 5);
    }

    private void Agregar() {
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
        listaLibros.add(libros);
    }

    private void Sacar() {
        int sacar = 0;
        int num = 0;
        System.out.println("Seleccione que libro desea retirar");
        for (Libro i : listaLibros) {
            System.out.println(num + " - " + i.toString());
            num += 1;
        }
        sacar = sc.nextInt();
        if(listaLibros.get(sacar).getEjemplaresDisponibles()<1){
            System.out.println("No quedan libros disponibles");
        } else {            
            listaLibros.get(sacar).setEjemplaresDisponibles(listaLibros.get(sacar).getEjemplaresDisponibles() - 1);
            listaLibros.get(sacar).setEjemplaresPrestados(listaLibros.get(sacar).getEjemplaresPrestados() + 1);
        }       
    }

    private void Devolver() {
        int devolver = 0;
        int num = 0;
        System.out.println("Seleccione que libro desea devolver");
        for (Libro i : listaLibros) {
            System.out.println(num + " - " + i.toString());
            num += 1;
        }
        devolver = sc.nextInt();
        if (listaLibros.get(devolver).getEjemplaresPrestados()<1){
            System.err.println("Ya estan devueltos todos los libros");
        } else{
            listaLibros.get(devolver).setEjemplaresDisponibles(listaLibros.get(devolver).getEjemplaresDisponibles() + 1);
            listaLibros.get(devolver).setEjemplaresPrestados(listaLibros.get(devolver).getEjemplaresPrestados() - 1);
        }        
    }

    private void Imprimir() {
        int num = 0;
        for (Libro i : listaLibros) {
            System.out.println(num + " - " + i.toString());
            num += 1;
        }
    }
}
