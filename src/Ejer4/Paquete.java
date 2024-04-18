package Ejer4;
public class Paquete {
    private String id;
    private String estado;
    private String ubicacion;

    public Paquete(String id, String estado, String ubicacion) {
        this.id = id;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "id='" + id + '\'' +
                ", estado='" + estado + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
