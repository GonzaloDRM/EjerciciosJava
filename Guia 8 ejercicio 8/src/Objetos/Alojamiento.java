
package Objetos;

public abstract class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String encargado;
    protected int precio;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String encargado, int precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + '}';
    }
    
}
