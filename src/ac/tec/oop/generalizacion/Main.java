package ac.tec.oop.generalizacion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.setCapacidad(5000);
        Terrestre b = new Bicicleta();
        b.setCapacidad(1);

        int cap = b.getCapacidad();
        assert cap == 1;

        Class c1 = v.getClass();
        Class c2 = b.getClass();

        System.out.println("c1.getName() = " + c1.getName());
        System.out.println("c2.getName() = " + c2.getName());
        System.out.println("c1.equals(c2) = " + c1.equals(c2));

        boolean prueba1 = b instanceof Vehiculo; // false
        boolean prueba2 = b instanceof Terrestre; // false
        boolean prueba3 = b instanceof Bicicleta; // true

        Terrestre t = new Terrestre();
        boolean prueba4 = t instanceof Bicicleta;
        boolean prueba5 = t instanceof Vehiculo;

        System.out.println("prueba1 = " + prueba1);
        System.out.println("prueba2 = " + prueba2);
        System.out.println("prueba3 = " + prueba3);
        System.out.println("prueba4 = " + prueba4);
        System.out.println("prueba5 = " + prueba5);

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(v);
        vehiculos.add(b);
        vehiculos.add(t);

        Terrestre bicicletaTerrestre = new Bicicleta();
        Terrestre terrestreTerrestre = new Terrestre();
        Vehiculo bicicletaVehiculo = bicicletaTerrestre;
        Bicicleta bicletaBicicleta = (Bicicleta) bicicletaTerrestre;
        Bicicleta terrestreBicicleta = (Bicicleta) terrestreTerrestre;

        short s = 1;
        int i = s;
        short s2 = (short) i;

    }
}
