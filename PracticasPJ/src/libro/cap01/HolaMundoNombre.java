package libro.cap01;

import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String args[]) {
		
		//esta clase permite leer datos por teclado
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//Mensaje para el usuario
		System.out.print("Ingrese su nombre: ");
		
		//Leemos un valor entero por teclado
		String nom = scanner.nextLine();
		
		//mostramos un mensaje y luego el valor leído
		System.out.println("Hola Mundo: " + nom);
	}
}
