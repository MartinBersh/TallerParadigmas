package Ejer1;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaInventario {
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    int option;


    public static void main(String[] args){

        int option;
        do {
            mostrarMenu();
            option = scanner.nextInt();


            switch (option) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    actualizarCantidadProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }


    private static void mostrarMenu() {
        System.out.println("\nGestión de inventario");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Actualizar cantidad de producto");
        System.out.println("4. Mostrar productos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.next();

        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.next();

        System.out.print("Ingrese la cantidad en stock: ");
        int cantidad = scanner.nextInt();


        System.out.print("Ingrese el precio unitario: ");
        double precio = scanner.nextDouble();

        Product product = new Product(codigo, descripcion, cantidad, precio);
        products.add(product);

        System.out.println("Producto agregado exitosamente.");
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese el código del producto a eliminar: ");
        String cod = scanner.next();

        Product product = buscarProducto(cod);
        if (product != null) {
            products.remove(product);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void actualizarCantidadProducto() {
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.next();

        Product product = buscarProducto(codigo);
        if (product != null) {
            System.out.print("Ingrese la nueva cantidad: ");
            int amount = scanner.nextInt();
            scanner.next();

            product.setAmount(amount);
            System.out.println("Cantidad de producto actualizada exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarProductos() {
        if (products.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("\nLista de productos");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private static Product buscarProducto(String codigo) {
        for (Product product : products) {
            if (product.getCod().equals(codigo)) {
                return product;
            }
        }
        return null;
    }
}


