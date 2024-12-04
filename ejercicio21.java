import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        double conversionFinal, millas, kilometros;
        int menu;

        System.out.println("¿Que conversion desea hacer?: ");
        System.out.println("1. Millas a kilometros");
        System.out.println("2. kilometros a Millas");

        menu = entrada.nextInt();

        if (menu == 1) {
            System.out.println("Ingese la cantidad de Millas que desea pasar a kilometros");
            millas =  entrada.nextInt();
            conversionFinal = millas * 1.60934;
            System.out.printf("%n%.2f Millas son aproximadamente: %f ",millas,conversionFinal);
        } else if (menu == 2) {
            System.out.println("Ingese la cantidad de kilometros que desea pasar a Millas");
            kilometros =  entrada.nextInt();
            conversionFinal = kilometros * 0.621371;
            System.out.printf("%n%.2f Kilometros son aproximadamente: %f Millas",kilometros,conversionFinal);
        }else{
            System.err.println("Ingrese una opción válida...");
        }

        entrada.close();
    }
}
