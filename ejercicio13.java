import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int llegada []= new int[3];

        for (int i = 0; i < llegada.length; i++) {
            System.out.println("Ingrese el numero del hermano que llegó: ");
            llegada[i] = entrada.nextInt();
        }
        if (llegada[2] == 1) {
            System.out.println("El hermano que llegó tarde fue el mayor " );
        }else if (llegada[2] == 2) {
            System.out.println("El hermano que llegó tarde fue el del medio " );
        }else{
            System.out.println("El hermano que llegó tarde fue el menor " );
        }
        

        entrada.close();
    }
}
