import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("ingrese el numero 1: ");
        numero1 = entrada.nextInt();

        System.out.println("ingrese el numero 2: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("El numero ingresado es igual quye el anterior, ingrese otro: ");
            numero2 = entrada.nextInt();
        }

        System.out.println("ingrese el numero 3: ");
        numero3 = entrada.nextInt();
        if (numero1 == numero3 || numero2 == numero3) {
            System.out.println("El numero ingresado es igual quye el anterior, ingrese otro: ");
            numero3 = entrada.nextInt();
        }

        

    }
}
