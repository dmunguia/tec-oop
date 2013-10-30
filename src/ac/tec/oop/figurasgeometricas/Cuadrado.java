package ac.tec.oop.figurasgeometricas;

/**
 * User: diegomunguia
 */
public class Cuadrado implements FiguraGeometrica, Comparable {
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

    @Override
    public int compareTo(Object o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dibujar() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
