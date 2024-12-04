import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo impar para el tamaño del diamante: ");
        int n = scanner.nextInt();

        if (n <= 0 || n % 2 == 0) {
            System.out.println("El número debe ser un entero positivo impar.");
        } else {
            imprimirDiamante(n);
        }

        scanner.close();
    }

    public static void imprimirDiamante(int n) {
        int mitad = n / 2;

        for (int i = 0; i <= mitad; i++) {
            imprimirLinea(n, i);
        }

        for (int i = mitad - 1; i >= 0; i--) {
            imprimirLinea(n, i);
        }
    }

    public static void imprimirLinea(int n, int i) {

        int espacios = n / 2 - i;
        int asteriscos = 2 * i + 1;

        for (int j = 0; j < espacios; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < asteriscos; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

