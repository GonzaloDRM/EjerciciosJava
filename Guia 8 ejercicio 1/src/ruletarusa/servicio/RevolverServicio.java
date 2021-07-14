package ruletarusa.servicio;

import ruletarusa.objeto.Revolver;

public class RevolverServicio {
   private Revolver r = new Revolver();
   
   public Revolver llenarRevolver(){
      r.setPosicionBala((int)(Math.random()*(r.getTambor())+1)); //6 balas
      return r;
   }
   
   public Boolean disparar(Integer posicion){
      r.setPosicionActual(posicion);
      return !(r.getPosicionBala() == r.getPosicionActual());
   }
   
   //gira tambor
   public Integer siguienteBala(){
      r.setPosicionActual((int)(Math.random()*(r.getTambor())+1));
      //se puede modificar a que solo sea sin girar el tambor
      return r.getPosicionActual();
   }
   
   public void mostrarLugar(){
      System.out.println(r.toString());
   }
}