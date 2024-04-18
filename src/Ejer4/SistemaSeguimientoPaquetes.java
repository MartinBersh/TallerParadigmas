package Ejer4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaSeguimientoPaquetes {

    private List<Paquete> paquetes;
    private Scanner scanner;

    public SistemaSeguimientoPaquetes() {
        this.paquetes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.next();

            switch (opcion) {
                case 1:
                    listarPaquetes();
                    break;
                case 2:
                    rastrearPaquete();
                    break;
                case 3:
                    recibirNotificaciones();
                    break;
                case 4:
                    visualizarHistorial();
                    break;
                case 5:
                    agregarPaquete();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("=== Sistema de Seguimiento de Entregas de Paquetes ===");
        System.out.println("1. Listar Paquetes");
        System.out.println("2. Rastrear Paquete");
        System.out.println("3. Recibir Notificaciones");
        System.out.println("4. Visualizar Historial de Seguimiento");
        System.out.println("5. Agregar Paquete");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void listarPaquetes() {
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes registrados.");
        } else {
            System.out.println("Lista de Paquetes:");
            for (Paquete paquete : paquetes) {
                System.out.println(paquete);
            }
        }
    }

    private void rastrearPaquete() {
        System.out.print("Ingrese el ID del paquete a rastrear: ");
        String id = scanner.nextLine();
        Paquete paquete = buscarPaquete(id);
        if (paquete != null) {
            System.out.println("Estado actual del paquete:");
            System.out.println(paquete);
        } else {
            System.out.println("No se encontró ningún paquete con el ID especificado.");
        }
    }

    private void recibirNotificaciones() {
        System.out.println("Recibiendo notificaciones en tiempo real...");
    }

    private void visualizarHistorial() {
        System.out.print("Ingrese el ID del paquete para visualizar el historial: ");
        String id = scanner.nextLine();
        Paquete paquete = buscarPaquete(id);
        if (paquete != null) {
            System.out.println("Historial de seguimiento del paquete " + id + ":");
        } else {
            System.out.println("No se encontró ningún paquete con el ID especificado.");
        }
    }

    private void agregarPaquete() {
        System.out.print("Ingrese el ID del nuevo paquete: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el estado inicial del paquete: ");
        String estado = scanner.nextLine();
        System.out.print("Ingrese la ubicación inicial del paquete: ");
        String ubicacion = scanner.nextLine();

        Paquete nuevoPaquete = new Paquete(id, estado, ubicacion);
        paquetes.add(nuevoPaquete);
        System.out.println("Nuevo paquete agregado correctamente.");
    }

    private Paquete buscarPaquete(String id) {
        for (Paquete paquete : paquetes) {
            if (paquete.getId().equals(id)) {
                return paquete;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        SistemaSeguimientoPaquetes sistema = new SistemaSeguimientoPaquetes();
        sistema.ejecutar();
    }
}