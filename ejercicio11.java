import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("ingrese el numero 1: ");
        numero1 = entrada.nextInt();

        System.out.println("ingrese el numero 2: ");
        numero2 = entrada.nextInt();

        System.out.println("ingrese el numero 3: ");
        numero3 = entrada.nextInt();

        ordenarYMostrar(numero1, numero2, numero3);


        entrada.close();

    }
    public static void ordenarYMostrar(int num1, int num2, int num3) {
        int menor, medio, mayor;

        // Encuentra el menor
        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        // Encuentra el mayor
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Encuentra el medio
        medio = num1 + num2 + num3 - menor - mayor;

        // Imprimir de menor a mayor
        System.out.println("Los numeros reordenados de menor a mayor son: " + menor + ", " + medio + ", " + mayor);
    }
}
