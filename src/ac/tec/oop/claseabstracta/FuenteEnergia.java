package ac.tec.oop.claseabstracta;

public abstract class FuenteEnergia {

    private boolean removible;

    public boolean isRemovible() {
        return removible;
    }

    public void setRemovible(boolean removible) {
        this.removible = removible;
    }

    public abstract boolean tieneEnergia();

}
