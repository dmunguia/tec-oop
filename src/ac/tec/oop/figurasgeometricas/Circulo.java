package ac.tec.oop.figurasgeometricas;

/**
 * User: diegomunguia
 */
public class Circulo implements FiguraGeometrica {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return 3.14 * radio * radio;
    }

    @Override
    public void dibujar() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
