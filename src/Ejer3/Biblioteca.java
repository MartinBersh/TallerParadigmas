package Ejer3;
import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    private List<Libro> inventario;

    public SistemaBiblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.add(libro);
    }

    public void buscarLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: " + libro);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("Libro no encontrado para préstamo: " + titulo);
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("Libro no encontrado para devolución: " + titulo);
    }
}
