
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    
    private Revolver revolver;
    private List<Persona> jugadores = new ArrayList();

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public Juego() {
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public List<Persona> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Persona> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void agregarJugadores(Persona jug){
        jugadores.add(jug);
    }
    
}
