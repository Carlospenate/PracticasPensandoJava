package libro.cap01;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero de la semana (numero) : ");
		int v = scanner.nextInt();
		
		String dia;
		
		switch (v) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
			

		default:
			dia= "Día incorrecto...El valor debe de ser entre 1 y 5";
		}
        System.out.println(dia);
	}

}
