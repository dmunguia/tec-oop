package ac.tec.oop.modstatic;

/**
 * User: diegomunguia
 */
public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        Automovil auto3 = new Automovil();

        System.out.println("auto1.getPlaca() = " + auto1.getPlaca()); // 1
        System.out.println("auto2.getPlaca() = " + auto2.getPlaca()); // 2
        System.out.println("auto3.getPlaca() = " + auto3.getPlaca()); // 3

        int siguientePlaca = Automovil.obtenerSiguientePlaca();
        System.out.println("siguientePlaca = " + siguientePlaca); // 4
    }
}
