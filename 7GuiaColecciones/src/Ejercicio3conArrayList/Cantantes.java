
package Ejercicio3conArrayList;

import java.util.ArrayList;
import java.util.List;

public class Cantantes {
    
    private List<String> CantantesyDiscos = new ArrayList();

    public List<String> getCantantesyDiscos() {
        return CantantesyDiscos;
    }

    public void setCantantesyDiscos(List<String> CantantesyDiscos) {
        this.CantantesyDiscos = CantantesyDiscos;
    }
    
    public void Agregar(String cosas){
        CantantesyDiscos.add(cosas);
    }
    
}
