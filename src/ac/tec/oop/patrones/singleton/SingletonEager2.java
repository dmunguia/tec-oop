package ac.tec.oop.patrones.singleton;

public class SingletonEager2 {
    private static final SingletonEager2 instancia;

    static {
        try {
            instancia = new SingletonEager2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private SingletonEager2() throws Exception {}

    public static SingletonEager2 obtenerInstancia() {
        return instancia;
    }
}
