package integrador;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        Practica practica = new Practica();
        
        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"R", "E", "T", "A", "P", "S", "G", "H"}));

        System.out.println(practica.mediasAmigas(medias));
        System.out.println(practica.numeroCapicua(Long.MAX_VALUE));
        System.out.println(practica.prisioneroDulce(5,10,5));
    }
}
