/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int matriz[][] = new int[3][3];
        int l,suma1,suma2,suma3,suma4,suma5,suma6,suma7,suma8,total;
        suma1=0;
        suma2=0;
        suma3=0;
        suma4=0;
        suma5=0;
        suma6=0;
        suma7=0;
        suma8=0;
        l=2;
        total=0;
        
        System.out.println("Ingrese los numeros en la matriz");
        for (int i=0;i<=2;i++){
            for (int k=0;k<=2;k++){
                matriz[i][k]=sc.nextInt();
            }
        }
        
        for (int i=0;i<=2;i++){
            suma1=suma1+matriz[0][i];
            suma2=suma2+matriz[1][i];
            suma3=suma3+matriz[2][i];
            suma4=suma4+matriz[i][0];
            suma5=suma5+matriz[i][1];
            suma6=suma6+matriz[i][2];
            suma7=suma7+matriz[i][i];
            suma8=suma8+matriz[i][l];
            l=l-1;
        }
        if(suma1==suma2){
            total=total+1;
        }
        if(suma1==suma3){
            total=total+1;
        }
        if(suma1==suma4){
            total=total+1;
        }
        if(suma1==suma5){
            total=total+1;
        }
        if(suma1==suma6){
            total=total+1;
        }
        if(suma1==suma7){
            total=total+1;
        }
        if(suma1==suma8){
            total=total+1;
        }
        if (total==7){
            System.out.println("Es un cubo magico");
        }
        else {
            System.out.println("No es un cubo magico");
        }        
    }
}
