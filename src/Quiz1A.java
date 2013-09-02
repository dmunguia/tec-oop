/**
 * User: diegomunguia
 */
public class Quiz1A {
    public static void main(String[] args) {
        byte x = 1;

        for (int i = 1; i <= 50; i++) {
            x += i % 10 == 0 ? i : 0;
        }

        System.out.println("x = " + x);
    }
}
