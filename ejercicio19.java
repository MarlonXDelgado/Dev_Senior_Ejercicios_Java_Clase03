import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int a = 0, b = 1, numero;

        System.out.print("Ingrese el número de términos de la sucesión de Fibonacci que desea ver: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            int siguiente = a + b; 
            a = b;                
            b = siguiente;
        }
        System.out.println();
        entrada.close();
    }
}
