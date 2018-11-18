import java.util.Scanner;

public class MaximoComunDiv {

	public static void main(String[] args) {
		//pide al usuario que ingrese 2 numeros
		
		Scanner scan = new Scanner (System.in);
		System.out.println("ingrese el primer numero: ");
		int num1 = scan.nextInt();
		System.out.println("ingrese el segundo numero: ");
		int num2 = scan.nextInt();
		
		//seleccione el mayor y el meenor para asignrlo
		int a= Math.max(num1, num2);
		int b = Math.min(num1, num2);
		int res; //guarda el resultado
		
		do {
			res= b;
			b=a%b;
			
		}while(b!=0);
		System.out.println("El M.C.D entre " +num1+ " y "+num2+ " es: "+ res);
		
	}

}