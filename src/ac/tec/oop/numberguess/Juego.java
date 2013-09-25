package ac.tec.oop.numberguess;

import java.util.Random;

/**
 * User: diegomunguia
 */
public class Juego {
    private int intentos;
    private int secreto;
    private int maxRango;
    private int minRango;
    private boolean haAdivinado = false;

    private String hilera = "hello world!";

    public String getHilera() {
        return hilera;
    }

    public void setHilera(String hilera) {
        this.hilera = hilera;
    }

    public Juego() {
        this.intentos = 3;
        this.maxRango = 10;
        this.minRango = 1;
        generarSecreto();
    }

    public Juego(int intentos, int maxRango, int minRango) {
        if (minRango > maxRango) {
            throw new RuntimeException(); // raise ValueError
        }
        this.intentos = intentos;
        this.maxRango = maxRango;
        this.minRango = minRango;
        generarSecreto();
    }

    private void generarSecreto() {
        Random random = new Random(System.currentTimeMillis());
        this.secreto = random.nextInt(maxRango - minRango + 1)
                + minRango;
    }

    public boolean seguirJugando() {
        return intentos > 0 && !haAdivinado;
    }

    public int realizarIntento(int numero) {
        intentos--;
        int resultado = new Integer(secreto).compareTo(numero);
        if (resultado == 0) {
            haAdivinado = true;
        }

        char[] arr = new char[] {'h','o','l','a'};
        String s = new String(arr);
        "hola".length(); // len("hola")
        System.out.println("s = " + s);

        return resultado;
    }
}
