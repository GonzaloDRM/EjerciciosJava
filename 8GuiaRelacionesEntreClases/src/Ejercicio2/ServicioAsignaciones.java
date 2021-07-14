package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ServicioAsignaciones {

    public void manual() {
        List<Persona> todos = new ArrayList();
        ServiciosCompletar serv = new ServiciosCompletar();
        Pelicula pel = new Pelicula();
        Cine cine = new Cine();

        serv.llenarCliente(todos);
        serv.competarPeli(pel);
        serv.completarCine(cine, pel);

        asignarRandom(todos, cine);

    }

    public void asignarRandom(List<Persona> todos, Cine cine) {
        Map<String, Persona> entrada = new HashMap();
        for (int i = 0; i < todos.size(); i++) {
            int rand = (int) (Math.random() * 8 + 1);
            if (todos.get(i).getEdad() < cine.getPeli().getEdadmin()) {
                System.out.println("El cliente es menor asi que no puede ver esta pelicula");
            } else if (todos.get(i).getDinero() < cine.getPrecio()) {
                System.out.println("El cliente no tiene el dinero suficiente para ver esta pelicula");
            } else {
                switch (rand) {
                    case 1:
                        entrada.put("A" + rand, todos.get(i));
                        break;
                    case 2:
                        entrada.put("B" + rand, todos.get(i));
                        break;
                    case 3:
                        entrada.put("C" + rand, todos.get(i));
                        break;
                    case 4:
                        entrada.put("D" + rand, todos.get(i));
                        break;
                    case 5:
                        entrada.put("E" + rand, todos.get(i));
                        break;
                    case 6:
                        entrada.put("F" + rand, todos.get(i));
                        break;
                    case 7:
                        entrada.put("G" + rand, todos.get(i));
                        break;
                    case 8:
                        entrada.put("H" + rand, todos.get(i));
                        break;
                    case 9:
                        entrada.put("I" + rand, todos.get(i));
                        break;
                }
            }

        }
        Iterator<HashMap.Entry<String, Persona>> it = entrada.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Persona> nombreit = it.next();
            System.out.println(nombreit.getKey() + " - " + nombreit.getValue());
        }
        
        System.out.println("Se transmitirá " + cine.getPeli().toString());
        
    }
}
