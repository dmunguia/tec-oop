package ac.tec.oop.sobreescritura;

/**
 * User: diegomunguia
 */
public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado) {
        super(lado, 4);
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
