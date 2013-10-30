package ac.tec.oop.excepciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaCheckedException {
    public static void main(String[] args) {
        try {
            OtroServicio otroServicio = new OtroServicio();
            otroServicio.otroMetodo();
        } catch (MiExcepcion miExcepcion) {
            System.out.println("Error de sistema, registro invalido");
            // guardar en bitacora

            miExcepcion.printStackTrace();

            System.exit(1);
        }
    }


}
