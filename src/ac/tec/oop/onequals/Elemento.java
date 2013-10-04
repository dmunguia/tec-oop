package ac.tec.oop.onequals;

public class Elemento {
    private int id;
    private String etiqueta;

    public Elemento(int id, String etiqueta) {
        this.id = id;
        this.etiqueta = etiqueta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elemento elemento = (Elemento) o;

        if (id != elemento.id) return false;
        if (etiqueta != null ? !etiqueta.equals(elemento.etiqueta) : elemento.etiqueta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (etiqueta != null ? etiqueta.hashCode() : 0);
        return result;
    }
}
