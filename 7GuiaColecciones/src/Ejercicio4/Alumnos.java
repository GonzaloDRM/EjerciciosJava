
package Ejercicio4;

public class Alumnos {
    
    private String nombre;
    private Integer legajo;
    private String sexo;
    private String condicion;
    private Integer nota;

    public Alumnos(String nombre, Integer legajo, String sexo, String condicion, Integer nota) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sexo = sexo;
        this.condicion = condicion;
        this.nota = nota;
    }
    
    public Alumnos(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", legajo=" + legajo + ", sexo=" + sexo + ", condicion=" + condicion + ", nota=" + nota + '}';
    }
        
}
