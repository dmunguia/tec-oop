package ac.tec.oop.colecciones;

/**
 * User: diegomunguia
 */
public class Persona implements Comparable<Persona> {
    private String cedula;
    private String nombre;

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona persona) {
        return this.cedula.compareTo(persona.getCedula());
    }
}
