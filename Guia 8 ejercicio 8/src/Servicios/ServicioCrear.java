package Servicios;

import Objetos.Alojamiento;
import Objetos.Camping;
import Objetos.Hotel3est;
import Objetos.Hotel4est;
import Objetos.Hotel5est;
import Objetos.Residencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioCrear {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Alojamiento> alojamientos = new ArrayList();

    public void menu() {
        int resp = 0;
        do {
            System.out.println("Seleccione la opcion a realizar");
            System.out.println("1 - Crear alojamientos automaticamente");
            System.out.println("2 - Crear manualmente");
            System.out.println("3 - Consultar todos los alojamientos");
            System.out.println("4 - Consultar los hoteles de cierta localidad");
            System.out.println("5 - Consultar los campings de cierta localidad");
            System.out.println("9 - Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    crearTodo();
                    break;
                case 2:
                    do {
                        System.out.println("1 - Crear un hotel 3 estrellas");
                        System.out.println("2 - Crear un hotel 4 estrellas");
                        System.out.println("3 - Crear un hotel 5 estrellas");
                        System.out.println("4 - Crear un camping");
                        System.out.println("5 - Crear una residencia");
                        System.out.println("9 - salir");
                        resp = sc.nextInt();
                        switch (resp) {
                            case 1:
                                crearHotel3();
                                break;
                            case 2:
                                crearHotel4();
                                break;
                            case 3:
                                crearHotel5();
                                break;
                            case 4:
                                crearCamping();
                                break;
                            case 5:
                                crearResidencia();
                                break;
                        }
                    } while (resp != 9);
                    resp = 0;
                    break;
                case 3: imprimirTodo();
                    break;
                case 4: imprimirHotelesLocalidad();
                    break;
                case 5: imprimirCampingsLocalidad();
                    break;
            }

        } while (resp != 9);

    }
    
    public void imprimirTodo(){
        for (Alojamiento i : alojamientos) {
            System.out.println(i);
        }
    }
    
    public void imprimirHotelesLocalidad(){
        System.out.println("En que localidad desea buscar hoteles?");
        String resp = sc.next();
        for (Alojamiento i : alojamientos) {
            if(i instanceof Hotel3est){
                if(i.getLocalidad().equals(resp)){
                    System.out.println(i.toString());
                }            
            }else if(i instanceof Hotel4est){
                if(i.getLocalidad().equals(resp)){
                    System.out.println(i.toString());
                }           
            }else if(i instanceof Hotel5est){
                if(i.getLocalidad().equals(resp)){
                    System.out.println(i.toString());
                }            
            }
        }       
    }

    public void imprimirCampingsLocalidad(){
        System.out.println("En que localidad desea buscar campings?");
        String resp = sc.next();
        for (Alojamiento i : alojamientos) {
            if(i instanceof Camping){
                if(i.getLocalidad().equals(resp)){
                    System.out.println(i.toString());
                }
            }
        }
    }
    
    public void crearHotel3() {
        Hotel3est est3 = new Hotel3est();

        System.out.println("Ingrese la cantidad de camas");
        est3.setCamas(sc.nextInt());
        System.out.println("Ingrese la direccion");
        est3.setDireccion(sc.next());
        System.out.println("Ingrese el nombre del encargado");
        est3.setEncargado(sc.next());
        System.out.println("Ingrese la cantidad de habitaciones");
        est3.setHabitaciones(sc.nextInt());
        System.out.println("Ingrese la localidad");
        est3.setLocalidad(sc.next());
        System.out.println("Ingrese el nombre de hotel");
        est3.setNombre(sc.next());
        System.out.println("Ingrese la cantidad de pisos");
        est3.setPisos(sc.nextInt());
        est3.setPrecio(ponerPrecio3est(est3));

        alojamientos.add(est3);
    }

    public void crearHotel4() {
        Hotel4est est4 = new Hotel4est();
        String resp;

        System.out.println("Ingrese cantidad de camas");
        est4.setCamas(sc.nextInt());
        System.out.println("Ingrese direccion");
        est4.setDireccion(sc.next());
        System.out.println("Ingrese nombre del encargado");
        est4.setEncargado(sc.next());
        System.out.println("Ingrese cantidad de habitaciones");
        est4.setHabitaciones(sc.nextInt());
        System.out.println("Ingrese localidad");
        est4.setLocalidad(sc.next());
        System.out.println("Ingrese nombre del hotel");
        est4.setNombre(sc.next());
        System.out.println("Ingrese cantidad de pisos");
        est4.setPisos(sc.nextInt());
        
        System.out.println("El gimnasio es de tipo A o B?");
        resp = sc.next();
        if(resp.toUpperCase().equals("A")){
            est4.setGimnasio(true);
        }else {
            est4.setGimnasio(false);
        }
        
        System.out.println("Ingrese nombre del restaurant");
        est4.setNombreRest(sc.next());
        System.out.println("Ingrese capacidad del restaurant");
        est4.setCapacidadRest(sc.nextInt());
        est4.setPrecio(ponerPrecio4est(est4));

        alojamientos.add(est4);
    }

    public void crearHotel5() {
        Hotel5est est5 = new Hotel5est();
        String resp;
        
        System.out.println("Ingrese cantidad de camas");
        est5.setCamas(sc.nextInt());
        System.out.println("Ingrese direccion");
        est5.setDireccion(sc.next());
        System.out.println("Ingrese nombre del encargado");
        est5.setEncargado(sc.next());
        System.out.println("Ingrese cantidad de habitaciones");
        est5.setHabitaciones(sc.nextInt());
        System.out.println("Ingrese localidad");
        est5.setLocalidad(sc.next());
        System.out.println("Ingrese nombre del hotel");
        est5.setNombre(sc.next());
        System.out.println("Ingrese cantidad de pisos");
        est5.setPisos(sc.nextInt());
        
        System.out.println("El gimnasio es de tipo A o B?");
        resp = sc.next();
        if(resp.toUpperCase().equals("A")){
            est5.setGimnasio(true);
        }else {
            est5.setGimnasio(false);
        }
        
        System.out.println("Ingrese nombre del restaurant");
        est5.setNombreRest(sc.next());
        System.out.println("Ingrese capacidad del restaurant");
        est5.setCapacidadRest(sc.nextInt());
        System.out.println("Ingrese la cantidad de salones de conferencias");
        est5.setSalonesConf(sc.nextInt());
        System.out.println("Ingrese la cantidad de suites");
        est5.setCantSuites(sc.nextInt());
        System.out.println("Ingrese la cantidad de limosinas");
        est5.setCantLimosinas(sc.nextInt());
        est5.setPrecio(ponerPrecio5est(est5));
        
        alojamientos.add(est5);       
    }

    public void crearCamping() {
        Camping camp = new Camping();
        String resp;
        
        System.out.println("Ingrese cantidad de baños");
        camp.setBanos(sc.nextInt());
        System.out.println("Ingrese la cantidad de carpas");
        camp.setCarpas(sc.nextInt());
        System.out.println("Ingrese direccion");
        camp.setDireccion(sc.next());
        System.out.println("Ingrese nombre del encargado");
        camp.setEncargado(sc.next());
        System.out.println("Ingrese nombre de la localidad");
        camp.setLocalidad(sc.next());
        System.out.println("Ingrese cantidad de metros");
        camp.setMetros(sc.nextInt());
        System.out.println("Ingrese nombre del camping");
        camp.setNombre(sc.next());
        
        System.out.println("Es privado? (S/N)");
        resp = sc.next();
        if(resp.toUpperCase().equals("S")){
            camp.setPrivado(true);
        }else{
            camp.setPrivado(false);
        } 
        
        System.out.println("Tiene restaurant? (S/N)");
        resp = sc.next();
        if(resp.toUpperCase().equals("S")){
            camp.setRest(true);
        }else{
            camp.setRest(false);
        }
        camp.setPrecio(ponerPrecioCamp(camp));

        alojamientos.add(camp);
    }

    public void crearResidencia() {
        Residencia res = new Residencia();
        String resp;
        
        System.out.println("Tiene campo deportivo? (S/N)");
        resp = sc.next();
        if(resp.toUpperCase().equals("S")){
            res.setCampoDep(true);
        }else{
            res.setCampoDep(false);
        }        
        System.out.println("Tiene descuentos? (S/N)");
        resp = sc.next();
        if(resp.toUpperCase().equals("S")){
            res.setDescuentos(true);
        }else{
            res.setDescuentos(false);
        }
        System.out.println("Ingrese direccion");
        res.setDireccion(sc.next());
        System.out.println("Ingrese nombre del encargado");
        res.setEncargado(sc.next());
        System.out.println("Ingrese numero de habitaciones");
        res.setHabitaciones(sc.nextInt());
        System.out.println("Ingrese localidad");
        res.setLocalidad(sc.next());
        System.out.println("Ingrese la cantidad de metros");
        res.setMetros(sc.nextInt());
        System.out.println("Ingrese nombre de la residencia");
        res.setNombre(sc.next());
        
        System.out.println("Es privado? (S/N)");
        resp = sc.next();
        if(resp.toUpperCase().equals("S")){
            res.setPrivado(true);
        }else{
            res.setPrivado(false);
        }               
        res.setPrecio((int) (ponerPrecioRes(res)));
        
        alojamientos.add(res);
    }

    public void crearTodo() {
        Hotel3est est3 = new Hotel3est();
        Hotel4est est4 = new Hotel4est();
        Hotel5est est5 = new Hotel5est();
        Residencia res = new Residencia();
        Camping camp = new Camping();

        est3.setCamas(2);
        est3.setDireccion("Av. Siempre Viva 222");
        est3.setEncargado("Esteban Quito");
        est3.setHabitaciones(2);
        est3.setLocalidad("Springfield");
        est3.setNombre("Simpsons suits");
        est3.setPisos(0);
        est3.setPrecio(ponerPrecio3est(est3));

        est4.setCamas(5);
        est4.setDireccion("Av. San Martin 10");
        est4.setEncargado("Susana Horia");
        est4.setHabitaciones(3);
        est4.setLocalidad("Ciudad");
        est4.setNombre("La posada loca");
        est4.setPisos(2);
        est4.setGimnasio(true);
        est4.setNombreRest("Mexicote");
        est4.setCapacidadRest(30);
        est4.setPrecio(ponerPrecio4est(est4));

        est5.setCamas(8);
        est5.setDireccion("Av. de la vida");
        est5.setEncargado("Pararan Pampam");
        est5.setHabitaciones(4);
        est5.setLocalidad("Lujan");
        est5.setNombre("Hotel comonel");
        est5.setPisos(5);
        est5.setGimnasio(true);
        est5.setNombreRest("Taquitos locos");
        est5.setCapacidadRest(100);
        est5.setSalonesConf(5);
        est5.setCantSuites(10);
        est5.setCantLimosinas(10);
        est5.setPrecio(ponerPrecio5est(est5));

        res.setCampoDep(true);
        res.setDescuentos(true);
        res.setDireccion("Pororon Pompom");
        res.setEncargado("Señor Burns");
        res.setHabitaciones(2);
        res.setLocalidad("Sarasasa");
        res.setMetros(1000);
        res.setNombre("Excelente");
        res.setPrivado(true);
        res.setPrecio((int) (ponerPrecioRes(res)));

        camp.setBanos(3);
        camp.setCarpas(30);
        camp.setDireccion("saracatrasca");
        camp.setEncargado("Payaso Plinplin");
        camp.setLocalidad("Guaymallen");
        camp.setMetros(1500);
        camp.setNombre("La posada de la posada");
        camp.setPrivado(true);
        camp.setRest(true);
        camp.setPrecio(ponerPrecioCamp(camp));

        alojamientos.add(est3);
        alojamientos.add(est4);
        alojamientos.add(est5);
        alojamientos.add(res);
        alojamientos.add(camp);
    }

    public int ponerPrecio3est(Hotel3est est3) {
        int resu = 50;
        resu = resu + (est3.getCamas() * est3.getHabitaciones());
        return resu;
    }

    public int ponerPrecio4est(Hotel4est est4) {
        int resu = 50;
        resu = resu + (est4.getCamas() * est4.getHabitaciones());
        if (est4.getCapacidadRest() < 30) {
            resu += 10;
        } else if (est4.getCapacidadRest() > 30 && est4.getCapacidadRest() < 50) {
            resu += 30;
        } else {
            resu += 50;
        }

        if (est4.isGimnasio()) {
            resu += 50;
        } else {
            resu += 30;
        }
        return resu;
    }

    public int ponerPrecio5est(Hotel5est est5) {
        int resu = 50;
        resu = resu + (est5.getCamas() * est5.getHabitaciones());
        if (est5.getCapacidadRest() < 30) {
            resu += 10;
        } else if (est5.getCapacidadRest() > 30 && est5.getCapacidadRest() < 50) {
            resu += 30;
        } else {
            resu += 50;
        }

        if (est5.isGimnasio()) {
            resu += 50;
        } else {
            resu += 30;
        }

        resu += est5.getCantLimosinas() * 15;
        return resu;
    }

    public int ponerPrecioCamp(Camping camp) {
        int resu;
        resu = camp.getCarpas() + camp.getMetros() + camp.getBanos();
        return resu;
    }

    public double ponerPrecioRes(Residencia res) {
        double resu;
        resu = (res.getHabitaciones() * 10) + (res.getMetros() / 10);
        if (res.isCampoDep()) {
            resu += 30;
        }

        if (res.isDescuentos()) {
            resu = resu * 0.70;
        }
        return resu;
    }

}
