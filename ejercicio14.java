import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var numero = 0;
        do{
            System.out.println("Ingrese el número al que desea saber su cubo: ");
            numero = entrada.nextInt();
            numero *= numero * numero;
            System.out.println(numero);
        }
        
        while (numero >= 0);
    }
}
