import java.util.Scanner;
import java.util.Random;

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
        System.out.println("      matrices        " );
        System.out.println("============================= " );
        System.out.println("    [1] crear matriz             " );
        System.out.println("    [2] llenar matriz             " );
        System.out.println("    [3] mostrar fila             " );
        System.out.println("    [4] verificar matriz cero            " );
        System.out.println("    [5] Salir                 " );
        System.out.println("============================= " );
        System.out.print("      Opcion: ");
    }
    private static int obtenerOpcion(){
        return Integer.parseInt(scanner.nextLine());
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> crearMatriz();
            case 2 -> llenarMatriz();
            case 3 -> mostrarFila(,preguntarFila());
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

    static int [ ][ ]crearMatriz(int filas, int cols){
        int[][] matriz = new int[filas][cols];
        System.out.println("Introduce los valores de la matriz :");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j<cols; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }
    static int [][]llenarMatriz(int matriz [][] ) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }

    static void mostrarFila(int matriz[ ][ ],int fila) {
        for (int i = 0; i < matriz[fila].length; i++) {
            System.out.println(matriz[fila][i] + " ");
        }
    }
    static int preguntarFila(){
        System.out.println("ingrese el numero de fila que desea ver");
        int fila = scanner.nextInt();
        return fila;
    }

    boolean matrizCero(int matriz[][]){
        int contador = 0;
        for (int i=0;i< matriz.length;i++){
            for(int j=0;i< matriz[0].length;i++){

            }
        }
    }
}
