
package Objetos;

public class Hotel3est extends Alojamiento {
    
    protected int habitaciones;
    protected int camas;
    protected int pisos;

    public Hotel3est() {
    }

    public Hotel3est(int habitaciones, int camas, int pisos) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
    }

    public Hotel3est(int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String encargado, int precio) {
        super(nombre, direccion, localidad, encargado, precio);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Hotel3est{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + '}';
    }
    
}
