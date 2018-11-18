import java.util.Scanner;

/**
 *
 * @author aveng
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int h1, h2, edad;
        System.out.println("Ingrese su edad:");
        h1 = leer.nextInt();
        System.out.println("Ingrese su edad:");
        h2 = leer.nextInt();
        if (h1 > h2) {
            System.out.println("La edad del mayor es: " + h1);
            edad = h1-h2;
            System.out.println("La diferencia que existe es de: "+edad);
        } else {
            edad = h2-h1;
            System.out.println("La edad del mayor es: " + h2);
            System.out.println("La diferencia que existe es de: "+edad);
        }
    }
}
