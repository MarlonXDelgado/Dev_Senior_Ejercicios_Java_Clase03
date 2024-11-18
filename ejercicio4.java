import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);
        char letra;

        System.out.println("Ingrese una letra: ");
        letra = entrada.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra que ingresaste está en mayúscula");
        }else{
            System.out.println("La letra que ingresaste está en minúscula");
        }
        entrada.close();
    }
}
