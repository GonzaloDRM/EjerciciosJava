
package Ejercicio1;

public class RevolverServicios {
    Revolver rev = new Revolver();
    
    public static Revolver llenarRevolver(Revolver rev){
        rev.setPosActual((int)(Math.random()*6));
        rev.setPosBala((int)(Math.random()*6));  
        return rev;
    }
    
    public static boolean disparar(Revolver rev){
        boolean res;
        if(rev.getPosActual()==rev.getPosBala()){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    
    public static void siguienteBala(Revolver rev){
        if(rev.getPosActual()>=5){
            rev.setPosActual(0);
        }else {
            rev.setPosActual(rev.getPosActual()+1);
        } 
    }   
}
