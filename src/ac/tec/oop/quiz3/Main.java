package ac.tec.oop.quiz3;

/**
 * User: diegomunguia
 */
public class Main {
    public static void main(String[] args) {
        ElObjeto elObjeto = new ElObjeto();
        if (elObjeto != null) {
            ElProcesamiento elProcesamiento = new ElProcesamiento();
            elProcesamiento.procesar(elObjeto);
            elObjeto = null;
        }

        System.gc();
    }

}
