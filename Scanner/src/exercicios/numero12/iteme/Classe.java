/*
 * 12.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
 *  Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 *   * 
 * e.	Imprima true se o resultado � m�ltiplo de 10, caso contr�rio false. 
 */
package exercicios.numero12.iteme;

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

		if ( ( resultado % 10 == 0 ) ) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

		scanner.close();
	}

}
