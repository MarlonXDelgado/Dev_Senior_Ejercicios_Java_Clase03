import java.util.Scanner;

public class ejercicio9no {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int unidades;

        System.out.println("Ingrese la cantidad de camisas a comprar: ");
        unidades = entrada.nextInt();

        if (unidades >= 1 && unidades <= 50) {
            System.out.println("La unidad le sale a $50.000");
        }else if (unidades > 50 && unidades <= 100) {
            System.out.println("La unidad le sale a $45.000");
        }else if(unidades > 100 && unidades <= 150) {
            System.out.println("La unidad le sale a $40.000");
        }else if(unidades > 150 && unidades <= 200) {
            System.out.println("La unidad le sale a $50.000");
        }else if (unidades > 200) {
            System.out.println("La unidad le sale a $25.000");
        }
    }
}
