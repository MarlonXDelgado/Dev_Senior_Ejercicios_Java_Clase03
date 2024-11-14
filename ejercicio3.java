import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        if (numero%2 == 0) {
            System.out.println("El numero ingresado es par");
        } else{
            System.out.println("El numero ingresado no es par");
        }
    }
}
