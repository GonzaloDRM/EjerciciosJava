package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esCapicua
     */
    public Boolean numeroCapicua(Long num) {
        try {
            long num1 = Math.abs(num);
            num = Math.abs(num);
            String n;
            boolean fin;
            int resp = 0;
            int larg = String.valueOf(num).length() / 2;
            for (int i = 0; i < larg; i++) {
                n = String.valueOf(num1 % 10);
                if (n.equals(num.toString().substring(i, i + 1))) {
                    resp += 1;
                }
                num1 = num1 / 10;
            }
            if (resp == larg) {
                fin = true;
            } else {
                fin = false;
            }
            return fin;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de presos en ronda, contemplando al
     * primer preso que se sienta, como el preso 0. A los presos se le repartira
     * una m cantidad de caramelos contemplando que se comenzaran a repartir los
     * caramelos desde el primer preso (inicio). El ultimo caramelo en
     * repartirse estara podrido, determinar a que preso, segun su posicion en
     * la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadPresos
     * @return presoQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadPresos) {
        //Aca escribir la logica necesaria
        int resp = 0;
        try {
            resp = cantidadCaramelos % cantidadPresos;
            resp = resp + inicio;
            if (resp > cantidadPresos) {
                resp = resp - cantidadPresos;
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        return resp - 1;
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :( List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        //Aca escribir la logica necesaria
        List<String> amigas = new ArrayList();

        try {
            for (int i = 0; i < pasajeros.size(); i++) {
                for (int j = i + 1; j < pasajeros.size(); j++) {
                    if (pasajeros.get(i).equals(pasajeros.get(j))) {
                        amigas.add(pasajeros.get(i));
                        break;
                    }
                }
            }
            for (int i = 0; i < amigas.size(); i++) {
                for (int j = i+1; j < amigas.size(); j++) {
                    if(amigas.get(i).equals(amigas.get(j))){
                        amigas.remove(j);
                    }
                }
            }
            Collections.sort(amigas);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        return amigas;
    }
}
