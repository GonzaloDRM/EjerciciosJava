
package Objetos;

public abstract class ExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected int metros;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int metros) {
        this.privado = privado;
        this.metros = metros;
    }

    public ExtraHotelero(boolean privado, int metros, String nombre, String direccion, String localidad, String encargado, int precio) {
        super(nombre, direccion, localidad, encargado, precio);
        this.privado = privado;
        this.metros = metros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + "privado=" + privado + ", metros=" + metros + '}';
    }

    
}
