package ac.tec.oop.gc;

/**
 * User: diegomunguia
 */
public class ElObjeto {
    private String mensaje = "el tiempo pasa pronto y todo tiene su final";

    public String getMensaje() {
        return mensaje;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Me fuí con las botas puestas ...");
    }
}
