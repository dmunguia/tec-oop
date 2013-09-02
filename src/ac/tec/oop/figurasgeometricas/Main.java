package ac.tec.oop.figurasgeometricas;

/**
 * User: diegomunguia
 */
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(1);
        FiguraGeometrica cuadrado = new Cuadrado(5);

        new Circulo(5).radio++;

        FiguraGeometrica[] figuras = new FiguraGeometrica[] {
                circulo, cuadrado
        };

        for (FiguraGeometrica figura : figuras) {
            double area = figura.area();
            System.out.println("area = " + area);
        }




        /*
        PoligonoRegular triangulo = new PoligonoRegular(3, 10);
        int p = triangulo.perimetro();
        System.out.println("triangulo.perimetro() = " + p);
        // 30

        triangulo.setNumeroLados(4);
        p = triangulo.perimetro();
        System.out.println("triangulo.perimetro() = " + p);
        // 20
        */
    }
}
