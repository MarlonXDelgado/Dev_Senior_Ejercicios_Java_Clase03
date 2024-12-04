import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        ArrayList <Integer> numerosNegativos = new ArrayList<>();
        int numero;

        do {
            System.out.println("Ingrese un numero negativo: ");
            numero = entrada.nextInt();
            if (numero<0) {
                numerosNegativos.add(numero);
            }
            
        } while (numero <= 0);

        System.out.println("La cantidad de números negativos ingresados fue de: " + numerosNegativos.size());
    }
}
