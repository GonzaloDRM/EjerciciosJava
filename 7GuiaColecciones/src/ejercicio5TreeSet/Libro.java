
package ejercicio5TreeSet;

public class Libro implements Comparable<Libro>{
    
    private String nombre;
    private String autor;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;
    private int ejemplaresTotales;

    public Libro(String nombre, String autor, int ejemplaresDisponibles, int ejemplaresPrestados, int ejemplaresTotales) {
        this.nombre = nombre;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    @Override
    public String toString() {
        return "Libro{" + "Nombre = " + nombre + ", Autor = " + autor + ", Ejemplares Disponibles = " + ejemplaresDisponibles + ", Ejemplares Prestados = " + ejemplaresPrestados + ", ejemplaresTotales=" + ejemplaresTotales + '}';
    }

    @Override
    public int compareTo(Libro o) {
        return this.nombre.compareTo(o.getNombre());
    }
   
}
