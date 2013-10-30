package ac.tec.oop.claseabstracta;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        TanqueGasolina tg = new TanqueGasolina();
        FuenteEnergia fe = tg;

        v.setFuenteEnergia(fe);
    }
}
