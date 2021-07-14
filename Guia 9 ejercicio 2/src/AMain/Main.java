/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de matriz fuera de rango).
*/

package AMain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        
        try {
            System.out.println(lista.get(2));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        
    }

}
