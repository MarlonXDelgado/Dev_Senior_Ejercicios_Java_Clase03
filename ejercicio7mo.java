import java.util.Scanner;

public class ejercicio7mo {
    public static void main(String[] args) {
        
        var entrada = new Scanner (System.in);
        int lado1, lado2, lado3;

        System.out.println("Ingrese la longitud del lado 1");
        lado1 = entrada.nextInt();

        System.out.println("Ingrese la longitud del lado 2");
        lado2 = entrada.nextInt();

        System.out.println("Ingrese la longitud del lado 3");
        lado3 = entrada.nextInt();

        if (desigualdadTriangular(lado1, lado2, lado3)) {
                    System.out.println("Si se puede crear con triangulo con esas longitudes");
                }else{
                    System.out.println("No se puede crear con triangulo con esas longitudes");
                }
        entrada.close();
    }
        
    private static boolean desigualdadTriangular(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);     
    }

}
