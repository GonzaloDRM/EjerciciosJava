/*
Realizar el juego de la ruleta rusa en Java. Como muchos saben, el juego se trata
de un número de jugadores, que con un revolver, el cual posee una sola bala en
el tambor, se dispara en la cabeza. Las clases a hacer del juego son las siguientes:
Clase Revolver: esta clase posee los siguientes atributos: posición actual (posición del
tambor donde se dispara, puede que esté la bala o no) y posición bala (la posición del
tambor donde se encuentra la bala). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición de la bala. Los
valores deben ser aleatorios.
• disparar(): devuelve true si la bala coincide con la posición actual
• siguienteBala(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está la bala)


Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y vivo
(indica si está vivo o no el jugador. El número de jugadores será decidido por el usuario,
pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• llenarJugador(): el metodo tiene un Scanner, le pide al usuario los valores del jugador
y se guardan en los atributos correspondientes. Excepto vivo que se pone en true por
defecto. Este jugador lleno se guarda en un ArrayList de jugadores para ser usado
despues.
• disparo(Revolver r): el metodo, recibe el revolver y utilizando los metodos de
disparar() y siguienteBala() de Revolver tiene que lograr la siguiente tarea. El jugador
se apunta y se dispara, si la bala se dispara, el jugador muere, el atributo vivo pasa a
false y el método devuelve true, sino false.


Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver.
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este metodo recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): En cada ronda se recorre la lista de jugadores y llama al método
disparo(Revolver r) de la clase jugador. A este, se le pasa el revolver que tenemos de
atributo. El jugador se apunta y se dispara, y luego se informara del estado de la
partida, usando lo que devuelve el método disparo(Revolver r) (El jugador se
dispara, no ha muerto en esa ronda, etc.). Cuando un jugador muere la ronda y el
juego se terminan.
En cada turno uno de los jugadores, dispara el revólver, si este tiene la bala el jugador
muere y el juego termina.
*/

package Ejercicio1;

public class AMain {

    public static void main(String[] args) {
        Revolver rev = new Revolver();
        
        JuegoServicios.llenarJuego(rev);
        
        
        
    }

}
