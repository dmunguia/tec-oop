package ac.tec.oop.modfinal;

/**
 * User: diegomunguia
 */
public class Circulo {
    private static final double PI = 3.14d;

    private double radio;

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2.0d * PI * radio;
    }
}
