package ac.tec.oop.modstatic;

/**
 * User: diegomunguia
 */
public class Automovil {

    private static int ultimaPlaca = 1;

    public static int obtenerSiguientePlaca() {
        return ultimaPlaca;
    }

    private int placa;

    public Automovil() {
        placa = ultimaPlaca++;
    }

    public int getPlaca() {
        return placa;
    }
}
