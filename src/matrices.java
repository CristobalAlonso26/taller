import java.util.Scanner;

public class matrices {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        menu();
    }


    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }

    private static void mostrarOpciones() {
        System.out.println("\n============================" );
        System.out.println("            MENÚ              " );
        System.out.println("      Algunas cosillas        " );
        System.out.println("============================= " );
        System.out.println("    [1] Agregar               " );
        System.out.println("    [2] Eliminar              " );
        System.out.println("    [3] Listar                " );
        System.out.println("    [4] Buscar                " );
        System.out.println("    [5] Salir                 " );
        System.out.println("============================= " );
        System.out.print("      Opcion: ");
    }
    private static int obtenerOpcion(){
        return Integer.parseInt(scanner.nextLine());
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> System.out.println(" 1");
            case 2 -> System.out.println(" 2");
            case 3 -> System.out.println(" 3");
            case 4 -> System.out.println(" 4");
            case 5 -> System.out.println("  Hasta luego...");
            default -> System.out.println(" Opción invalida....");
        }
    }
    boolean validarDimensiones(int filas, int cols) {
        if (filas >= 0 && cols >= 0) {
            return true;
        } else {
            System.out.println("número de filas o columnas no valido, recuerde que sean números positivos");
            return false;
        }
    }
    
}
