package ac.tec.oop.quiz3;

/**
 * User: diegomunguia
 */
public class ElProcesamiento {
    public void procesar(ElObjeto elObjeto) {
        int x = elObjeto.elProtected;
        System.out.println("elObjeto.getMensaje() = " + elObjeto.getMensaje());
    }
}
