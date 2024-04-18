package Ejer3;
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto: " + titulo);
        } else {
            System.out.println("El libro " + titulo + " no está prestado actualmente.");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", prestado=" + prestado +
                '}';
    }
}
