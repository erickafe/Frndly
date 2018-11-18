
import java.util.Random;

/**
 *
 * @author aveng
 */
public class QuickSortClass {

    public static void quicksort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quicksort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quicksort(vector, j + 1, derecha);
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[40];
        Random rnd = new Random();
        System.out.println("Vector Desordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(50);
            System.out.print(numeros[i] + " ");
        }
        QuickSortClass.quicksort(numeros, 0, numeros.length - 1);
        System.out.println("\n Vector Ordenado: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
