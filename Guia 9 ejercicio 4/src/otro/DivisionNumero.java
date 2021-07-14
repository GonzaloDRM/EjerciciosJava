
package otro;

import java.util.InputMismatchException;

public class DivisionNumero {
    
    public static void pasar(String num1, String num2){
        int r1, r2, r3;
        
        try {
            r1 = Integer.parseInt(num1);
            r2 = Integer.parseInt(num2);
            r3 = r1/r2;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println("No se puede dividir por 0...");
        } catch (InputMismatchException d){
            System.out.println(d.getClass().getSimpleName());
            System.out.println("Hay que escribir un numero y no una letra...");
        } catch (NumberFormatException f){
            System.out.println(f.getClass().getSimpleName());
            System.out.println("Hay que escribir un numero y no una letra...");
        }      
    }
}
