
package Objetos;

public class Residencia extends ExtraHotelero{
    
    private int habitaciones;
    private boolean descuentos;
    private boolean campoDep;

    public Residencia() {
    }

    public Residencia(int habitaciones, boolean descuentos, boolean campoDep) {
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public Residencia(int habitaciones, boolean descuentos, boolean campoDep, boolean privado, int metros) {
        super(privado, metros);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public Residencia(int habitaciones, boolean descuentos, boolean campoDep, boolean privado, int metros, String nombre, String direccion, String localidad, String encargado, int precio) {
        super(privado, metros, nombre, direccion, localidad, encargado, precio);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDep() {
        return campoDep;
    }

    public void setCampoDep(boolean campoDep) {
        this.campoDep = campoDep;
    }

    @Override
    public String toString() {
        return "Residencia{"+ "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + "privado=" + privado + ", metros=" + metros + "habitaciones=" + habitaciones + ", descuentos=" + descuentos + ", campoDep=" + campoDep + '}';
    }
    
    
}
