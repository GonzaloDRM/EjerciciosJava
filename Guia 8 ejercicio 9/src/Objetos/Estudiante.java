
package Objetos;

public class Estudiante extends Persona{
    
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String curso, String nombre, int dni, String estCivil) {
        super(nombre, dni, estCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", dni=" + dni + ", estCivil=" + estCivil + "curso=" + curso + '}';
    }
    
}
