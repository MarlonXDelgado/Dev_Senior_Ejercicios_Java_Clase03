import java.util.Scanner;

public class ejercicio8vo {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad en años: ");
        edad = entrada.nextInt();

        if (edad>0 && edad<=5) {
            System.out.println("Usted se encuentra  en la etapa de: Primera infancia");
        }else if (edad>6 && edad<=11) {
            System.out.println("Usted se encuentra  en la etapa de: infancia");
        }else if (edad>12 && edad<=18) {
            System.out.println("Usted se encuentra  en la etapa de: Adolescencia");
        }else if (edad>19 && edad<=26) {
            System.out.println("Usted se encuentra  en la etapa de: Juventud");
        }else if (edad>27 && edad<=59) {
            System.out.println("Usted se encuentra  en la etapa de: Adultez");
        }else{
            System.out.println("Usted se encuentra  en la etapa de: Persona mayor");
        }

        
    }
}
