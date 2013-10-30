package ac.tec.oop.excepciones;

public class MiExcepcion extends Exception {
    public MiExcepcion() {
        super();
    }

    public MiExcepcion(String message) {
        super(message);
    }

    public MiExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public MiExcepcion(Throwable cause) {
        super(cause);
    }

    public MiExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
