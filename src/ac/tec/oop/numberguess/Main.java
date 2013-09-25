package ac.tec.oop.numberguess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: diegomunguia
 */
public class Main {

    public static final String INGRESE_UN_NÚMERO = "Ingrese un número: ";
    public static final String FELICITACIONES_HA_ADIVINADO = "Felicitaciones, ha adivinado";
    public static final String SU_NÚMERO_ES_MENOR_AL_SECRETO = "Su número es menor al secreto";
    public static final String SU_NÚMERO_ES_MAYOR_AL_SECRETO = "Su número es mayor al secreto";

    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(
                System.in));

        boolean jugar = true;

        while (jugar) {
            Juego juego = new Juego();

            while (juego.seguirJugando()) {
                System.out.println(INGRESE_UN_NÚMERO);
                String numeroDelUsuario = stdin.readLine();
                int resultado = juego.realizarIntento(
                        Integer.valueOf(numeroDelUsuario));

                if (resultado == 0) {
                    System.out.println(FELICITACIONES_HA_ADIVINADO);

                    System.out.println("Desea jugar otra vez (s/n)");
                    String respuesta = stdin.readLine();
                    if (respuesta.equals("n")) {
                        jugar = false;
                    }
                } else if (resultado == -1) {
                    System.out.println(SU_NÚMERO_ES_MENOR_AL_SECRETO);
                } else if (resultado == 1) {
                    System.out.println(SU_NÚMERO_ES_MAYOR_AL_SECRETO);
                }


            }
        }
    }
}
