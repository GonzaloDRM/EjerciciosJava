
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Alumnos> CursoProgramacion = new ArrayList<>();
          
    public void Crear(){
        int a = 0;
        Alumnos alumno1 = new Alumnos();
        System.out.println("Ingrese Nombre y Apeliido de un alumno");
        alumno1.setNombre(sc.next());
        System.out.println("Ingrese el numero de legajo");
        alumno1.setLegajo(sc.nextInt());
        System.out.println("Ingrese sexo H/M");
        do {
            alumno1.setSexo(sc.next().toLowerCase());
            if (alumno1.getSexo().equals("h")){
                a=1;
            }else if (alumno1.getSexo().equals("m")){
                a=1;
            }           
        }while(a==0);       
        System.out.println("Ingrese nota final");        
        do {
            alumno1.setNota(sc.nextInt());
        }while(alumno1.getNota()>10 || alumno1.getNota()<1);
        System.out.println("Ingrese Condicion");
        alumno1.setCondicion(sc.next());
        
        CursoProgramacion.add(alumno1);       
    }
    
    public void Mostrar(){
        for (Alumnos i : CursoProgramacion) {
            System.out.println(i.getNombre());
        }          
    }
    
    public void Aprobados(){
        System.out.println("Aprobados");
        for (Alumnos i : CursoProgramacion) {            
            if (i.getNota()>=7){
                System.out.println(i.getNombre() + " Nota: " + i.getNota());
            }
        }   
    }
    
    public void OrdenarA(){
        Collections.sort(CursoProgramacion, OrdenarNomb);
    }
    
    public void OrdenarMayor(){
        Collections.sort(CursoProgramacion, OrdenarNotaMayor);
    }
    
    public void OrdenarMenor(){
        Collections.sort(CursoProgramacion, OrdenarNotaMenor);
    }
    
    public void MostrarTodo(){       
        for (Alumnos i : CursoProgramacion) {
            System.out.println(i.toString());
        }
    }
    
    public void Menu(){
        int resp = 0;
        do {
            System.out.println("Ingrese la opcion de lo que desea realizar");
            System.out.println("1 - Cargar un alumno");
            System.out.println("2 - Mostrar el nombre del todos");
            System.out.println("3 - Mostrar los aprobados");
            System.out.println("4 - Ordenar Alfabeticamente");
            System.out.println("5 - Ordenar de nota mayor a nota menor");
            System.out.println("6 - Ordenar de nota menor a nota mayor");
            System.out.println("7 - Mostrar Todo");
            System.out.println("0 - Salir");
            resp = sc.nextInt();
            switch (resp){
                case 1: Crear();
                    break;
                case 2: Mostrar();
                    break;
                case 3: Aprobados();
                    break;
                case 4: OrdenarA();
                    break;
                case 5: OrdenarMayor();
                    break;
                case 6: OrdenarMenor();
                    break;
                case 7: MostrarTodo();
                    break;
                case 0: break;    
            } 
        } while(resp!=0);        
    }
    
    public Comparator<Alumnos> OrdenarNomb = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos o1, Alumnos o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }            
    };
    
    public Comparator<Alumnos> OrdenarNotaMayor = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos o1, Alumnos o2) {
            return o1.getNota().compareTo(o2.getNota());
        }            
    };
        
    public Comparator<Alumnos> OrdenarNotaMenor = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos o1, Alumnos o2) {
            return o2.getNota().compareTo(o1.getNota());
        }           
    };
}
