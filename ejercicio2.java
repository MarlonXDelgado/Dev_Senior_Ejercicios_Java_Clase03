import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ejercicio2 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        int numero1,numero2,numero3;
        ArrayList<Integer> numeros = new ArrayList<>();


        System.out.println("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        numeros.add(numero1);
        System.out.println("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        numeros.add(numero2);
        System.out.println("Ingrese el tercer número: ");
        numero3 = scanner.nextInt();
        numeros.add(numero3);

        int numeromayor = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
          
            if (numeros.get(i) > numeromayor) {
                numeromayor = numeros.get(i);
            }
        }
        System.out.println("El numero mas grande es: " + numeromayor);
    }
}
