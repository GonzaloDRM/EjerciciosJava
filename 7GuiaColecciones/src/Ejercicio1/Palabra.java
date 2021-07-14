
package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Palabra {
    
    private List<String> palabras = new ArrayList();

    public List<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<String> palabras) {
        this.palabras = palabras;
    }
    
    public void AgregarPalabra(String palabra){
        palabras.add(palabra);
    }
    
   
//    asi se hace el comparator  
//    
//    public static Comparator<Palabra> ordenar = new Comparator<Palabra>(){
//        @Override
//        public int compare(Palabra o1, Palabra o2) {
//            return o1.getPalabras().compareTo(o2.getPalabras());
//        }
//    };
//    
}
