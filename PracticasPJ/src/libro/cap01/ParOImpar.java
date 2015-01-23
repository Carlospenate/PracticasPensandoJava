/**
 * 
 */
package libro.cap01;

import java.util.Scanner;

/**
 * @author Cesar
 *
 */
public class ParOImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un valor: ");
		int v = scanner.nextInt();
		
		//obtenemos el reesto de dividir v por 2
		int resto = v % 2;
		
		//para preguntar por igual utilizamos ==
		if (resto == 0) {
			System.out.println(v + " es Par");
		}
		else{
			System.out.println(v + " es Impar");
		}

	}

}
