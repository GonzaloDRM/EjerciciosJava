/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
pasar que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).
El cambio de divisas son:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double dnr,libra,dolar,yene;
        String mon;
        libra=0;
        dolar=0;
        yene=0;
        
        System.out.println("Cuanto dinero desea convertir");
        dnr = sc.nextInt();
        
        System.out.println("A que moneda hacer el cambio? libras, dolares o yenes?");
        mon = sc.next();
        
        switch(mon.toLowerCase()){
            case "libras": System.out.println(libras (dnr,libra));
                break;
            case "dolares": System.out.println(dolares (dnr,dolar));
                break;
            case "yenes": System.out.println(yenes (dnr, yene)); 
                break;
        }  
    }
    
    public static double libras (double dnr, double libra){
        
        libra = dnr * 0.86;
        return libra;
        
    }
    public static double dolares (double dnr,double dolar){
        
        dolar = dnr * 1.28611;
        return dolar;
    }
    public static double yenes (double dnr,double yene){
        
        yene = dnr * 129.852;
        return yene;
    }
}
