
package Ejercicio1;

import java.util.List;

public class JuegoServicios {    
    
    public static void llenarJuego(Revolver rev){
        Juego game = new Juego();
        rev = RevolverServicios.llenarRevolver(rev);
        game = JugadorServicios.llenarJugador();
        RevolverServicios.llenarRevolver(rev);
        ronda(game, rev);
            
    }
    
    public static void ronda(Juego game, Revolver rev){
        boolean disp, salir;
        salir = false;
        
        disp = RevolverServicios.disparar(rev);
        do{
            int cont = 0;
            if(disp = true){
                System.out.println(game.getJugadores().get(cont) + " murio");
                salir = true;
            }else{
                RevolverServicios.siguienteBala(rev);
            }
            
        }while(salir=false);  
    }
    
}
