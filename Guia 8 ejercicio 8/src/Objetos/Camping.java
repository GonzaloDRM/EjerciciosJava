
package Objetos;

public class Camping extends ExtraHotelero{
    
    private int carpas;
    private int banos;
    private boolean rest;

    public Camping() {
    }

    public Camping(int carpas, int banos, boolean rest) {
        this.carpas = carpas;
        this.banos = banos;
        this.rest = rest;
    }

    public Camping(int carpas, int banos, boolean rest, boolean privado, int metros) {
        super(privado, metros);
        this.carpas = carpas;
        this.banos = banos;
        this.rest = rest;
    }

    public Camping(int carpas, int banos, boolean rest, boolean privado, int metros, String nombre, String direccion, String localidad, String encargado, int precio) {
        super(privado, metros, nombre, direccion, localidad, encargado, precio);
        this.carpas = carpas;
        this.banos = banos;
        this.rest = rest;
    }

    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    @Override
    public String toString() {
        return "Camping{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + "privado=" + privado + ", metros=" + metros + "carpas=" + carpas + ", banos=" + banos + ", rest=" + rest + '}';
    }

    
}
