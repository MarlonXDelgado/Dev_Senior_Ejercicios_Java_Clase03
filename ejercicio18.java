import java.util.ArrayList;

public class ejercicio18 {
    public static void main(String[] args) {
        ArrayList <Double> valoresPositivos = new ArrayList<>();
        ArrayList<Double> valoresNegativos = new ArrayList<>();
        ArrayList<Double> ceros = new ArrayList<>(); 
        double positivos = 0, negativos = 0, mediaPositivos, mediaNegativos;
        
        for (int i = 0; i <= 120; i++) {
            double numero = (int)(Math.random()*241-120);
            if (numero == 0) {
                ceros.add(numero);
            }else if (numero < 0) {
                valoresNegativos.add(numero);
            }else{
                valoresPositivos.add(numero);
            }
        }
        
        for (Double numPositivos : valoresPositivos) {
            positivos += numPositivos; 
        }
        for (Double numNegativos : valoresNegativos) {
            negativos += numNegativos; 
        }
        mediaNegativos = negativos/valoresNegativos.size();
        mediaPositivos = positivos/valoresPositivos.size();

        System.out.println("La cantidad de ceros generada fue de: " + ceros.size());
        System.out.println("La suma de todos los positivos es: " + positivos);
        System.out.printf("La media de los numeros positivos es: %.1f%n", mediaPositivos);
        System.out.println("La suma de todos los negativos es: " + negativos);
        System.out.printf("La media de los numeros negativos es: %.1f%n", mediaNegativos);
    }
}
