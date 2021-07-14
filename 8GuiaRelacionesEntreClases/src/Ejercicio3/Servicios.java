package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Servicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public List<Carta> llenarMazo() {
        List<Carta> mazo = new ArrayList();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                Carta cart = new Carta();
                if (i < 9 && i > 6) {
                    break;
                } else {
                    switch (j + 1) {
                        case 1:
                            cart.setNumero(i + 1);
                            cart.setPalos(Palos.BASTO);
                            break;
                        case 2:
                            cart.setNumero(i + 1);
                            cart.setPalos(Palos.COPA);
                            break;
                        case 3:
                            cart.setNumero(i + 1);
                            cart.setPalos(Palos.ESPADA);
                            break;
                        case 4:
                            cart.setNumero(i + 1);
                            cart.setPalos(Palos.ORO);
                            break;
                    }
                    mazo.add(cart);
                }
            }
        }
        int resp;
        do {
            System.out.println("Señale la opcion que desee");
            System.out.println("1 - Imprimir mazo");
            System.out.println("2 - Mezclar");
            System.out.println("3 - Repartir cartas");
            System.out.println("4 - Siguiente carta");
            System.out.println("5 - Mostra la cantidad de cartas que quedan por repartir");
            System.out.println("9 - Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    imprimir(mazo);
                    break;
                case 2:
                    mezclar(mazo);
                    break;
                case 3:
                    repartirCartas(mazo);
                    break;
                case 4:
                    siguienteCarta(mazo);
                    break;
                case 5:
                    cartasPorRepartir(mazo);
                    break;
                case 9:
                    break;
            }

        } while (resp != 9);
        return mazo;
    }

    public void imprimir(List<Carta> mazo) {
        for (Carta i : mazo) {
            System.out.println(i);
        }
    }

    public List<Carta> mezclar(List<Carta> mazo) {
        Collections.shuffle(mazo);
        return mazo;
    }

    public void repartirCartas(List<Carta> mazo) {
        if (mazo.size() <= 7) {
            System.out.println("No quedan suficientes cartas en el mazo");
        }else {
            System.out.println("Al jugador 1 le toco las siguientes cartas");
            for (int i = 0; i < 3; i++) {
                System.out.print(mazo.get(i).toString());
            }
            System.out.println("");
            System.out.println("Al jugador 2 le toco las siguientes cartas");
            for (int i = 3; i < 6; i++) {
                System.out.print(mazo.get(i).toString());
            }
            for (int i = 0; i < 6; i++) {
                mazo.remove(i);
            }
        }
    }

    public void siguienteCarta(List<Carta> mazo) {
        if (mazo.size() <= 0) {
            System.out.println("No quedan mas cartas en el mazo");
        }else {
            System.out.println("La siguiente carta es " + mazo.get(0).toString());
            mazo.remove(0);
        }
    }
    
    public void cartasPorRepartir(List<Carta> mazo){
        System.out.println("Quedan " + mazo.size() + " en el mazo");
    }

}
