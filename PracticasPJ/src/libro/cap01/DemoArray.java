package libro.cap01;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args){
	//defino un array de 10 enteros
	int arr[] = new int[10];
	
	//el scanner para leer por teclado...
	Scanner scanner = new Scanner(System.in);
	
	//leo el primer valor
	System.out.print("Ingrese un valor (0 => 200fin) : ");
	int v = scanner.nextInt();
	
	int i= 0;
	
	//MIentras v sea distinto de cero and i sea menor que 10
	while(v != 0 && i<10)
	{
		//asigna v en arr[] y luego incrementa el valor de i
		arr[++i]=v;
		
		//leo el siguiente valor
		System.out.print("Ingrese el siguiente valor (0 => fin): ");
		v = scanner.nextInt();
	}
	
	//recorro el array mostrando su contenido
	for( int j=0; j<i; j++)
	{
		System.out.println(arr[j]);
	}
}
}