
package Ejercicio6;

import java.util.Date;

public class Cliente {
    
    private String nombre;
    private int dni;
    private Date fechaAlq;
    private Date fechaFin;
    private String posAmarre;
    private Barco barco;

    public Cliente() {
    }

    public Cliente(String nombre, int dni, Date fechaAlq, Date fechaFin, String posAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaFin = fechaFin;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", fecha de alquiler=" + fechaAlq + ", fecha de finalizacion=" + fechaFin + ", posicion del amarre=" + posAmarre + ", barco=" + barco + '}';
    }
    
}
