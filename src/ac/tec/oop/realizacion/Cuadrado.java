package ac.tec.oop.realizacion;

public class Cuadrado extends Rectangulo
        implements FiguraGeometrica, Comparable<Cuadrado> {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public int compareTo(Cuadrado cuadrado) {
        return Double.compare(lado, cuadrado.getLado());
    }


    @Override
    public void dibujar() {
        System.out.println("dibujando....");
    }
}
