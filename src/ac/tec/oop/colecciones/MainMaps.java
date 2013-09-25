package ac.tec.oop.colecciones;

import java.util.*;

/**
 * User: diegomunguia
 */
public class MainMaps {
    public static void main(String[] args) {
        Map<String, String> persona =
                new HashMap<String, String>();

        persona.put("nombre", "Juan Perez");
        persona.put("edad", "12");
        persona.put("fechaNacimiento", new Date().toString());

        String edad = persona.get("edad");
        System.out.println("edad = " + edad);

        Set<Map.Entry<String, String>> entries = persona.entrySet();
        Iterator<Map.Entry<String, String>> iterador = entries.iterator();

        while (iterador.hasNext()) {
            Map.Entry<String, String> entry = iterador.next();
            String llave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("llave = " + llave + ", valor = " + valor);
        }
    }
}
