package programa;

public class Medicamento {

    private String nombre;
    private int cantidadCapsulas;
    private int diasTratamiento;

    //Constructor con todos los parámetros
    public Medicamento(String nombre, int cantidadCapsulas, int diasTratamiento) {
        this.nombre = nombre;
        this.cantidadCapsulas = cantidadCapsulas;
        this.diasTratamiento = diasTratamiento;
    }

    //Constructor vacío
    public Medicamento() {
    }

    // Métodos getters y setters por si queremos acceder a los atributos y modificarlos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCapsulas() {
        return cantidadCapsulas;
    }

    public void setCantidadCapsulas(int cantidadCapsulas) {
        if (cantidadCapsulas > 0) {
            this.cantidadCapsulas = cantidadCapsulas;
        }
    }

    public int getDiasTratamiento() {
        return diasTratamiento;
    }

    public void setDiasTratamiento(int diasTratamiento) {
        if (diasTratamiento > 0) {
            this.diasTratamiento = diasTratamiento;
        }
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", cantidadCapsulas=" + cantidadCapsulas +
                ", diasTratamiento=" + diasTratamiento +
                '}';
    }
}