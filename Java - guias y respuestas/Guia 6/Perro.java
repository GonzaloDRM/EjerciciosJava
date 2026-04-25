
package eggpoo;


class Perro {
    
    //ATRIBUTOS
    
    private String apodo;
    private Integer peso; // int
    private Boolean cola;
    private String raza;

    //CONSTRUCTORES
    public Perro(String apodo, Integer peso, Boolean cola, String raza) {
        this.apodo = apodo;
        this.peso = peso;
        this.cola = cola;
        this.raza = raza;
    }

    public Perro() {
    }
    
    //SETTER
    public void setApodo(String apodo){ //SETEA(modifica) EL VALOR DEL ATRIBUTO APODO
        this.apodo = apodo;
    }
    
    //GETTER
    public String getApodo(){
        return apodo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
 public String toString() {
        return "Datos: " + "apodo=" + apodo + ", peso=" + peso + ", cola=" + cola + ", raza=" + raza;
    }


}