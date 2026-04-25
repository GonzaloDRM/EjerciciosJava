
package eggpoo;
import java.util.Scanner;

public class perros {

    
     
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Perro perro1 = new Perro("Chiquito", 18, true, "Caniche");
        
        Perro perro2 = new Perro();
        
        perro2.setApodo("Cartucho"); //seteamos el nombre (modificamos)
        perro2.setCola(false);
        
        System.out.println("perro1 "+ perro1.getApodo()+" Tiene Cola? "+perro1.getCola()); //get para traer el dato
        System.out.println("perro2 "+ perro2.getApodo()+" Tiene Cola? "+perro2.getCola());
        
        Perro perro3 = new Perro();
        
        crearPerro(perro3);
        
        System.out.println("Perro 3: "+ perro3.toString());
        
        
        
    }
    public static Perro crearPerro(Perro perro3){
             
        perro3.setApodo("Perritu");
        perro3.setCola(true);
        perro3.setPeso(18);
        perro3.setRaza("Doberman");
        
        return perro3;
    }

    }


