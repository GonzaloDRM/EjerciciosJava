
package Objetos;

public class Hotel5est extends Hotel4est{
    
    private int salonesConf;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5est() {
    }

    public Hotel5est(int salonesConf, int cantSuites, int cantLimosinas) {
        this.salonesConf = salonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5est(int salonesConf, int cantSuites, int cantLimosinas, boolean gimnasio, String nombreRest, int capacidadRest) {
        super(gimnasio, nombreRest, capacidadRest);
        this.salonesConf = salonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5est(int salonesConf, int cantSuites, int cantLimosinas, boolean gimnasio, String nombreRest, int capacidadRest, int habitaciones, int camas, int pisos) {
        super(gimnasio, nombreRest, capacidadRest, habitaciones, camas, pisos);
        this.salonesConf = salonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5est(int salonesConf, int cantSuites, int cantLimosinas, boolean gimnasio, String nombreRest, int capacidadRest, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String encargado, int precio) {
        super(gimnasio, nombreRest, capacidadRest, habitaciones, camas, pisos, nombre, direccion, localidad, encargado, precio);
        this.salonesConf = salonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5est{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + ", precio=" + precio + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capacidadRest=" + capacidadRest + "salonesConf=" + salonesConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }
    
}
