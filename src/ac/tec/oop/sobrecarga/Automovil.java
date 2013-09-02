package ac.tec.oop.sobrecarga;

/**
 * User: diegomunguia
 */
public class Automovil {
    private float direccion;

    public void girar(float angulo) {
        this.direccion = angulo;
    }

    public void girar(Direccion direccion) {
        switch (direccion) {
            case IZQUIERDA:
                this.direccion += -90.0f;
                break;

            case DERECHA:
                this.direccion += 90.0f;

        }
    }
}
