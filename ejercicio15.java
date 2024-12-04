import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("El numero es negativo");
            }else if (numero > 0){
                System.out.println("El numero es positivo");
            }
        } while (numero != 0);

        entrada.close();
    }
}
