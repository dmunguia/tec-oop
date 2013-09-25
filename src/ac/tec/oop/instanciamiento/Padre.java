package ac.tec.oop.instanciamiento;

/**
 * User: diegomunguia
 */
public class Padre extends Abuelo {

    protected byte octeto;
    protected boolean booleano = true;
    private int entero = 1;

    {
        System.out.println("Ejecutando bloque inicializador de Padre");
        booleano = !booleano;
    }

    public Padre() {
        System.out.println("Ejecutando el constructor de Padre");
        this.octeto = 5;
    }

    public void saludar() {
        super.saludar();
        System.out.println("Hola, soy el padre");
    }

}
