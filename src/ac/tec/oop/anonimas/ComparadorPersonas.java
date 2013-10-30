package ac.tec.oop.anonimas;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona> {
    @Override
    public int compare(Persona persona, Persona persona2) {
        return persona.getIdentificacion()
                .compareTo(persona2.getIdentificacion());
    }
}
