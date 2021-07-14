/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int matriz1[][] = new int[10][10];
        int matriz2[][] = new int[3][3];
        int total,f,g;
        boolean fin;
        String punto;
        total=0;
        fin=false;
        
        for(int i=0;i<=9;i++){
            for(int k=0;k<=9;k++){
                matriz1[i][k]=(int)(Math.random()*10);
                System.out.print(matriz1[i][k] + ",");
            }
            System.out.println("");
        }
        System.out.println("Ingrese el cuadrado de 3x3");
        for(int i=0;i<=2;i++){
            for(int k=0;k<=2;k++){
                matriz2[i][k]=sc.nextInt();
            }
        }
        
        for(int i=0;i<=7;i++){
            for(int k=0;k<=7;k++){
                if(matriz1[i][k]==matriz2[0][0]){   
                    for(int o=0;o<=2;o++){
                        for(int p=0;p<=2;p++){                           
                            if(matriz1[(i+o)][(k+p)]==matriz2[o][p]){
                                total=total+1;
                                if (total==9){
                                   System.out.println("En el punto " + (i) + "," + (k) + " es donde empezó la similitud");
                                   fin=true;
                                }
                            }
                        }
                    }
                    total=0;
                }
            }
        } 
        if (fin==false){
            System.out.println("No se encontro ninguna similitud");
        }
    }
}
