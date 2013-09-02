package ac.tec.oop.visibilidad.otropaquete;

import ac.tec.oop.visibilidad.Secretos;

/**
 * User: diegomunguia
 */
public class Fisgon {
    public void fisgonear(boolean detenerme) {
        if (detenerme) {
            return;
        }
        Secretos secretos = new Secretos();
        String yaLoVi = secretos.mensaje;

        secretos.revisarMiMensaje();

    }
}
