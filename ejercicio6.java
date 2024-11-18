import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.printf("%nEl numer:o %d que ingresaste, si es divisible por 7%n", numero);
        } else{
            System.out.printf("%nEl numero: %d que ingresaste, no es divisible por 7%n", numero);
        }

        entrada.close();
    }
}
