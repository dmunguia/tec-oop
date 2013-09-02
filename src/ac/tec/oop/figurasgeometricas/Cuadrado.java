package ac.tec.oop.figurasgeometricas;

/**
 * User: diegomunguia
 */
public class Cuadrado implements FiguraGeometrica {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
