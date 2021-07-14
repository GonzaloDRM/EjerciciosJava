/*
 Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
1 día, 2 horas y 40 minutos.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int minutos,dias,horas;
        System.out.println("Escribir la cantidad de minutos");
        minutos = sc.nextInt();
        
        dias=minutos/1440;
        horas=(int) (minutos-(Math.floor(dias)*1440))/60;
        
        System.out.println(minutos + " Es equivalente a " +  Math.floor(dias) + " Dias " + Math.floor(horas) + " horas " 
        + (minutos-(Math.floor(dias)*1440)-(Math.floor(horas)*60)));
        
    }
    
}
