package ac.tec.oop.sobreescritura;

/**
 * User: diegomunguia
 */
public class Main {
    public static void main(String[] args) {
        PoligonoRegular poligonoRegular = new PoligonoRegular(10d, 4);
        Cuadrado cuadrado = new Cuadrado(10d);

        double area = 0.0d;

        long tiempo = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            area = poligonoRegular.calcularArea();
        }
        tiempo = System.currentTimeMillis() - tiempo;

        System.out.println("area = " + area);
        System.out.println("tiempo PoligonoRegular = " + tiempo);

        tiempo = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            cuadrado.calcularArea();
        }
        tiempo = System.currentTimeMillis() - tiempo;

        System.out.println("area = " + area);
        System.out.println("tiempo Cuadrado = " + tiempo);
    }
}
