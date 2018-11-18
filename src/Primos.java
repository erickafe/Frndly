
import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, n = 4, cont = 2;
        String cad = "";
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        if (num > 2) {
            cad = "2 - 3";
            while (cont < num) {
                i = 2;
                while (i <= n) {
                    if (i == n) {
                        cad = cad + " - " + n;
                        cont = cont + 1;
                    } else {
                        if (n % i == 0) {
                            i = n;
                        }
                    }
                    i = i + 1;
                }
                n = n + 1;
            }
            System.out.println(cad);
        } else {
            if (num > 0) {
                if (num == 1) {
                    System.out.println("Es primo 2");
                } else {
                    System.out.println("Es primo 2, 3");
                }
            } else {
                System.out.println("Ingresa numeros positivos");
            }
        }
    }
}
