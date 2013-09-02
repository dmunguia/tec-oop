package ac.tec.oop.gc;

/**
 * User: diegomunguia
 */
public class Main {
    public static void main(String[] args) {
        ElObjeto elObjeto = new ElObjeto();
        System.out.println("elObjeto.getMensaje() = " + elObjeto.getMensaje());
        elObjeto = null;

        System.gc();
    }
}
