package aula01;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		int x = 10;
		double y = 30;
		String texto = "Olá, DevInHouse";
		char caracter = '1';
		final String CONST = "10";
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(texto);
		System.out.println(caracter);
		
		Scanner entrada = new Scanner(System.in);
		
		int mes = entrada.nextInt();
		
		//double numero = entrada.nextDouble();
		
		//System.out.println(numero);
	}

}