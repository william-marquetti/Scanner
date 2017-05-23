/*
 * 12.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
 *  Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 *  
 * c.	Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false. 
 *  
 */

package exercicios.numero12.itemc;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int resultado;

		System.out.println("Digite o primero numero");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = scanner.nextInt();

		System.out.println("Digite o terceiro numero");
		numero3 = scanner.nextInt();

		resultado = (int) ((numero1 * numero3) + (Math.pow(numero2, 3)));

		if ( ( resultado > 10 ) || ( resultado > 1) ) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

		scanner.close();
	}
}
