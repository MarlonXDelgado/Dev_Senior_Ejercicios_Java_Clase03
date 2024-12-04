import java.util.ArrayList;

public class ejercicio20 {
    public static void main(String[] args) {

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                if ((fila + columna)%2 == 0 ) {
                    System.out.print("| B ");
                }else{
                    System.out.print("| N ");
                }
            }
            System.out.println("|");
        }
    }
}
