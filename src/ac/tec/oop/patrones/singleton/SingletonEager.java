package ac.tec.oop.patrones.singleton;

public class SingletonEager {
    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager obtenerInstancia() {
        return instancia;
    }

}
