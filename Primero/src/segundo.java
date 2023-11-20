
import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamano = scanner.nextInt();

        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        int[] arregloResultado = new int[tamano];

        System.out.println("Ingrese elementos para el primer arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese elementos para el segundo arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamano; i++) {
            arregloResultado[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.println("\nArreglo 1:");
        mostrarArreglo(arreglo1);

        System.out.println("\nArreglo 2:");
        mostrarArreglo(arreglo2);

        System.out.println("\nArreglo Resultante:");
        mostrarArreglo(arregloResultado);
    }

    private static void mostrarArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}