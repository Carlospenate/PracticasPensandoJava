/**
 * 
 */
package libro.cap01;

import java.util.Scanner;

/**
 * @author Cesar
 *
 */
public class ParOImpar2 {

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
		
		//utilizando un if-inline
		String mssg = (resto == 0 ) ? " es Par": " es Impar";
		
		//muestro el resultado
		System.out.println( v+ "" +mssg);

	}

}
