import java.util.ArrayList;
import java.util.Scanner;

public class Calculo {

    static ArrayList datos=new ArrayList();
    static Scanner lectura=new Scanner (System.in);
    static String material, botella;
    static int cantidad;
    static float precio, total,totalCI;
    static double iva=1.19;
    
    
    public static void ingDato(){
        System.out.println("Material");
        material=lectura.next();
        
        System.out.println("Botella");
        botella=lectura.next();
        
        System.out.println("Cantidad");
        cantidad=lectura.nextInt();
        
        System.out.println("Precio");
        precio=lectura.nextInt();
        
        datos.add(material);
        datos.add(botella);
        datos.add(cantidad);
        datos.add(precio);
        for (int pos=0;pos<datos.size();pos++){
        
         
        cantidad=Integer.parseInt(datos.get (pos+1) .toString());
        precio=(float) Double.parseDouble(datos.get (+2).toString());
        

        float s;
            s = (float) (cantidad*precio * iva);
        
        System.out.println("Material\t"+datos.get (pos));
        System.out.println("Botella\t"+datos.get (pos+1)+"\t");
        System.out.println("Cantidad\t"+datos.get (pos+2)+"\t");
        System.out.println("Precio\t"+datos.get (pos+3)+"\t");
        System.out.println("Total sin iva\t"+(cantidad*precio));
        System.out.println("Total con iva\t"+s );
    }
}


    public static void main(String[] args) {
        int cal;
        do{
            System.out.println("1.Ingresar datos");
            System.out.println("2.Mostrar datos");
            System.out.println("3. Salir del programa");
            cal=lectura.nextInt();
            switch(cal){
                case 1:
                    ingDato();
                    break;
                case 2:
                    ingDato();
                    break;
                case 3:
                    break;
               
                    
                    
            }
        }while(cal!=3);    
     }
       
     
    
    
}
