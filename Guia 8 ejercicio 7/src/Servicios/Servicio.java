/*
Por ultimo, crear una clase Test con el método main y dos ArrayList. El primer
ArrayList debe contener tres polideportivos, y el segundo, dos edificios de
oficinas. Utilizar un iterator para recorrer las colecciones y utilizar el método
tipoDeInstalación() para saber cuantos polideportivos son techados y cuantos
abiertos. 

Además usaremos el método calcularSuperficie(), para calcular la
superficie de todos los polideportivos como de todos los edificios de oficina.
Una vez realizado el ejercicio responda: ¿Entre qué clases existe una relación que
se asemeja a la herencia múltiple?
 */

package Servicios;

import Objetos.EdificioDeOficinas;
import Objetos.Polideportivo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Servicio {
    List<Polideportivo> polis = new ArrayList();
    List<EdificioDeOficinas> edi = new ArrayList();
    
    public void crearPolis(){
        Polideportivo pol1 = new Polideportivo();
        Polideportivo pol2 = new Polideportivo();
        Polideportivo pol3 = new Polideportivo();
        
        pol1.setNombre("Futbol");
        pol1.setTipo("Techado");
        pol1.setLargo(40);
        pol1.setAncho(20);
        
        pol2.setNombre("Basquet");
        pol2.setTipo("Techado");
        pol2.setLargo(20);
        pol2.setAncho(10);
        
        pol3.setNombre("Tenis");
        pol3.setTipo("Abierto");
        pol3.setLargo(10);
        pol3.setAncho(5);
        
        polis.add(pol1);
        polis.add(pol2);
        polis.add(pol3);
    }
    
    public void crearEdi(){
        EdificioDeOficinas edi1 = new EdificioDeOficinas();
        EdificioDeOficinas edi2 = new EdificioDeOficinas();
        
        edi1.setAncho(10);
        edi1.setLargo(5);
        edi1.setNumeroDeOficinas(10);
        edi1.setNumeroDePisos(3);
        
        edi2.setAncho(7);
        edi2.setLargo(5);
        edi2.setNumeroDeOficinas(20);
        edi2.setNumeroDePisos(5);
        
        edi.add(edi1);
        edi.add(edi2);
    }
    
    public void imprimir(){
        Iterator <Polideportivo> it = polis.iterator();
        
        while (it.hasNext()) {
            Polideportivo polis = it.next();
            System.out.println(polis.toString());
            System.out.println(polis.calcularSuperficie());
            polis.tipoDeInstalacion();
        }
        
        Iterator <EdificioDeOficinas> it1 = edi.iterator();
        
        while (it1.hasNext()) {
            EdificioDeOficinas edi = it1.next();
            System.out.println(edi.toString());
            System.out.println(edi.calcularSuperficie());
        }
    }
}
