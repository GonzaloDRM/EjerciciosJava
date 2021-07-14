
package Ejercicio5;

public class Televisor extends Electrodomestico{

    private int pulgadas = 20;
    private boolean sintonizador = false;

    public Televisor() {
    }

    public Televisor(int precioBase, String color, String consum, int peso) {
        super(precioBase, color, consum, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public double tvFinal(){
        super.precioFinal();
        if(sintonizador=true){
            precioFinal += 500;
        }else if(pulgadas>40){
            precioFinal += (precioFinal * 0.3);
        }else if (sintonizador=true && pulgadas>40){
            precioFinal += (getPrecioFinal() * 0.3) + 500;
        }else{
            precioFinal += 0;
        } 
        return precioFinal;
    }
    
    @Override
    public String toString() {
        return "Televisor{" + ", pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + ", precioBase=" + precioBase + ", color=" + color + ", consum=" + consum + ", peso=" + peso + ", precioFinal=" + precioFinal + '}';
    }
}
