
package Ejercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Barco> barcos = new ArrayList();
    
    public void menu() throws ParseException{
        int resp;
        do{
            System.out.println("Selecciones la opcion de lo que desea realizar");
            System.out.println("1 - Crear un velero");
            System.out.println("2 - Crear un barco deportivo");
            System.out.println("3 - Crear un yate");
            System.out.println("4 - Mostrar la lista de los barcos disponibles");
            System.out.println("5 - Alquilar un barco");
            System.out.println("9 - Salir");
            resp = sc.nextInt();
            switch(resp){
                case 1: crearVelero();
                    break;
                case 2: crearBarcoDep();
                    break;
                case 3: crearYate();
                    break;
                case 4: mostrarBarcos();
                    break;
                case 5: crearCliente();
                    break;
            } 
        }while(resp != 9); 
    }
      
    public void crearCliente() throws ParseException{
        int fec;
        Date fecha = new Date();
        Date fechaff = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Cliente cliente = new Cliente();
        String fechai, fechaf;
        Calendar c = Calendar.getInstance();
        
        System.out.println("Ingrese Nombre");
        cliente.setNombre(sc.next());
        System.out.println("Ingrese DNI");
        cliente.setDni(sc.nextInt());
        System.out.println("Ingrese que barco alquilará");
        mostrarBarcos();
        int bar = sc.nextInt();
        cliente.setBarco(barcos.get(bar));
        
        System.out.println("Ingrese la fecha que comienza el alquiler (dia/mes/año");
        fechai = sc.next();
        fecha = sdf.parse(fechai);
        cliente.setFechaAlq(fecha);
        
        System.out.println("Ingrese la fecha que finaliza el alquiler");
        fechaf = sc.next();
        fechaff = sdf.parse(fechaf);
        cliente.setFechaFin(fechaff);
        System.out.println("Ingrese la posicion del amarre");
        cliente.setPosAmarre(sc.next());
        
        System.out.println(cliente.toString());
        
        int dias = calcularFechas(fecha, fechaff);
        
        System.out.println("El precio del alquiler será de " + -(dias*cliente.getBarco().getPrecioBase()));
        
    }
    
    public int calcularFechas(Date fecha, Date fechaff){
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        int ano1,mes1,dia1,ano2,mes2,dia2;
        ano1=c.get(Calendar.YEAR);
        mes1=c.get(Calendar.MONTH);
        dia1=c.get(Calendar.DATE);
        c.setTime(fechaff);
        ano2=c.get(Calendar.YEAR);
        mes2=c.get(Calendar.MONTH);
        dia2=c.get(Calendar.DATE);
        Period resta = Period.between(LocalDate.of(ano2,mes2,dia2), LocalDate.of(ano1,mes1,dia1));
        
        int dias = ((resta.getYears()) * 12);
        dias = ((dias + resta.getMonths()) * 30);
        dias = dias + resta.getDays();
        
        return dias;
    }
    
    public void crearVelero() throws ParseException{
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Velero vel = new Velero();
        System.out.println("Ingrese matricula del barco");
        vel.setMatricula(sc.next());
        System.out.println("Ingrese fecha de fabricacion");
        String f = sc.next();
        fecha= sdf.parse(f);
        vel.setAnoFabr(fecha);
        System.out.println("Ingrese los metros de slora");
        vel.setSlora(sc.nextInt());
        System.out.println("Ingrese la cantidad de mastiles del velero");
        vel.setMastiles(sc.nextInt());
        
        vel.setPrecioBase(vel.getMastiles()*10);
        
        barcos.add(vel);
    }
    
    public void crearBarcoDep() throws ParseException{
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        BarcoDep dep = new BarcoDep();
        System.out.println("Ingrese matricula del barco");
        dep.setMatricula(sc.next());
        System.out.println("Ingrese fecha de fabricacion");
        String f = sc.next();
        fecha= sdf.parse(f);
        dep.setAnoFabr(fecha);
        System.out.println("Ingrese los metros de slora");
        dep.setSlora(sc.nextInt());
        System.out.println("Ingrese la potencia en cv");
        dep.setPotenciaD(sc.nextInt());
        
        dep.setPrecioBase(dep.getPotenciaD()*10);
        
        barcos.add(dep);       
    }
    
    public void crearYate() throws ParseException{
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Yate yate = new Yate();
        System.out.println("Ingrese matricula del barco");
        yate.setMatricula(sc.next());
        System.out.println("Ingrese fecha de fabricacion");
        String f = sc.next();
        fecha= sdf.parse(f);
        yate.setAnoFabr(fecha);
        System.out.println("Ingrese los metros de slora");
        yate.setSlora(sc.nextInt());
        System.out.println("Ingrese la potencia en cv");
        yate.setPotenciaY(sc.nextInt());
        
        yate.setPrecioBase(yate.getPotenciaY()*10);
        
        barcos.add(yate);       
    }
    
    public void mostrarBarcos(){
        int c = 0;
        for (Barco i : barcos) {
            System.out.println(c + " - " + i.toString());
            c += 1;
        }        
    }   
}
