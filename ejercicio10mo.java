import java.util.Scanner;

public class ejercicio10mo {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int mes;

        System.out.println("Ingrese el numero del mes que desea averiguar su duracion en dias, debe ser entre 1 y 12: ");
        mes = entrada.nextInt();

        switch (mes) {

            case 1:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;
            case 2:
                System.out.println("El mes que seleccionaste tiene: 29 dias");
                break;
            case 3:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;
            case 4:
                System.out.println("El mes que seleccionaste tiene: 30 dias");
                break;
            case 5:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;
            case 6:
                System.out.println("El mes que seleccionaste tiene: 30 dias");
                break;
            case 7:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;
            case 8:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;
            case 9:
                System.out.println("El mes que seleccionaste tiene: 30 dias");
                break;
            case 10:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;
            case 11:
                System.out.println("El mes que seleccionaste tiene: 30 dias");
                break;
            case 12:
                System.out.println("El mes que seleccionaste tiene: 31 dias");
                break;

            default:
                System.out.println("El número ingresado es incorrecto, debe ser entre 1 y 12");
                break;
        }
        entrada.close();
    }
}
