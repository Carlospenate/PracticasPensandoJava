package libro.cap01;

import java.util.Scanner;

public class HolaMundoNombre2 {

	public static void main(String args[]) {
		
		//esta clase permite leer datos por teclado
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//Mensaje para el usuario
		System.out.print("Ingrese su nombre edad altura: ");
		
		//Leemos el nombre
		String nom = scanner.nextLine();
		
		//leemos la edad
		int edad = scanner.nextInt();
		
		//leemos la altura
		double altura = scanner.nextDouble();
		
		//mostramos los datos por consola
		System.out.println("Nombre: " + nom
							+ " Edad: " + edad
							+ " Altura " + altura);
	}
}
