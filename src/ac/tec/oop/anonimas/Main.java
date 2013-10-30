package ac.tec.oop.anonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<Persona>();

        Persona p1 = new Persona("1","Juan","Perez");
        Persona p2 = new Persona("3","Pedro","Perez");
        Persona p3 = new Persona("2","Pablo","Perez");

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona persona2) {
                return persona.getNombre().compareTo(persona2.getNombre());
            }
        });

        for (Persona persona : personas) {
            System.out.println("persona.getNombre" + persona.getNombre());
        }
    }
}
