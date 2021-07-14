
package Ejercicio1class;

import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");   
    
    public void LlenarJugador(Juego game){        
        
        int cont = 0;
        String resp;
        do {
            Jugador jugad = new Jugador();
            jugad.setId(cont);           
            System.out.println("Nombre del jugador");
            jugad.setNombre(sc.next());
            jugad.setVivo(true);
            cont += 1;
            game.AgregarLista(jugad);
            System.out.println("Desea seguir agregando jugadores? (S/N)");
            resp = sc.next();
            if(cont>=6){
                System.out.println("No se pueden agregar mas de 6");
                resp = "N";
            }           
        }while(resp.toUpperCase().equals("S"));               
    }
    
    public void Disparo(){
        RevolverServicios r = new RevolverServicios();
        r.Disparar();
        r.SiguienteBala();
    }
    
}
