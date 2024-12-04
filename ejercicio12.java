import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int kilogramos;

        System.out.println("Ingrese la cantidad de kilogramos que pesa la sandia: ");
        kilogramos = entrada.nextInt();

        if (kilogramos%2 == 0) {
            System.out.println("SI");
        }else{
            System.out.println( "NO");
        }
        entrada.close();
    }
}
