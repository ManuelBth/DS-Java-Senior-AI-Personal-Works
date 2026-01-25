import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1: 
                    break;
                case 2:
                    crearDesarrollador(scanner);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }

    public static void mostrarMenu(){
        System.out.println("\n=== MENÚ DE EMPLEADOS ===");
        System.out.println("1. Crear Gerente");
        System.out.println("2. Crear Desarrollador");
        System.out.println("3. Salir");
        System.out.println("========================");
    }

    public static void crearGerente(Scanner scanner) {
        System.out.println("\n--- Crear Gerente ---");
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Ingrese el salario base: ");
        double salario = scanner.nextDouble();
        
        System.out.print("Ingrese el bono actual: ");
        double bono = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        
        Gerente gerente = new Gerente(nombre, id, salario, bono);
        
        System.out.println("\n✓ Gerente creado exitosamente:");
        gerente.mostrarDetalles();
        System.out.println("Salario total: " + gerente.calcularSalario());
        gerente.trabajar();
    }

    public static void crearDesarrollador(Scanner scanner) {
        System.out.println("\n--- Crear Desarrollador ---");
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Ingrese el salario base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese el lenguaje principal: ");
        String lenguajePrincipal = scanner.nextLine();
        
        Desarrollador desarrollador = new Desarrollador(nombre, id, salarioBase, lenguajePrincipal);
        
        System.out.println("\n✓ Desarrollador creado exitosamente:");
        desarrollador.mostrarDetalles();
        System.out.println("Salario total: " + desarrollador.calcularSalario());
        desarrollador.trabajar();
    }
}
