/*
 * 13.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
 * 
 * e.	Imprima false se o primeiro n�mero � maior que 10 ou o terceiro n�mero for maior que 0,
 *  ou o segundo n�mero mais o quarto n�mero for igual a 0. Caso contr�rio true.
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
