
package Ejercicio1class;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    
    private List<Jugador> jugador = new ArrayList();
    private Revolver revolver;

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public Juego() {
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(List<Jugador> jugador) {
        this.jugador = jugador;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    public void AgregarLista(Jugador jugadores){
        jugador.add(jugadores);
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", revolver=" + revolver + '}';
    }
     
}
