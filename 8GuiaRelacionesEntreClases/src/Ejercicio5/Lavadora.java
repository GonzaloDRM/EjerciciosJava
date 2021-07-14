
package Ejercicio5;

public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora(int carga, int precioBase, String color, String consum, int peso) {
        super(precioBase, color, consum, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double lavFinal(){
        super.precioFinal();
        if(carga>30){
            precioFinal += 500;
        }else{
            precioFinal += 0;
        }  
        return precioFinal;
    }
    
    @Override
    public String toString() {
        return "Lavadora{" + ", carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consum=" + consum + ", peso=" + peso + ", precioFinal=" + precioFinal + '}';
    }
    
}
