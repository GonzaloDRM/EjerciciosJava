/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int suma1,suma2,suma3,suma4,suma5;
        suma1=0;
        suma2=0;
        suma3=0;
        suma4=0;
        suma5=0;
        
        System.out.println("Ingrese cuantos numeros tendrá el vector");
        int v = sc.nextInt();
        int vector[] = new int[v];
        System.out.println("Ingrese los numeros del vector");
        for(int i=0;i<=v-1;i++){
            vector[i]= sc.nextInt();
        }
        
        for (int i=0;i<=v-1;i++){
            if (vector[i]>=0 && vector[i]<10){
                suma1=suma1+1;
            }
            else if (vector[i]>=10 && vector[i]<100){
                suma2=suma2+1;
            }
            else if (vector[i]>=100 && vector[i]<1000){
                suma3=suma3+1;
            }
            else if (vector[i]>=1000 && vector[i]<10000){
                suma4=suma4+1;
            }
            else if (vector[i]>=10000){
                suma5=suma5+1;
            }
        }
        
        System.out.println("Hay " + suma1 + " de 1 digitos y " + suma2 + " de 2 digitos " +
                suma3 + " de 3 digitos " + suma4 + " de 4 digitos y " + suma5 + " de mas de 5 digitos");     
        
        for (int i=0;i<=v-1;i++){
            System.out.print(vector[i] + ",");
        }

    }
}
