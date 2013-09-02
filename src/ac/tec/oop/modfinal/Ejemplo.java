package ac.tec.oop.modfinal;

/**
 * User: diegomunguia
 */
public class Ejemplo {
    public static void main(String[] args) {
        final int noMeCambies = 5;
//        noMeCambies = 6; // error
    }

    private final int x = 0;
    public void setX(int x) {
//        this.x = x; // error
    }
}
