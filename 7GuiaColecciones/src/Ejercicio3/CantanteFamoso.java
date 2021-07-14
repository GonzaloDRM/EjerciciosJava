
package Ejercicio3;

import java.util.HashMap;
import java.util.Map;

public class CantanteFamoso {
    
    private Map<String, String> cantantes = new HashMap();

    public Map<String, String> getCantantes() {
        return cantantes;
    }

    public void setCantantes(Map<String, String> cantantes) {
        this.cantantes = cantantes;
    }
    
    public void AgregarDiscos(String Cantantes, String discos){
        cantantes.put(Cantantes, discos);
    }
    
}
