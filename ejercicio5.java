import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        char[] vocales = {'a','e','i','o','u'};
        char letra;
        boolean esVocal = false;

        System.out.println("Ingrese una letra: ");
        letra = entrada.next().charAt(0);

        for (int i = 0; i < vocales.length; i++) {
            if(vocales[i] == letra) {
                System.out.println("La letra ingresada es una vocal.");
                esVocal = true;
                break;
            }           
        }

        if (!esVocal) {
            System.out.println("La letra ingresada es una consonante.");
        }

        entrada.close();
    }
}
