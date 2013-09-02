/**
 * User: diegomunguia
 */
public class Quiz1B {
    public static void main(String[] args) {
        String[] a = new String[] {"rojo", "azul", "verde", "gris"};
        String b = new String("verde");

        int i = 0;
        int j = -1;
        for (String s : a) {
            if (b.equals(s)) {
                j = i;
                break;
            }
            ++i;
        }

        System.out.println("j = " + j);
    }
}
