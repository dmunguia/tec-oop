package ac.tec.oop.quiz3;

/**
 * User: diegomunguia
 */
public class ElObjeto {
    private String mensaje = "el tiempo pasa pronto y todo tiene su final";
    protected int elProtected;

    public String getMensaje() {
        return mensaje;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Me fuí con las botas puestas ...");
    }
}
