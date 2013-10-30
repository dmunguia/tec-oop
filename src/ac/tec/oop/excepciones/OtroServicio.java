package ac.tec.oop.excepciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OtroServicio {
    public void otroMetodo() throws MiExcepcion {
        ServicioTablas servicioTablas = new ServicioTablas();
        servicioTablas.insertar();
    }

    public void crearListas(String nombre) {
        Map<String, List<Integer>> mapa = new HashMap<String, List<Integer>>();
        mapa.put(nombre, new ArrayList<Integer>());
    }
}
