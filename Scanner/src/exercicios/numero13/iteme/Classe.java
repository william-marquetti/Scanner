/*
 * 13.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
 * 
 * e.	Imprima false se o primeiro número é maior que 10 ou o terceiro número for maior que 0,
 *  ou o segundo número mais o quarto número for igual a 0. Caso contrário true.
 *  
 *  (
 *  	( numero1 > 10 ) || ( numero3 > 0 ) || ( ( numero2 + numero4 ) == 0 )
 *  
 *  )
 */
package exercicios.numero13.iteme;

import java.util.Scanner;

public class Classe { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;

		System.out.println("Digite o primero numero");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = scanner.nextInt();

		System.out.println("Digite o terceiro numero");
		numero3 = scanner.nextInt();
		
		System.out.println("Digite o quarto numero");
		numero4 = scanner.nextInt();
		
		if ( ( numero1 > 10 ) || ( numero3 > 0 ) || ( ( numero2 + numero4 ) == 0 ) ){
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		
		scanner.close();
	}
}
