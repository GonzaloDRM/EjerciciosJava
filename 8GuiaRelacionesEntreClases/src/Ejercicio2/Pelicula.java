
package Ejercicio2;

public class Pelicula {
    
    private String titulo;
    private Double duracion;
    private int edadmin;
    private String director;

    public Pelicula(String titulo, Double duracion, int edadmin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadmin = edadmin;
        this.director = director;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadmin=" + edadmin + ", director=" + director + '}';
    }
    
}
