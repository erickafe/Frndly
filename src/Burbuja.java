
import java.io.*;

public class Burbuja {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        /*Leer por teclado*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        /*Tamaño del arreglo*/
        System.out.println("\n Ingrese numero de datos: ");
        int tam = Integer.parseInt(in.readLine());
        /*Creacion del arreglo*/
        int arr[] = new int[tam];
        System.out.println();
        /*Lectura del arreglo*/
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j += 1;
            System.out.println("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        Burbuja(arr);
    }

    /*Aplicacion del metodo*/
    static void Burbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
    }
}
