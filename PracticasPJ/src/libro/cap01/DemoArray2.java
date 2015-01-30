package libro.cap01;

import java.util.Scanner;

public class DemoArray2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dias[] = {"Lunes", "Martes", "Miercoles", "jueves", "Viernes", 
				"Sabado", "Domingo"	};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un día de la semana (numero):");
		int v = scanner.nextInt();
		
		if (v <= dias.length) {
			//recordemos que los arrays se numeran desde cero
			System.out.println(dias[v-1] );
		}
		else
		{
			System.out.println("Dia incorrecto");
		}

	}

}
