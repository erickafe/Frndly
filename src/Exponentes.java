
import java.util.Scanner;

public class Exponentes {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, base;
        System.out.println("Ingrese la base: ");
        base = tec.nextInt();
        System.out.println("Ingrese el exponente");
        n = tec.nextInt();
        int resultado = (int) Math.pow(base, n);
        System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
    }
}
