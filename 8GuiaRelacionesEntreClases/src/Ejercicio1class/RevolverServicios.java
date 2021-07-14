
package Ejercicio1class;

public class RevolverServicios{
      
    public void LlenarRevolver(){
        Revolver rev = new Revolver();
        rev.setPosicionActual((int)(Math.random()*6));
        rev.setPosicionBala((int)(Math.random()*6));  
    }
    
    public boolean Disparar(){
        Revolver rev = new Revolver();
        boolean resp;
        if (rev.getPosicionActual()==rev.getPosicionBala()){
            resp = true;
        }else {
            resp = false;
        }
        return resp;
    }
    
    public void SiguienteBala(){
        Revolver rev = new Revolver();
        if (rev.getPosicionActual()>=5){
            rev.setPosicionActual(0);
        }else{
            rev.setPosicionActual(rev.getPosicionActual()+1);
        }  
    }
    
}
