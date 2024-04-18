package Ejer2;
import java.util.*;
import java.util.stream.Collectors;

public class SistemaTareas {

    private static List<Tarea> tareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    marcarTareaCompletada();
                    break;
                case 3:
                    mostrarTareas();
                    break;
                case 4:
                    mostrarTareasCompletadas();
                    break;
                case 5:
                    mostrarTareasPendientes();
                    break;
                case 0:
                    break;
                default:
                    System.out.println(" no válido");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n**Sistema de Gestión de Tareas Pendientes**");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Marcar tarea como completada");
        System.out.println("3. Mostrar todas las tareas");
        System.out.println("4. Mostrar tareas completadas");
        System.out.println("5. Mostrar tareas pendientes");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarTarea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un id para la tarea");
        int id = scanner.nextInt();

        System.out.print("Ingrese la descripción de la tarea: ");
        String descripcion = scanner.next();

        System.out.print("¿Es una tarea urgente? (si/no): ");
        String urgenteStr = scanner.next();
        boolean urgente = urgenteStr.equalsIgnoreCase("si");

        Tarea tarea = new Tarea(id, descripcion, urgente);
        tareas.add(tarea);

        System.out.println("Tarea agregada exitosamente.");
    }

    private static void marcarTareaCompletada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID de la tarea a marcar como completada: ");
        int id = scanner.nextInt();

        Optional<Tarea> tareaOpcional = tareas.stream()
                .filter(tarea -> tarea.getId() == id)
                .findFirst();

        if (tareaOpcional.isPresent()) {
            Tarea tarea = tareaOpcional.get();
            tarea.setCompletada(true);
            System.out.println("Tarea marcada como completada exitosamente.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void mostrarTareas() {
        System.out.println("\nLista de tareas");
        tareas.forEach(System.out::println);
    }

    private static void mostrarTareasCompletadas() {
        System.out.println("\nLista de tareas completadas");
        tareas.stream()
                .filter(Tarea::isCompletada)
                .forEach(System.out::println);
    }

    private static void mostrarTareasPendientes() {
        System.out.println("\nLista de tareas pendientes");
        tareas.stream()
                .filter(tarea -> !tarea.isCompletada())
                .forEach(System.out::println);
    }
}
