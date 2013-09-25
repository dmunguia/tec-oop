package ac.tec.oop.colecciones;

import java.util.*;

/**
 * User: diegomunguia
 */
public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("164003476", "Juan Perez"));
        personas.add(new Persona("109684896", "Juan Román Riquelme"));
        personas.add(new Persona("185483556", "Diego Maradona"));

        Collections.sort(personas);
    }
}
