
package Objetos;

public class Profesor extends Persona{
    
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String departamento, String nombre, int dni, String estCivil) {
        super(nombre, dni, estCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", dni=" + dni + ", estCivil=" + estCivil + "departamento=" + departamento + '}';
    }
    
}
