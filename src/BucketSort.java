
import java.util.*;

/**
 *
 * @author aveng
 */
public class BucketSort {

    public static Vector<Integer> sort(Vector<Integer> lista, int inferior, int superior) {
        int rango = (superior - inferior);
        int bucket_size = rango / 10;
        Vector<Vector> listas = new Vector<Vector>();
        for (int i = 0; i < 10; i++) {
            listas.addElement(new Vector<Integer>());
        }
        for (int i = 0; i < lista.size(); i++) {
            int casilla = (lista.elementAt(i) - inferior) / bucket_size;
            Vector<Integer> vCasilla = listas.elementAt(casilla);
            vCasilla.addElement(lista.elementAt(i));
        }
        Vector<Integer> out = new Vector<Integer>();
        for (int i = 0; i < listas.size(); i++) {
            int inf = inferior + (i * bucket_size);
            int sup = inferior + (i * bucket_size) + bucket_size;
            Vector<Integer> tmp = null;
            if (sup - inf == 1 || listas.elementAt(i).size() == 1) {
                tmp = listas.elementAt(i);
            } else {
                tmp = BucketSort.sort(listas.elementAt(i), inf, sup);
            }
            for (int j = 0; j < tmp.size(); j++) {
                out.addElement(tmp.elementAt(j));
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Vector<Integer> lista = new Vector<Integer>();
        for (int i = 0; i < 100; lista.addElement(r.nextInt(100)), i++) {
            System.out.println("Imprimiendo Generados");
        }
        for (int i = 0; i < lista.size(); System.out.println(lista.elementAt(i++)));
        Vector<Integer> resultado = BucketSort.sort(lista, 0, 100);
        System.out.println("Imprimiendo resultados");
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.elementAt(i));
        }
    }

}
