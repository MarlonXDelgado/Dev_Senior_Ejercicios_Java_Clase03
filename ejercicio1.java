import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        var numero = scanner.nextFloat();

        if(numero < 0){
            System.out.printf("El número: %.0f, es un número negativo.", numero);
        }
        if(numero == 0){
            System.out.printf("El número es %.0f.", numero);
        } if(numero > 0){
            System.out.printf("El número: %.0f, es un número positivo.", numero);
        }
        
        scanner.close();
    }

}