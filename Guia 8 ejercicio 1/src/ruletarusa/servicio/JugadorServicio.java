package ruletarusa.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ruletarusa.objeto.Jugador;

public class JugadorServicio {
   
   private ArrayList<Jugador> jugadores = new ArrayList<>();
   private Integer id = 0;
   
   
   public ArrayList<Jugador> llenarJugador(){
      Scanner sc = new Scanner(System.in);
      Jugador j = new Jugador();
      id++;
      j.setId(id);
      
      jugadores.add(j);
      
      return jugadores;
   }
   
   public Boolean disparo(RevolverServicio rs){
      System.out.println("Apunta y dispara!");
      return (rs.disparar(rs.siguienteBala()));
   }
   
   public Boolean validarMax(Integer id, Jugador j){
      return (id <= j.getJugadores());
   }
   
   public void mostrarJugadores(ArrayList<Jugador> jugador){
      jugador.forEach((j) -> {
         System.out.println(j.toString());
      });
   }
}