package Ejer2;

public class Tarea {
    private int id;
    private String descripcion;
    private boolean urgente;
    private boolean completada;

    public Tarea(int id, String descripcion, boolean urgente) {
        this.id = id;
        this.descripcion = descripcion;
        this.urgente = urgente;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", urgente=" + urgente +
                ", completada=" + completada +
                '}';
    }
}