
package Ejercicioo12;

public class Servicios {
    
    public static String AsignarLetra(Letra letra1){
        int num;
        String letras,asigna;
        String[] array = new String[22];
        letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        for(int i=0;i<22;i++){
            array[i]=letras.substring(i,i+1);
        }
        num = letra1.getDNI()%23;
        asigna = array[num];
        return asigna;
    }
    
}
