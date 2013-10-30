package ac.tec.oop.excepciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ServicioTablas {

    public void insertar() throws MiExcepcion {
        Set<String> columnasEnRegistro = new HashSet<String>();
        columnasEnRegistro.add("email");
        columnasEnRegistro.add("clave");

        List<String> columnasEnTabla = new ArrayList<String>();
        columnasEnTabla.add("email");
        columnasEnTabla.add("clave");
        columnasEnTabla.add("nombre");

        if (!columnasEnRegistro.containsAll(columnasEnTabla)) {
            throw new MiExcepcion("Registro incompleto");
        }
    }

}
