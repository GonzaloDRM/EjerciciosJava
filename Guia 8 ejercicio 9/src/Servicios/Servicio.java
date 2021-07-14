
package Servicios;

import Objetos.Estudiante;
import Objetos.Persona;
import Objetos.Personal;
import Objetos.PersonalServ;
import Objetos.Profesor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Date fecha = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    List<Profesor> profesores = new ArrayList();
    List<Estudiante> estudiantes = new ArrayList();
    List<Personal> personal = new ArrayList();
    List<PersonalServ> personalServ = new ArrayList();
    
    public void menu() throws ParseException{
        List<Persona> todos = new ArrayList();
        int resp = 0;       
        do{
            System.out.println("Seleccione la opcion de lo que desea realizar");
            System.out.println("1 - Ingresar un nuevo estudiante");
            System.out.println("2 - Ingresar un nuevo personal");
            System.out.println("3 - Ingresar un nuevo personal de servicio");
            System.out.println("4 - Ingresar un nuevo profesor");
            System.out.println("5 - Imprimir todo");
            System.out.println("6 - Cambiar estado civil de alguien");
            System.out.println("7 - Reasignacion de despacho de un empleado");
            System.out.println("8 - Matricular a un estudiante en un nuevo curso");
            System.out.println("9 - Cambiar de departamento a un profesor");
            System.out.println("10 - Imprimir estudiantes");
            System.out.println("11 - Imprimir profesores");
            System.out.println("12 - Imprimir personal");
            System.out.println("13 - Imprimir personal de servicio");
            System.out.println("14 - Crear uno de cada uno");
            System.out.println("0 - Salir");
            resp = sc.nextInt();
            switch(resp){
                case 1: crearEstudiante((ArrayList<Persona>) todos);
                    break;
                case 2: crearPersonal((ArrayList<Persona>) todos);
                    break;
                case 3: crearPersonalServ((ArrayList<Persona>) todos);
                    break;
                case 4: crearProfesor((ArrayList<Persona>) todos);
                    break;
                case 5: imprimirTodo((ArrayList<Persona>) todos);
                    break;
                case 6: cambiarEstadoCivil((ArrayList<Persona>) todos);
                    break;
                case 7: reasignarDespacho((ArrayList<Persona>) todos);
                    break;
                case 8: cambiarMatricula((ArrayList<Persona>) todos);
                    break;
                case 9: cambiarDepartamento((ArrayList<Persona>) todos);
                    break;
                case 10: imprimirEstudiantes((ArrayList<Persona>) todos);
                    break;
                case 11: imprimirProfesores((ArrayList<Persona>) todos);
                    break;
                case 12: imprimirPersonal((ArrayList<Persona>) todos);
                    break;
                case 13: imprimirPersonalServicio((ArrayList<Persona>) todos);
                    break;
                case 14: crearTodo((ArrayList<Persona>) todos);
                    break;
            }  
        }while(resp != 9);
    }
    
    public ArrayList crearEstudiante(ArrayList<Persona> todos){
        Estudiante est = new Estudiante();
        
        System.out.println("Ingrese nombre del estudiante");
        est.setNombre(sc.next());
        System.out.println("Ingrese DNI");
        est.setDni(sc.nextInt());
        System.out.println("Ingrese estado civil");
        est.setEstCivil(sc.next());
        System.out.println("Ingrese curso");
        est.setCurso(sc.next());
        
        estudiantes.add(est);
        todos.add(est);
        return todos;
    }
    
    public ArrayList crearProfesor(ArrayList<Persona> todos){
        Profesor prof = new Profesor();
        
        System.out.println("Ingrese el nombre del profesor");
        prof.setNombre(sc.next());
        System.out.println("Ingrese su DNI");
        prof.setDni(sc.nextInt());
        System.out.println("Ingrese estado civil");
        prof.setEstCivil(sc.next());
        System.out.println("Ingrese su departamento");
        prof.setDepartamento(sc.next());
        
        profesores.add(prof);
        todos.add(prof);
        return todos;
    }
    
    public ArrayList crearPersonal(ArrayList<Persona> todos) throws ParseException{
        Personal per = new Personal();
        
        System.out.println("Ingrese nombre");
        per.setNombre(sc.next());
        System.out.println("Ingrese DNI");
        per.setDni(sc.nextInt());
        System.out.println("Ingrese estado civil");
        per.setEstCivil(sc.next());
        System.out.println("Ingrese fecha de incorporacion");
        String fec = sc.next();
        fecha = sdf.parse(fec);
        per.setIncorporacion(fecha);
        System.out.println("Ingrese numero de despacho");
        per.setNumDespacho(sc.nextInt());
        
        personal.add(per);
        todos.add(per);
        return todos;
    }
    
    public ArrayList crearPersonalServ(ArrayList<Persona> todos){
        PersonalServ per = new PersonalServ();
        
        System.out.println("Ingrese nombre");
        per.setNombre(sc.next());
        System.out.println("Ingrese DNI");
        per.setDni(sc.nextInt());
        System.out.println("Ingrese estado civil");
        per.setEstCivil(sc.next());
        System.out.println("Ingrese seccion");
        per.setSeccion(sc.next());
        
        personalServ.add(per);
        todos.add(per);
        return todos;
    }
    
    public ArrayList crearTodo(ArrayList<Persona> todos) throws ParseException{
        Estudiante est = new Estudiante();
        Personal per = new Personal();
        PersonalServ persev = new PersonalServ();
        Profesor prof = new Profesor();
        
        est.setNombre("Margarita del Campo");
        est.setDni(31531351);
        est.setEstCivil("Soltera");
        est.setCurso("Ingenieria");
        
        per.setNombre("Alberto Carenalga");
        per.setDni(35135131);
        per.setEstCivil("Casado");
        String fec = "01/02/2001";
        fecha = sdf.parse(fec);
        per.setIncorporacion(fecha);
        per.setNumDespacho(101);
        
        persev.setNombre("Suisui Chacha");
        persev.setDni(31513535);
        persev.setEstCivil("Soltero");
        persev.setSeccion("Sala de profesores");
        
        prof.setNombre("Elver Galarga");
        prof.setDni(51313523);
        prof.setEstCivil("Soltero");
        prof.setDepartamento("Matematicas");
        
        profesores.add(prof);
        estudiantes.add(est);
        personal.add(per);
        personalServ.add(persev);
        todos.add(est);
        todos.add(per);
        todos.add(persev);
        todos.add(prof);
        return todos;
    }
    
    public void imprimirTodo(ArrayList<Persona> todos){
        int cont = 0;
        for (Persona i : todos) {
            System.out.println(cont + " - " + i.toString());
            cont += 1;
        }
    }
    
    public void imprimirEstudiantes(ArrayList<Persona> todos){
        int cont = 0;
        for (Persona i : todos) {
            if(i instanceof Estudiante){
                System.out.println(cont + " - " + i.toString());
                cont += 1;
            }
        }
    }
    
    public void imprimirProfesores(ArrayList<Persona> todos){
        int cont = 0;
        for (Persona i : todos) {
            if(i instanceof Profesor){
                System.out.println(cont + " - " + i.toString());
                cont += 1;
            }
        }
    }
    
    public void imprimirPersonal(ArrayList<Persona> todos){
        int cont = 0;
        for (Persona i : todos) {
            if(i instanceof Personal){
                System.out.println(cont + " - " + i.toString());
                cont += 1;
            }
        }       
    }
    
    public void imprimirPersonalServicio(ArrayList<Persona> todos){
        int cont = 0;
        for (Persona i : todos) {
            if(i instanceof PersonalServ){
                System.out.println(cont + " - " + i.toString());
                cont += 1;
            }
        }
    }
    
    public void cambiarEstadoCivil(ArrayList<Persona> todos){
        imprimirTodo((ArrayList<Persona>) todos);
        System.out.println("A quien desea cambiarle su estado civil?");
        int resp = sc.nextInt();
        todos.get(resp).setEstCivil(sc.next());
    }
    
    public void reasignarDespacho(ArrayList<Persona> todos){
        int c = 0;
        System.out.println("A que Empleado desea cambiar de despacho?");
        for (Personal i : personal) {
            System.out.println(c + " - " + i.toString());
            c += 1;
        }
        int r = sc.nextInt();
        personal.get(r).setNumDespacho(sc.nextInt());        
    }
    
    public void cambiarMatricula(ArrayList<Persona> todos){
        int c = 0;
        System.out.println("A que estudiante desea reasignar su carrera?");
        for (Estudiante i : estudiantes) {
            System.out.println(c + " - " + i.toString());
            c += 1;
        }
        int r = sc.nextInt();
        estudiantes.get(r).setCurso(sc.next());       
    }
    
    public void cambiarDepartamento(ArrayList<Persona> todos){
        int c = 0;
        System.out.println("A que profesor desea cambiar de departamento?");
        for (Profesor i : profesores) {
            System.out.println(c + " - " + i.toString());
            c += 1;
        }
        int r = sc.nextInt();
        profesores.get(r).setDepartamento(sc.next()); 
    }
}
