/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las
notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado se obtienen 4 notas, 2
por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada
nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 70% de sus notas del curso.
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double array[] = new double[10];
        double tp1,tp2,int1,int2;
        
        for (int i=0;i<=9;i++){
            System.out.println("Ingrese las notas del tp1,tp2,int1 e int2 del " + (i+1) + " alumno");
            tp1 = sc.nextDouble();
            if(tp1>=10.01 || tp1<0){
                System.out.println("La nota tiene que ser entre 1 y 10");
                do {
                    tp1 = sc.nextDouble();
                }while ((tp1>=10.01 || tp1<0));
            }
            tp2 = sc.nextDouble();
            if(tp2>=10.01 || tp2<0){
                System.out.println("La nota tiene que ser entre 1 y 10");
                do {
                    tp2 = sc.nextDouble();
                }while ((tp2>=10.01 || tp2<0));
            }
            int1 = sc.nextDouble();
            if(int1>=10.01 || int1<0){
                System.out.println("La nota tiene que ser entre 1 y 10");
                do {
                    int1 = sc.nextDouble();
                }while ((int1>=10.01 || int1<0));
            }
            int2 = sc.nextDouble();
            if(int2>=10.01 || int2<0){
                System.out.println("La nota tiene que ser entre 1 y 10");
                do {
                    int2 = sc.nextDouble();
                }while ((int2>=10.01 || int2<0));
            }
            array[i] = (tp1*0.1) + (tp2*0.15) + (int1*0.25) + (int2*0.5);
        }      
                
        for(int i=0;i<=9;i++){
            if(array[i]>=7){
                System.out.print("Aprobado: ");
            }
            else {
                System.out.print("Desaprobado: ");
            }
            System.out.println(array[i]);
        }
    }
}
