
package Objetos;

public class Hotel4est extends Hotel3est{
    
    protected boolean gimnasio;
    protected String nombreRest;
    protected int capacidadRest;

    public Hotel4est() {
    }

    public Hotel4est(boolean gimnasio, String nombreRest, int capacidadRest) {
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public Hotel4est(boolean gimnasio, String nombreRest, int capacidadRest, int habitaciones, int camas, int pisos) {
        super(habitaciones, camas, pisos);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public Hotel4est(boolean gimnasio, String nombreRest, int capacidadRest, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String encargado, int precio) {
        super(habitaciones, camas, pisos, nombre, direccion, localidad, encargado, precio);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public String toString() {
        return "Hotel4est{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capacidadRest=" + capacidadRest + '}';
    }
    
}
