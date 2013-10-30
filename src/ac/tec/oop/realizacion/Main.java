package ac.tec.oop.realizacion;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(10);
        FiguraGeometrica figuraGeometrica = cuadrado;
        Object object = cuadrado;
        Rectangulo rectangulo = cuadrado;
        Comparable<Cuadrado> comparable = cuadrado;
        Dibujable dibujable = cuadrado;
    }

}
