package ac.tec.oop.figurasgeometricas;

/**
 * User: diegomunguia
 */
public class PoligonoRegular {

    private int numeroLados;
    private int lado;

    public PoligonoRegular(int numeroLados, int lado) {
        this.numeroLados = numeroLados;
        this.lado = lado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        if (numeroLados < 3) {
            throw new RuntimeException("El polígono debe tener como mínimo tres lados");
        }
        this.numeroLados = numeroLados;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int perimetro() {
        return lado * numeroLados;
    }
}
