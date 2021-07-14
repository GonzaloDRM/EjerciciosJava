
package Ejercicio1class;

import java.util.List;
import java.util.Scanner;

public class JuegoServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");   
    
    public void LlenarJuego(Juego g){
        RevolverServicios r = new RevolverServicios();
        JugadorServicios j = new JugadorServicios();
        r.LlenarRevolver();
        
        j.LlenarJugador(g);
    }
    
    public void Ronda(List<Jugador> s){
        
        for (Jugador i : s) {
            System.out.println(i);
        }
       
        
    }   
}
