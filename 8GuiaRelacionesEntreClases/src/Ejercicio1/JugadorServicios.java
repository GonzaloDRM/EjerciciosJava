
package Ejercicio1;

import java.util.Scanner;

public class JugadorServicios {
    
    
    public static Juego llenarJugador(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Juego game = new Juego();
        int cont = 0;
        String resp;
        do{
            Persona per = new Persona();
            per.setId(cont);
            cont += 1;
            System.out.println("Ingrese el nombre del jugador");
            per.setNombre(sc.next());
            per.setVivo(true);
            game.agregarJugadores(per);
            
            System.out.println("Desea seguir agregando jugadores? (S/N)");
            resp = sc.next();
            if(game.getJugadores().size()>5){
                System.out.println("No se pueden agregar mas de 6 jugadores");
                resp = "N";
            }
        }while(resp.toUpperCase().equals("S"));    
        return game;
    }
    
    public static void disparo(Revolver rev){
        RevolverServicios.disparar(rev);
        RevolverServicios.siguienteBala(rev);        
    }
    
}
