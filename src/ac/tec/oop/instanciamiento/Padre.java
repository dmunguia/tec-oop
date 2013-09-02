package ac.tec.oop.instanciamiento;

/**
 * User: diegomunguia
 */
public class Padre extends Abuelo {

    protected byte octeto;
    protected boolean booleano = true;

    {
        System.out.println("Ejecutando bloque inicializador de Padre");
        booleano = !booleano;
    }

    public Padre() {
        System.out.println("Ejecutando el constructor de Padre");
        this.octeto = 5;
    }
}
