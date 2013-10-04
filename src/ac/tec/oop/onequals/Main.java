package ac.tec.oop.onequals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Elemento> elementos = new ArrayList<Elemento>();
        elementos.add(new Elemento(1, "1"));
        elementos.add(new Elemento(2, "2"));
        elementos.add(new Elemento(3, "3"));
        elementos.add(new Elemento(4, "4"));
        elementos.add(new Elemento(5, "5"));
        elementos.add(new Elemento(6, "6"));

        Elemento elemento = new Elemento(2, "2");
        System.out.println("elementos.contains(elemento) = " + elementos.contains(elemento));
    }
}
