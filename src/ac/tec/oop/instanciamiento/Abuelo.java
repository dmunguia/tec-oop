package ac.tec.oop.instanciamiento;

/**
 * User: diegomunguia
 */
public class Abuelo {

    protected short enteroChico = -1;
    private String secretoOscuro = "buajajaja";
    int paquete = 1;

    {
        System.out.println("Ejecutando bloque inicializador de Abuelo");
        enteroChico = 1;
    }

    public Abuelo() {
        System.out.println("Ejecutando el constructor de Abuelo");
    }

    public void saludar() {
        System.out.println("Hola, soy el abuelo");
    }
}
