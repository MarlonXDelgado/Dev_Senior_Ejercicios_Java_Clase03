import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int exit;
        String eleccion1, eleccion2;
        boolean salida = false;

        do {
            System.out.printf("%nEleccion de jugada:%n%n");
            System.out.println("Para elegir piedra presione la tecla p");
            System.out.println("Para elegir papel presione la tecla l");
            System.out.println("Para elegir tijera presione la tecla t");
            System.out.printf("%nCual opcion desea elegir jugador 1:%n");
            eleccion1 = entrada.nextLine();
            System.out.printf("Cual opcion desea elegir jugador 2:%n");
            eleccion2 = entrada.nextLine();
            ganador(eleccion1, eleccion2);
            System.out.printf("%n¿Desea seguir jugando?:%n%n1. SI%n2. NO%n");
            exit = entrada.nextInt();
            entrada.nextLine();
            if (exit == 2) {
                System.out.println("Hasta pronto!");
                salida = true;
            }
            
        } while (!salida);
        entrada.close();;
    }
    public static void ganador (String eleccion1, String eleccion2){
        if (eleccion1.equals(eleccion2)) {
            System.out.println("Ambos jugadores empataron!!!");
        }else if (eleccion1.equals("p") && eleccion2.equals("t")) {
            System.out.println("El ganador es el jugador 1");
        }else if (eleccion1.equals("t") && eleccion2.equals("l")) {
            System.out.println("El ganador es el jugador 1");
        }else if (eleccion1.equals("l") && eleccion2.equals("p")) {
            System.out.println("El ganador es el jugador 1");
        }else if (eleccion2.equals("p") && eleccion1.equals("t")) {
            System.out.println("El ganador es el jugador 2");
        }else if (eleccion2.equals("t") && eleccion1.equals("l")) {
            System.out.println("El ganador es el jugador 2");
        }else if (eleccion2.equals("l") && eleccion1.equals("p")) {
            System.out.println("El ganador es el jugador 2");
        }else{
            System.out.println("Opcion invalida...");
        }
    }

    public static void verificarEleccion (String eleccion){
        if (eleccion.equals("p") || eleccion.equals("l") || eleccion.equals("t")) {
            System.out.println("Seleccionaste: " + eleccion);
        }else{
            System.out.println("Seleccion inválida");
        }
    }
}
