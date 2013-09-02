package ac.tec.oop.sobreescritura;

/**
 * User: diegomunguia
 */
public class PoligonoRegular {

    protected double lado;
    protected int numeroLados;

    public PoligonoRegular(double lado, int numeroLados) {
        this.lado = lado;
        this.numeroLados = numeroLados;
    }

    public double calcularArea() {
        return (numeroLados * (lado * lado)) / (4.0d * Math.tan(Math.toRadians(180.0d / numeroLados)));
    }
}
