package ac.tec.oop.instanciamiento;

/**
 * User: diegomunguia
 */
public class Hijo extends Padre {

    private double doble;
    private int entero = 128;
    private long[] arreglo = new long[5];
    private short enteroChico = super.enteroChico;

    {
        enteroChico = 125;
        System.out.println("Ejecutando el bloque inicializador de Hijo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo.length - i;
        }
    }

    public Hijo() {
        this.paquete = 5;
        System.out.println("Ejecutando el constructor de Hijo");
        this.doble = 1.0 / 3.0;
    }
}
