package ac.tec.oop.patrones.singleton;

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {}

    public static SingletonLazy obtenerInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
